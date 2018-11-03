package com.lizhenchuan.service.Impl;

import com.lizhenchuan.bean.Appointment;
import com.lizhenchuan.mapper.AppointmentMapper;
import com.lizhenchuan.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentMapper am;

    @Override
    public void saveAppointment(Appointment appointment) {
        am.saveAppointment(appointment);

    }

    @Override
    public void updateAppointmentState(Long oid, Integer appointmentState) {
         am.updateAppointmentState(oid,appointmentState);
    }

    @Override
    public List<Appointment> selectAppointment(Long rid) {
        List<Appointment> appointments = am.selectAppointment(rid);
        return appointments;
    }

    @Override
    public Date selectAppointmentTIme(Long oid) {
        Date date = am.selectAppointmentTIme(oid);
        return date;
    }
}
