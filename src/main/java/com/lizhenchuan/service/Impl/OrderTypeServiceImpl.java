package com.lizhenchuan.service.Impl;

import com.lizhenchuan.bean.OrderType;
import com.lizhenchuan.mapper.OrderTypeMapper;
import com.lizhenchuan.service.OrderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderTypeServiceImpl implements OrderTypeService {
    @Autowired
    private OrderTypeMapper orderTypeMapper;

    @Override
    public List<OrderType> selectAll(String code) {
        List<OrderType> orderTypeList = orderTypeMapper.selectAll(code);
        return orderTypeList;
    }

}
