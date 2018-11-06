package com.lizhenchuan.mapper;

import com.lizhenchuan.bean.Appointment;
import com.lizhenchuan.bean.QueryVo;
import com.lizhenchuan.bean.Reader;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public interface AppointmentMapper {
    public Integer saveAppointment(Appointment appointment); //添加预约记录

    public Integer updateAppointmentState(@Param("oid")Long oid,@Param("appointmentState")Integer appointmentState); //修改预约状态

    public List<Appointment> selectAppointment(Long rid); //查询用户预约记录

    public Date selectAppointmentTIme(Long oid); //查询预约订单的预约时间
public List<Reader> selectduoduiyi();

    //查询分页总条数
    public Integer appointmentCount(QueryVo vo);
    //查询分页结果集
    public List<Appointment> selectByQueryVo(QueryVo vo);
}