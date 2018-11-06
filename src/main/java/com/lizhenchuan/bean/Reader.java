package com.lizhenchuan.bean;

import java.util.List;

public class Reader {
    private Long rid;

    private String username;

    private String sex;

    private String phone;

    private String email;

    private String address;

    private String idcard;

    private Long credit;

    private Long money;

    private List<Appointment> appointments;
    private List<Lend>  lends;
    private List<Mail> mails;

    public Long getRid() {
        return rid;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Lend> getLends() {
        return lends;
    }

    public void setLends(List<Lend> lends) {
        this.lends = lends;
    }

    public List<Mail> getMails() {
        return mails;
    }

    public void setMails(List<Mail> mails) {
        this.mails = mails;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

}