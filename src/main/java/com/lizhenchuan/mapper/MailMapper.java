package com.lizhenchuan.mapper;

import com.lizhenchuan.bean.Mail;
import com.lizhenchuan.bean.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MailMapper {

    public Integer saveMail(Mail mail); //添加邮寄记录

    public Integer updateAddress(@Param("mid")Long mid,@Param("address")String address); //修改订单联系地址

    public Integer updatePhone(@Param("mid")Long mid,@Param("phone")String phone); //修改订单电话

    public List<Mail> selectMail(Long rid); //查询用户邮寄记录

    public List<Long> selectMid(Long rid); //查询用户邮寄记录ID

    //查询分页总条数
    public Integer mailCount(QueryVo vo);
    //查询分页结果集
    public List<Mail> selectByQueryVo(QueryVo vo);
}