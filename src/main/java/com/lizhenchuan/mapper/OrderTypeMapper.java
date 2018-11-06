package com.lizhenchuan.mapper;

import com.lizhenchuan.bean.OrderType;
import com.lizhenchuan.bean.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderTypeMapper {
    //查询订单类型表
    public List<OrderType> selectAll(String code);



}
