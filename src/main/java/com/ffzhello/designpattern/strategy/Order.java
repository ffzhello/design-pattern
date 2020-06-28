package com.ffzhello.designpattern.strategy;

import lombok.Data;

/**
 * 订单
 *
 * @author ffzhello
 * @since 2020/6/28
 **/
@Data
public class Order {
    /**
     * 订单来源
     **/
    private String source;

    /**
     * 订单详情（业务信息）
     **/
    private String detail;
}
