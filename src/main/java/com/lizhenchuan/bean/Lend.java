package com.lizhenchuan.bean;

import java.util.Date;

public class Lend {
    private Long lid;

    private Long rid;

    private Long bid;

    private Date actualtime;

    private Date predicttime;

    private Date actualrepaytime;

    private Long mid;

    private Integer repaystate;

    private Integer overduestate;

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
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

    public Date getActualtime() {
        return actualtime;
    }

    public void setActualtime(Date actualtime) {
        this.actualtime = actualtime;
    }

    public Date getPredicttime() {
        return predicttime;
    }

    public void setPredicttime(Date predicttime) {
        this.predicttime = predicttime;
    }

    public Date getActualrepaytime() {
        return actualrepaytime;
    }

    public void setActualrepaytime(Date actualrepaytime) {
        this.actualrepaytime = actualrepaytime;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Integer getRepaystate() {
        return repaystate;
    }

    public void setRepaystate(Integer repaystate) {
        this.repaystate = repaystate;
    }

    public Integer getOverduestate() {
        return overduestate;
    }

    public void setOverduestate(Integer overduestate) {
        this.overduestate = overduestate;
    }
}