package com.lizhenchuan.bean;

import java.util.Date;

public class Appointment {
    private Long oid;

    private Long rid;

    private Long bid;

    private Date appointmenttime;

    private Integer appointmentstate;

    private Reader reader;
    private BookIsbn bookIsbn;

    public BookIsbn getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(BookIsbn bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

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