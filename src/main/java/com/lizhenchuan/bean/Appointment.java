package com.lizhenchuan.bean;

import java.util.Date;

public class Appointment {
    private Long oid;

    private Long rid;

    private Long bid;

    private Date appointmenttime;

    private Integer appointmentstate;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Date getAppointmenttime() {
        return appointmenttime;
    }

    public void setAppointmenttime(Date appointmenttime) {
        this.appointmenttime = appointmenttime;
    }

    public Integer getAppointmentstate() {
        return appointmentstate;
    }

    public void setAppointmentstate(Integer appointmentstate) {
        this.appointmentstate = appointmentstate;
    }
}