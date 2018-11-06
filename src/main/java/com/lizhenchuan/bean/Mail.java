package com.lizhenchuan.bean;

public class Mail {
    private Long mid;

    private Long rid;

    private Long bid;

    private String address;

    private String phone;

    private Integer wnumber;

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

    @Override
    public String toString() {
        return "Mail{" +
                "mid=" + mid +
                ", rid=" + rid +
                ", bid=" + bid +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", wnumber=" + wnumber +
                '}';
    }
}