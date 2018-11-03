package com.lizhenchuan.mapper;

import com.lizhenchuan.bean.BookIsbn;
import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.Reader;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface LendMapper {
    public List<Lend> selectLend(Long rid); //查询用户的订单，参数是读者id

    public void selectrepayState(Long rid); //查询用户有无未还借书记录，参数是读者id

    public Date selectpredictTime(Long lid); //查询订单的预计还书时间，参数是借书记录id

    public Integer saveLend(Lend lend); //新增借书记录

    public Integer updatepredictTime(@Param("lid") Long lid,@Param("predictTime") Date predictTime); //修改订单预计还书时间

    public Integer updateactualrepayTime(@Param("lid")Long lid,@Param("actualrepayTime")Date actualrepayTime); //修改订单的实际还书时间

    public Integer updaterepayState(@Param("lid")Long lid,@Param("repayState")Integer repayState); //修改借书记录状态

    public Integer updateoverdueState(@Param("lid")Long lid,@Param("overdueState")Integer overdueState); //修改逾期状态

    Integer queryOrderCount(Long Bid); //通过书籍id,查询有多少条借过本书

    List<Reader> queryReaderBorrow(Long Bid); //通过书籍id,查询有哪些人借过本书

    Integer queryBookOverdueCount(Long Bid); //通过书籍id,查询此书逾期次数

    Integer queryReaderBorrowCount(Long Rid); //通过读者id,查询他借过多少次书

    List<BookIsbn> queryBorrowBook(Long Rid); //通过读者id,查询他借过哪些书

    public void IsOverdue(@Param("predictRepayTime")Date predictRepayTime,@Param("actualRepayTime") Date actualRepayTime); //通过是预计还书日期和实际还书日期查询此本书还书时间是否逾期
}