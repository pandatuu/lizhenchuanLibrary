package com.lizhenchuan.service.Impl;

import com.lizhenchuan.bean.Mail;
import com.lizhenchuan.mapper.MailMapper;
import com.lizhenchuan.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private MailMapper mailMapper;
    @Override
    public void savemail(Mail mail) {
        mailMapper.saveMail(mail);
    }

    @Override
    public void updateaddress(Long mid, String address) {
        mailMapper.updateAddress(mid, address);
    }

    @Override
    public void updatephone(Long mid, String phone) {
        mailMapper.updatePhone(mid, phone);
    }

    @Override
    public List<Mail> selectmail(Long rid) {
        List<Mail> mailList = mailMapper.selectMail(rid);
        return mailList;
    }

    @Override
    public List<Long> selectmid(Long rid) {
        List<Long> longList = mailMapper.selectMid(rid);
        return longList;
    }
}
