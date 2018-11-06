package com.lizhenchuan.Controller;

import com.lizhenchuan.bean.*;
import com.lizhenchuan.mapper.LendMapper;
import com.lizhenchuan.mapper.MailMapper;
import com.lizhenchuan.service.*;
import com.lizhenchuan.utils.Page;
import org.apache.taglibs.standard.lang.jstl.NullLiteral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class BorrowController {
    @Autowired
    private MailService mailService;
    @Autowired
    private LendService lendService;
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private ReaderService readerService;
    //借书入口
    @RequestMapping("/lendbook")
    public String lendbook(QueryVo vo, Model model) {
        System.out.println(vo);
        Reader selectrid = readerService.selectrid(vo.getRid());
        //用来存放错误信息
        String error;
        //验证用户（信用分）
        Integer rcredit = readerService.selectcredit(vo.getRid());
        if(rcredit>10){
            //验证借书记录 一个人最多一次借5本（借书状态为0）
            Integer integer = lendService.repayStateZero(vo.getRid());
            if(integer<6){
                //是否要预约
                System.out.println(vo);
                model.addAttribute("reader",vo);
                return "appointment";
            }
            error="未还书超过5本，不能再借";
        }else {
            error="信用分不足10分";
        }
        model.addAttribute("error1",error);
        //是否邮寄
        return "error";
    }
    //预约
    @RequestMapping("/isappiontment")
    public String isappiontment(QueryVo vo, Model model) {
        System.out.println(vo);
        //要预约
        Reader reader = readerService.selectrid(vo.getRid());
        System.out.println(reader);
        //用来存放错误信息
        String error;
        //查询库存 调BOOK方法 暂时默认成功
        if(true){
            //添加预约记录
            Appointment ap = new Appointment();//oid自增不设置
            ap.setRid(reader.getRid());
            ap.setBid(vo.getBid());
            ap.setReader(reader);
            ap.setAppointmenttime(new Date());//预约时间
            ap.setAppointmentstate(0);//预约状态
            appointmentService.saveAppointment(ap);
            return "success";
        }
        error="没有库存，无法预约";
        model.addAttribute("error1",error);
        return "error";
    }
    //直接借书
    @RequestMapping("/lend")
    public String islend(QueryVo vo, Model model,Mail mail) {
        System.out.println(vo);
        //用来存放错误信息
        String error;
        //开始借书
        Reader reader = readerService.selectrid(vo.getRid());
        Lend lend = new Lend();//lid和mid
        lend.setRid(reader.getRid());
        lend.setReader(reader);
        lend.setBid(vo.getBid());
        lend.setBookIsbn(new BookIsbn(vo.getBid()));
        lend.setActualtime(new Date());//实际借书时间
        //默认借书一个月
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, 1);
        lend.setPredicttime(cal.getTime());//预计还书时间
        //实际还书时间 还书写
        lend.setRepaystate(0);
        lend.setOverduestate(0);

        boolean b = lendService.saveLend(lend);
        if(b){//数据库返回1时成功
            return "success";
        }
        error="借书记录添加失败";
        model.addAttribute("error1",error);
        return "error";
    }
    //邮寄
    @RequestMapping("/mail")
    public String ismail(QueryVo vo, Model model) {
        System.out.println(vo);
        //用来存放错误信息
        String error;
        //开始邮寄
        Reader reader = readerService.selectrid(vo.getRid());
        //验证用户余额
        Double money = readerService.selectmoney(reader.getRid());
        System.out.println(money);
        if(money > 10.0){
            Mail mail = new Mail();
            mail.setRid(reader.getRid());
            mail.setReader(reader);
            mail.setBid(vo.getBid());
            mail.setBookIsbn(new BookIsbn(Long.valueOf(1)));
            mail.setAddress("2222222");
            mail.setPhone("180");
            mail.setWnumber(12323452);//设置运单号
            readerService.updatemoney(reader.getRid(),10.0);
            boolean savemail = mailService.savemail(mail);
            if(savemail){
                Lend lend = new Lend();//lid和mid
                lend.setRid(reader.getRid());
                lend.setReader(reader);
                lend.setBid(vo.getBid());
                lend.setBookIsbn(new BookIsbn(vo.getBid()));
                lend.setActualtime(new Date());//实际借书时间
                //默认借书一个月
                Calendar cal = Calendar.getInstance();
                cal.setTime(new Date());
                cal.add(Calendar.MONTH, 1);
                lend.setPredicttime(cal.getTime());//预计还书时间
                //实际还书时间 还书写
                lend.setRepaystate(0);
                lend.setOverduestate(0);
                lend.setMid(mail.getMid());
                lend.setMail(mail);
                boolean b = lendService.saveLend(lend);
                if(savemail){
                    return "success";
                }
                error="借书记录添加失败";
            }else{
                error="邮寄记录添加失败";
            }
        }
        error="账户余额不足";

        model.addAttribute("error1",error);
        return "error";
    }
}
