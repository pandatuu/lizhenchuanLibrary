package com.lizhenchuan.Controller;

import com.lizhenchuan.bean.Reader;
import com.lizhenchuan.mapper.AppointmentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {


    public void test01() throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AppointmentMapper mapper = ac.getBean(AppointmentMapper.class);
        List<Reader> selectduoduiyi = mapper.selectduoduiyi();
        for (Reader reader : selectduoduiyi) {
            System.out.println(reader);
        }

    }
}
