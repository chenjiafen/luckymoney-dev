package com.iooc.luckymoney;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author tyler.chen
 * @data 2019-09-21 11:11
 */

@Component  //为了把位置注入
@ConfigurationProperties(prefix = "limit") //配置文件prefix

public class LimitConfig {

    private BigDecimal minMoney;
    private BigDecimal maxMoney;
    private String descripition;

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }
}
