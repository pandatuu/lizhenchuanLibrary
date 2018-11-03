package com.lizhenchuan.service;

import com.lizhenchuan.bean.Mail;

import java.util.List;

public interface MailService {
    public void savemail(Mail mail); //添加邮寄记录

    public void updateaddress(Long mid,String address); //修改订单联系地址

    public void updatephone(Long mid,String phone); //修改订单电话

    public List<Mail> selectmail(Long rid); //查询用户邮寄记录

    public List<Long> selectmid(Long rid); //查询用户邮寄记录ID
}
