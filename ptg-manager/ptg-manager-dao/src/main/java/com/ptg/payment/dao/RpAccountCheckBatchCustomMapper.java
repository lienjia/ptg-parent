package com.ptg.payment.dao;

import com.ptg.payment.pojo.po.RpAccountCheckBatch;

import java.util.List;
import java.util.Map;

public interface RpAccountCheckBatchCustomMapper {
    long countItems(Map<String,Object> map);
    List<RpAccountCheckBatch> listItemsByPage(Map<String,Object> map);
}