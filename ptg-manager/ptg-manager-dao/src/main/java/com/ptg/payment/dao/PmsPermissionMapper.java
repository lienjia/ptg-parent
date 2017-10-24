package com.ptg.payment.dao;

import com.ptg.payment.pojo.po.PmsPermission;
import com.ptg.payment.pojo.po.PmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPermissionMapper {
    int countByExample(PmsPermissionExample example);

    int deleteByExample(PmsPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsPermission record);

    int insertSelective(PmsPermission record);

    List<PmsPermission> selectByExample(PmsPermissionExample example);

    PmsPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsPermission record, @Param("example") PmsPermissionExample example);

    int updateByExample(@Param("record") PmsPermission record, @Param("example") PmsPermissionExample example);

    int updateByPrimaryKeySelective(PmsPermission record);

    int updateByPrimaryKey(PmsPermission record);
}