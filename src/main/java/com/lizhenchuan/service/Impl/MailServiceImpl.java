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
    public boolean savemail(Mail mail) {
        Integer integer = mailMapper.saveMail(mail);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateaddress(Long mid, String address) {
        Integer integer = mailMapper.updateAddress(mid, address);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updatephone(Long mid, String phone) {
        Integer integer = mailMapper.updatePhone(mid, phone);
        if (integer > 0) {
            return true;
        }
        return false;
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
