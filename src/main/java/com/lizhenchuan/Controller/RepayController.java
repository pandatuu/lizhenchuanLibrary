package com.lizhenchuan.Controller;

import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.QueryVo;
import com.lizhenchuan.service.AppointmentService;
import com.lizhenchuan.service.LendService;
import com.lizhenchuan.service.MailService;
import com.lizhenchuan.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class RepayController {
    @Autowired
    private MailService mailService;
    @Autowired
    private LendService lendService;
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private ReaderService readerService;

    @RequestMapping("/repaybook")
    public String lendbook(QueryVo vo, Model model) {
        //页面不足，默认lid
        Lend lend = lendService.selectLendBylId(Long.valueOf(11123));
        //查询个人未还借书记录 没有return "error"
        boolean state = lendService.selectrepayState(vo.getRid());
        if(state){
            //验证记录还书时间是否逾期
            boolean time = lendService.IsOverdue(lend.getPredicttime(), new Date());
            if(time){//如果逾期
                //修改用户信用分 统一扣10分
                readerService.updatecredit(vo.getRid(), 10);
            }
            //修改实际还书时间
            lendService.updateactualrepayTime(lend.getLid(),new Date());
            //修改记录还书状态  0：未还书    1：已还书
            lendService.updaterepayState(lend.getLid(),1);
            return "success";
        }
        return "index";
    }
}
