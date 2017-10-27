package com.ptg.payment.service;

import com.ptg.payment.common.dto.Order;
import com.ptg.payment.common.dto.Page;
import com.ptg.payment.common.dto.Result;
import com.ptg.payment.pojo.po.RpAccountCheckBatch;
import com.ptg.payment.pojo.vo.BillDateQuery;

/**
 * User: lienjiaa
 * Date: 2017/10/25
 * Time: 23:01
 * Version:V1.0
 */
public interface CheckBatchService {
    Result<RpAccountCheckBatch> listCheckBatchItems(Page page, Order order, BillDateQuery query);
}
