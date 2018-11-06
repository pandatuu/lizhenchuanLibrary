package com.lizhenchuan.mapper;

import com.lizhenchuan.bean.BookIsbn;
import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.QueryVo;
import com.lizhenchuan.bean.Reader;
import org.apache.ibatis.annotations.Param;

import java.text.Bidi;
import java.util.Date;
import java.util.List;

public interface LendMapper {
    public List<Lend> selectLendByrId(Long rid); //查询用户的订单，参数是读者id

    public Lend selectLendBylId(Long lid); //查询借书订单，参数是订单id

    public Integer selectrepayState(Long rid); //查询用户有无未还借书记录，参数是读者id

    public Date selectpredictTime(Long lid); //查询订单的预计还书时间，参数是借书记录id

    public Integer saveLend(Lend lend); //新增借书记录

    public Integer updatepredictTime(@Param("lid") Long lid,@Param("predictTime") Date predicttime); //修改订单预计还书时间

    public Integer updateactualrepayTime(@Param("lid")Long lid,@Param("actualrepayTime")Date actualrepayTime); //修改订单的实际还书时间

    public Integer updaterepayState(@Param("lid")Long lid,@Param("repayState")Integer repayState); //修改借书记录状态

    public Integer updateoverdueState(@Param("lid")Long lid,@Param("overdueState")Integer overdueState); //修改逾期状态

    Integer selectOrderCount(Long Bid); //通过书籍id,查询有多少条借过本书

    List<Reader> selectReaderBorrow(Long Bid); //通过书籍id,查询有哪些人借过本书

    Integer selectBookOverdueCount(Long Bid); //通过书籍id,查询此书逾期次数

    Integer selectReaderBorrowCount(Long Rid); //通过读者id,查询他借过多少次书

    List<BookIsbn> selectBorrowBook(Long Rid); //通过读者id,查询他借过哪些书

    //通过是预计还书日期和实际还书日期查询此本书还书时间是否逾期
    public Integer IsOverdue(@Param("predicttime")Date predicttime, @Param("actualRepayTime") Date actualRepayTime);

    //查询读者未还书的记录数，超过5个未还，不予借书
    public Integer repayStateZero(Long rid);

    //查询分页总条数
    public Integer lendCount(QueryVo vo);
    //查询分页结果集
    public List<Lend> selectByQueryVo(QueryVo vo);
}