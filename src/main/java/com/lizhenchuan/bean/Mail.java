package com.lizhenchuan.bean;

public class Mail {
    private Long mid;

    private Long rid;

    private Long bid;

    private String address;

    private String phone;

    private Integer wnumber;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getWnumber() {
        return wnumber;
    }

    public void setWnumber(Integer wnumber) {
        this.wnumber = wnumber;
    }
}