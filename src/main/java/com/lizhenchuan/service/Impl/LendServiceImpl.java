package com.lizhenchuan.service.Impl;

import com.lizhenchuan.bean.BookIsbn;
import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.Reader;
import com.lizhenchuan.mapper.LendMapper;
import com.lizhenchuan.service.LendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LendServiceImpl implements LendService {
    @Autowired
    private LendMapper lendMapper;

    @Override
    public List<Lend> selectLendByrId(Long rid) {
        List<Lend> lendList = lendMapper.selectLendByrId(rid);
        return lendList;
    }
    //查询借书订单，参数是订单id
    public Lend selectLendBylId(Long lid){
        Lend lend = lendMapper.selectLendBylId(lid);
        return lend;
    }
    //查询用户是否有 未还 借书记录，能查出记录ID则有，参数是读者id
    //借书状态 0：未还书，1：已还书
    @Override
    public boolean selectrepayState(Long rid) {
        Integer integer = lendMapper.selectrepayState(rid);
        System.out.println("有"+integer+"条未还借书记录");
        if(integer!=null && integer>0){
            return true;
        }
        return false;
    }

    @Override
    public Date selectpredictTime(Long lid) {
        Date selectpredictTime = lendMapper.selectpredictTime(lid);
        return selectpredictTime;
    }

    @Override
    public boolean saveLend(Lend lend) {
        Integer integer = lendMapper.saveLend(lend);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updatepredictTime(Long lid, Date predictTime) {
        Integer integer = lendMapper.updatepredictTime(lid, predictTime);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateactualrepayTime(Long lid, Date actualrepayTime) {
        Integer integer = lendMapper.updateactualrepayTime(lid, actualrepayTime);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updaterepayState(Long lid, Integer repayState) {
        Integer integer = lendMapper.updateoverdueState(lid, repayState);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateoverdueState(Long lid, Integer overdueState) {
        Integer integer = lendMapper.updaterepayState(lid, overdueState);
        if (integer > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Integer selectOrderCount(Long Bid) {
        Integer selectOrderCount = lendMapper.selectOrderCount(Bid);
        return selectOrderCount;
    }

    @Override
    public List<Reader> selectReaderBorrow(Long Bid) {
        List<Reader> readerList = lendMapper.selectReaderBorrow(Bid);
        return readerList;
    }

    @Override
    public Integer selectBookOverdueCount(Long Bid) {
        Integer selectBookOverdueCount = lendMapper.selectBookOverdueCount(Bid);
        return selectBookOverdueCount;
    }

    @Override
    public Integer selectReaderBorrowCount(Long Rid) {
        Integer selectReaderBorrowCount = lendMapper.selectReaderBorrowCount(Rid);
        return selectReaderBorrowCount;
    }

    @Override
    public List<BookIsbn> selectBorrowBook(Long Rid) {
        List<BookIsbn> bookIsbnList = lendMapper.selectBorrowBook(Rid);
        return bookIsbnList;
    }

    //通过是预计还书日期和实际还书日期查询此本记录的还书时间是否逾期
    @Override
    public boolean IsOverdue(Date predictTime, Date actualRepayTime) {
        Integer integer = lendMapper.IsOverdue(predictTime, actualRepayTime);
        if(integer != null && integer==1){
            return true;
        }
        return false;
    }

    @Override
    public Integer repayStateZero(Long rid){
        Integer integer = lendMapper.repayStateZero(rid);
        return integer;
    }
}
