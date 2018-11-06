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
    public boolean savereader(Reader reader) {
        readerMapper.savereader(reader);
        return false;
    }

    @Override
    public boolean updateemail(Long rid, String email) {
        Integer integer = readerMapper.updateemail(rid, email);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateaddress(Long rid, String address) {
        Integer integer = readerMapper.updateaddress(rid, address);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updatephone(Long rid, String phone) {
        Integer integer = readerMapper.updatephone(rid, phone);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deletereader(Long rid) {
        Integer integer = readerMapper.deletereader(rid);
        if (integer > 0) {
            return true;
        }
        return false;
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
    public Double selectmoney(Long rid) {
        Double selectmoney = readerMapper.selectmoney(rid);
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
    public boolean updatecredit(Long rid, Integer credit) {
        Integer integer = readerMapper.updatecredit(rid, credit);
        if (integer > 0) {
            return true;
        }
        return false;
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
    public boolean updatemoney(Long rid, Double money) {
        Integer integer = readerMapper.updatemoney(rid, money);
        if (integer > 0) {
            return true;
        }
        return false;
    }
}
