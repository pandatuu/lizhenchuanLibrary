package com.lizhenchuan.mapper;

import com.lizhenchuan.bean.User;

public interface UserMapper {
    Integer insert(User record);

    Integer insertSelective(User record);
}