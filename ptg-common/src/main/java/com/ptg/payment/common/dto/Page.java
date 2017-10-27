package com.ptg.payment.common.dto;

/**
 * User: lienjiaa
 * Date: 2017/10/25
 * Time: 19:46
 * Version:V1.0
 */
public class Page {
    private int page;
    private int rows;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getOffset() {
        return (page-1)*rows;
    }
}
