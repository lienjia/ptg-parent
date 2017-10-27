package com.ptg.payment.service.impl;

import com.ptg.payment.common.dto.Order;
import com.ptg.payment.common.dto.Page;
import com.ptg.payment.common.dto.Result;
import com.ptg.payment.dao.RpAccountCheckBatchCustomMapper;
import com.ptg.payment.pojo.po.RpAccountCheckBatch;
import com.ptg.payment.pojo.vo.BillDateQuery;
import com.ptg.payment.service.CheckBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: lienjiaa
 * Date: 2017/10/25
 * Time: 23:02
 * Version:V1.0
 */
@Service
public class CheckBatchServiceImpl implements CheckBatchService{
    @Autowired
   private RpAccountCheckBatchCustomMapper checkBatchCustomMapper;
    @Override
    public Result<RpAccountCheckBatch> listCheckBatchItems(Page page, Order order, BillDateQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("page", page);
        map.put("order", order);
        map.put("query",query);
        long total = checkBatchCustomMapper.countItems(map);
        List<RpAccountCheckBatch> rows = checkBatchCustomMapper.listItemsByPage(map);
        Result<RpAccountCheckBatch> rs = new Result<>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;

    }
}
