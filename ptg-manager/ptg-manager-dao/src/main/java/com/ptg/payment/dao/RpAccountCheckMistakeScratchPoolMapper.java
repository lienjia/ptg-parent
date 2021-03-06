package com.ptg.payment.dao;

import com.ptg.payment.pojo.po.RpAccountCheckMistakeScratchPool;
import com.ptg.payment.pojo.po.RpAccountCheckMistakeScratchPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpAccountCheckMistakeScratchPoolMapper {
    int countByExample(RpAccountCheckMistakeScratchPoolExample example);

    int deleteByExample(RpAccountCheckMistakeScratchPoolExample example);

    int insert(RpAccountCheckMistakeScratchPool record);

    int insertSelective(RpAccountCheckMistakeScratchPool record);

    List<RpAccountCheckMistakeScratchPool> selectByExample(RpAccountCheckMistakeScratchPoolExample example);

    int updateByExampleSelective(@Param("record") RpAccountCheckMistakeScratchPool record, @Param("example") RpAccountCheckMistakeScratchPoolExample example);

    int updateByExample(@Param("record") RpAccountCheckMistakeScratchPool record, @Param("example") RpAccountCheckMistakeScratchPoolExample example);
}