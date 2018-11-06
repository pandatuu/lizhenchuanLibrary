package com.lizhenchuan.service.Impl;

import com.lizhenchuan.bean.Appointment;
import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.Mail;
import com.lizhenchuan.bean.QueryVo;
import com.lizhenchuan.mapper.AppointmentMapper;
import com.lizhenchuan.mapper.LendMapper;
import com.lizhenchuan.mapper.MailMapper;
import com.lizhenchuan.service.QueryVoService;
import com.lizhenchuan.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryVoServiceImpl implements QueryVoService {
    @Autowired
    private LendMapper lendMapper;
    @Autowired
    private MailMapper mailMapper;
    @Autowired
    private AppointmentMapper appointmentMapper;
    //通过两个条件，查询分页对象
    public Page<Lend> selectByLend(QueryVo vo){
        Page<Lend> page = new Page<>();
        //每页数
        page.setSize(5);
        if(null != vo){
            //判断当前页
            if(null != vo.getPage()){
                page.setPage(vo.getPage());
                vo.setStartrow((vo.getPage()-1)*vo.getPagesize());
            }
            //总条数
            page.setTotal(lendMapper.lendCount(vo));
            //结果集
            page.setRows(lendMapper.selectByQueryVo(vo));
        }
        return page;
    }

    @Override
    public Page<Mail> selectByMail(QueryVo vo) {
        Page<Mail> page = new Page<>();
        //每页数
        page.setSize(5);
        if(null != vo){
            //判断当前页
            if(null != vo.getPage()){
                page.setPage(vo.getPage());
                vo.setStartrow((vo.getPage()-1)*vo.getPagesize());
            }
            //总条数
            page.setTotal(mailMapper.mailCount(vo));
            //结果集
            page.setRows(mailMapper.selectByQueryVo(vo));
        }
        return page;
    }

    @Override
    public Page<Appointment> selectByAppointment(QueryVo vo) {
        return null;
    }
}
