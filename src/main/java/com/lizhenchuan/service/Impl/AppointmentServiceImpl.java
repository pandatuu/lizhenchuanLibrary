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
    public boolean saveAppointment(Appointment appointment) {
        Integer integer = am.saveAppointment(appointment);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateAppointmentState(Long oid, Integer appointmentState) {
        Integer integer = am.updateAppointmentState(oid, appointmentState);
        if (integer > 0) {
            return true;
        }
        return false;
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
