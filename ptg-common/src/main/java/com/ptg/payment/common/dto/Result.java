package com.ptg.payment.common.dto;

import java.util.List;

/**
 * User: lienjiaa
 * Date: 2017/10/25
 * Time: 19:55
 * Version:V1.0
 */
public class Result<T> {
    private Long total;
    private List<T> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
