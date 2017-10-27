package com.ptg.payment.pojo.vo;

import com.ptg.payment.pojo.po.RpAccount;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: lienjiaa
 * Date: 2017/10/26
 * Time: 19:48
 * Version:V1.0
 */
public class RpAccountCustom extends RpAccount implements Serializable {
    private String username;

  //  private BigDecimal availableBalance;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getAvailableBalance() {
        return super.getBalance().subtract(super.getUnbalance());
    }
}
