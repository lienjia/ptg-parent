package com.ptg.payment.dao;

import com.ptg.payment.pojo.po.RpAccount;
import com.ptg.payment.pojo.po.RpAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpAccountMapper {
    int countByExample(RpAccountExample example);

    int deleteByExample(RpAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpAccount record);

    int insertSelective(RpAccount record);

    List<RpAccount> selectByExample(RpAccountExample example);

    RpAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpAccount record, @Param("example") RpAccountExample example);

    int updateByExample(@Param("record") RpAccount record, @Param("example") RpAccountExample example);

    int updateByPrimaryKeySelective(RpAccount record);

    int updateByPrimaryKey(RpAccount record);
}