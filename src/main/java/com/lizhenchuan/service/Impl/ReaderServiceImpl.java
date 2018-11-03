package com.lizhenchuan.service.Impl;

import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.Reader;
import com.lizhenchuan.mapper.ReaderMapper;
import com.lizhenchuan.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    private ReaderMapper readerMapper;
    @Override
    public void savereader(Reader reader) {
        readerMapper.savereader(reader);
    }

    @Override
    public void updateemail(Long rid, String email) {
        readerMapper.updateemail(rid, email);
    }

    @Override
    public void updateaddress(Long rid, String address) {
        readerMapper.updateaddress(rid, address);
    }

    @Override
    public void updatephone(Long rid, String phone) {
        readerMapper.updatephone(rid, phone);
    }

    @Override
    public void deletereader(Long rid) {
        readerMapper.deletereader(rid);
    }

    @Override
    public Reader selectrid(Long rid) {
        Reader selectrid = readerMapper.selectrid(rid);
        return selectrid;
    }

    @Override
    public Reader selectidcard(String idcard) {
        Reader selectidcard = readerMapper.selectidcard(idcard);
        return selectidcard;
    }

    @Override
    public List<Reader> selectusername(String username) {
        List<Reader> readerList = readerMapper.selectusername(username);
        return readerList;
    }

    @Override
    public List<Reader> selectridphone(String phone) {
        List<Reader> readerList = readerMapper.selectridphone(phone);
        return readerList;
    }

    @Override
    public List<Reader> selectridaddress(String address) {
        List<Reader> readerList = readerMapper.selectridaddress(address);
        return readerList;
    }

    @Override
    public Integer selectcredit(Long rid) {
        Integer selectcredit = readerMapper.selectcredit(rid);
        return selectcredit;
    }

    @Override
    public Integer selectmoney(Long rid) {
        Integer selectmoney = readerMapper.selectmoney(rid);
        return selectmoney;
    }

    @Override
    public List<Lend> queryOverdueOrder(Long rid) {
        List<Lend> lendList = readerMapper.queryOverdueOrder(rid);
        return lendList;
    }

    @Override
    public List<Lend> queryReaderOrder(Long Rid) {
        List<Lend> lendList = readerMapper.queryReaderOrder(Rid);
        return lendList;
    }

    @Override
    public void updatecredit(Long rid, Integer credit) {
        readerMapper.updatecredit(rid, credit);
    }

    @Override
    public String selectaddress(Long rid) {
        String selectaddress = readerMapper.selectaddress(rid);
        return selectaddress;
    }

    @Override
    public String selectphone(Long rid) {
        String selectphone = readerMapper.selectphone(rid);
        return selectphone;
    }

    @Override
    public void updatemoney(Long rid, Double money) {
        readerMapper.updatemoney(rid, money);
    }
}
