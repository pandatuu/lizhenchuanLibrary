package com.lizhenchuan.mapper;

import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.QueryVo;
import com.lizhenchuan.bean.Reader;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReaderMapper {
    public Integer savereader(Reader reader); // 添加读者
    public Integer updateemail(@Param("rid")Long rid,@Param("email")String email); //修改用户邮箱
    public Integer updateaddress(@Param("rid")Long rid,@Param("address")String address); //修改用户联系地址
    public Integer updatephone(@Param("rid")Long rid,@Param("phone")String phone); //修改用户电话
    public Integer deletereader(Long rid); //删除读者

    public Reader selectrid(Long rid); //根据UID详细查询
    public Reader selectidcard(String idcard); //根据IDCARD详细查询
    public List<Reader> selectusername(String username);// 根据姓名模糊查询
    public List<Reader> selectridphone(String phone); //根据电话模糊查询
    public List<Reader> selectridaddress(String address); //根据联系地址模糊查询
    public Integer selectcredit(Long rid); //查用户信用分
    public Double selectmoney(Long rid); //查用户余额
    List<Lend> queryOverdueOrder(Long Rid); //通过读者id,查询他有哪些订单逾期
    List<Lend>  queryReaderOrder(Long Rid); //通过读者id,查询他有哪些订单
    //违约：
    public Integer updatecredit(@Param("rid")Long rid,@Param("credit")Integer credit); //修改信用分
    //邮寄：
    public String selectaddress(Long rid); //查询用户联系地址
    public String selectphone(Long rid); //查询用户电话
    public Integer updatemoney(@Param("rid")Long rid,@Param("money")Double money); //修改用户余额

    //查询分页总条数
    public Integer customerCount(QueryVo vo);
    //查询分页结果集
    public List<Reader> selectByQueryVo(QueryVo vo);
}