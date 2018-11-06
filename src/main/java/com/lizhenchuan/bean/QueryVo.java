package com.lizhenchuan.bean;

public class QueryVo {
    private Long rid;
    private Long bid;

    //因为涉及到分页，所以要写 当前页
    private Integer page;
    //每页数
    private Integer pagesize=10;
    //从第几条开始显示
    private Integer startrow = 0;

    @Override
    public String toString() {
        return "QueryVo{" +
                "rid=" + rid +
                "bid=" + bid +
                '}';
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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getStartrow() {
        return startrow;
    }

    public void setStartrow(Integer startrow) {
        this.startrow = startrow;
    }
}
