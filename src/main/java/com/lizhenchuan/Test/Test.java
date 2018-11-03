package com.lizhenchuan.Test;

import com.lizhenchuan.bean.Appointment;
import com.lizhenchuan.bean.Mail;
import com.lizhenchuan.mapper.AppointmentMapper;
import com.lizhenchuan.mapper.MailMapper;
import com.lizhenchuan.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Test {

    @org.junit.Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AppointmentMapper mailMapper = ac.getBean(AppointmentMapper.class);
        Integer integer = mailMapper.updateAppointmentState(Long.valueOf(4), 0);
        System.out.println(integer);
    }
}
