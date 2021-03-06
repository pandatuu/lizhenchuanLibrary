package com.lizhenchuan.service;

import com.lizhenchuan.bean.BookIsbn;
import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.Reader;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface LendService {
    public List<Lend> selectLendByrId(Long rid); //查询用户的订单，参数是读者id

    public Lend selectLendBylId(Long lid); //查询借书订单，参数是订单id

    public boolean selectrepayState(Long rid); //查询用户有无未还借书记录，参数是读者id

    public Date selectpredictTime(Long lid); //查询订单的预计还书时间，参数是借书记录id

    public boolean saveLend(Lend lend); //新增借书记录

    public boolean updatepredictTime(Long lid,Date predictTime); //修改订单预计还书时间

    public boolean updateactualrepayTime(Long lid,Date actualrepayTime); //修改订单的实际还书时间

    public boolean updaterepayState(Long lid,Integer repayState); //修改借书记录状态

    public boolean updateoverdueState(Long lid,Integer overdueState); //修改逾期状态

    Integer selectOrderCount(Long Bid); //通过书籍id,查询有多少条借过本书

    List<Reader> selectReaderBorrow(Long Bid); //通过书籍id,查询有哪些人借过本书

    Integer selectBookOverdueCount(Long Bid); //通过书籍id,查询此书逾期次数

    Integer selectReaderBorrowCount(Long Rid); //通过读者id,查询他借过多少次书

    List<BookIsbn> selectBorrowBook(Long Rid); //通过读者id,查询他借过哪些书

    public Integer repayStateZero(Long rid); //查询读者未还书的记录数

    //通过是预计还书日期和实际还书日期查询此本书还书时间是否逾期
    public boolean IsOverdue(Date predictTime,Date actualRepayTime);
}
