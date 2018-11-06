package com.lizhenchuan.service;

import com.lizhenchuan.bean.OrderType;

import java.util.List;

public interface OrderTypeService {
    //查询订单类型表
    public List<OrderType> selectAll(String code);

}
