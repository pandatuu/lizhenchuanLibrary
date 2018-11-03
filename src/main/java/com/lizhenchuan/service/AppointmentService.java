package com.lizhenchuan.service;

import com.lizhenchuan.bean.Appointment;

import java.util.Date;
import java.util.List;

public interface AppointmentService {
    public void saveAppointment(Appointment appointment); //添加预约记录

    public void updateAppointmentState(Long oid,Integer appointmentState); //修改预约状态

    public List<Appointment> selectAppointment(Long rid); //查询用户预约记录

    public Date selectAppointmentTIme(Long oid); //查询预约订单的预约时间
}
