package com.lizhenchuan.bean;

import java.util.Date;

public class BookIsbn {
    private Long isbnId;

    private String isbn;

    private Long pId;

    private Long aId;

    private Long nId;

    private Long cId;

    private Date pushlishtime;

    private String edition;

    public BookIsbn(Long isbnId) {
        this.isbnId = isbnId;
    }

    public Long getIsbnId() {
        return isbnId;
    }

    public void setIsbnId(Long isbnId) {
        this.isbnId = isbnId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Date getPushlishtime() {
        return pushlishtime;
    }

    public void setPushlishtime(Date pushlishtime) {
        this.pushlishtime = pushlishtime;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition == null ? null : edition.trim();
    }
}