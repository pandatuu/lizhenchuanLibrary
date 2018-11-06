package com.lizhenchuan.service;

import com.lizhenchuan.bean.Appointment;
import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.Mail;
import com.lizhenchuan.bean.QueryVo;
import com.lizhenchuan.utils.Page;

public interface QueryVoService {
    public Page<Lend> selectByLend(QueryVo vo);
    public Page<Mail> selectByMail(QueryVo vo);
    public Page<Appointment> selectByAppointment(QueryVo vo);
}
