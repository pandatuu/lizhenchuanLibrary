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
    public List<Lend> selectLend(Long rid) {
        List<Lend> lendList = lendMapper.selectLend(rid);
        return lendList;
    }

    @Override
    public void selectrepayState(Long rid) {
        lendMapper.selectrepayState(rid);
    }

    @Override
    public Date selectpredictTime(Long lid) {
        Date selectpredictTime = lendMapper.selectpredictTime(lid);
        return selectpredictTime;
    }

    @Override
    public void saveLend(Lend lend) {
        lendMapper.saveLend(lend);
    }

    @Override
    public void updatepredictTime(Long lid, Date predictTime) {
        lendMapper.updatepredictTime(lid, predictTime);
    }

    @Override
    public void updateactualrepayTime(Long lid, Date actualrepayTime) {
        lendMapper.updateactualrepayTime(lid, actualrepayTime);
    }

    @Override
    public void updaterepayState(Long lid, Integer repayState) {
        lendMapper.updateoverdueState(lid, repayState);
    }

    @Override
    public void updateoverdueState(Long lid, Integer overdueState) {
        lendMapper.updaterepayState(lid, overdueState);
    }

    @Override
    public Integer queryOrderCount(Long Bid) {
        Integer queryOrderCount = lendMapper.queryOrderCount(Bid);
        return queryOrderCount;
    }

    @Override
    public List<Reader> queryReaderBorrow(Long Bid) {
        List<Reader> readerList = lendMapper.queryReaderBorrow(Bid);
        return readerList;
    }

    @Override
    public Integer queryBookOverdueCount(Long Bid) {
        Integer queryBookOverdueCount = lendMapper.queryBookOverdueCount(Bid);
        return queryBookOverdueCount;
    }

    @Override
    public Integer queryReaderBorrowCount(Long Rid) {
        Integer queryReaderBorrowCount = lendMapper.queryReaderBorrowCount(Rid);
        return queryReaderBorrowCount;
    }

    @Override
    public List<BookIsbn> queryBorrowBook(Long Rid) {
        List<BookIsbn> bookIsbnList = lendMapper.queryBorrowBook(Rid);
        return bookIsbnList;
    }

    @Override
    public void IsOverdue(Date predictRepayTime, Date actualRepayTime) {
        lendMapper.IsOverdue(predictRepayTime, actualRepayTime);
    }
}
