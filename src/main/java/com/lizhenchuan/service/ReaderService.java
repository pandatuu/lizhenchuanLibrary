package com.lizhenchuan.service;

import com.lizhenchuan.bean.Lend;
import com.lizhenchuan.bean.Reader;

import java.util.List;

public interface ReaderService {
    public boolean savereader(Reader reader); // 添加读者
    public boolean updateemail(Long rid,String email); //修改用户邮箱
    public boolean updateaddress(Long rid,String address); //修改用户联系地址
    public boolean updatephone(Long rid,String phone); //修改用户电话
    public boolean deletereader(Long rid); //删除读者

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
    public boolean updatecredit(Long rid,Integer credit); //修改信用分
    //邮寄：
    public String selectaddress(Long rid); //查询用户联系地址
    public String selectphone(Long rid); //查询用户电话
    public boolean updatemoney(Long rid,Double money); //修改用户余额

}
