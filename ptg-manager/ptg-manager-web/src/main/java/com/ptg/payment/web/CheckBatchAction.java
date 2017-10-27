package com.ptg.payment.web;

import com.ptg.payment.common.dto.Order;
import com.ptg.payment.common.dto.Page;
import com.ptg.payment.common.dto.Result;
import com.ptg.payment.pojo.po.RpAccountCheckBatch;
import com.ptg.payment.pojo.vo.BillDateQuery;
import com.ptg.payment.service.CheckBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: lienjiaa       --|
 * Date: 2017/10/25
 * Time: 22:39
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class CheckBatchAction {
    @Autowired
    private CheckBatchService checkBatchService;
    @ResponseBody
    @RequestMapping("/batch")
    public Result<RpAccountCheckBatch> listCheckBatchItems(Page page, Order order, BillDateQuery query){
       System.out.print(query.getTime());
        return checkBatchService.listCheckBatchItems(page,order,query);
    }
}
