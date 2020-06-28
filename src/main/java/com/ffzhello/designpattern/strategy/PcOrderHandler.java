package com.ffzhello.designpattern.strategy;

/**
 * pc端订单处理
 *
 * @author ffzhello
 * @since 2020/6/28
 **/
@OrderType(type = OrderTypeEnum.PC)
public class PcOrderHandler extends AbstractOrderHandler {
    /**
     * 订单处理
     *
     * @param order 订单
     **/
    @Override
    protected void doHandle(Order order) {
        // 业务逻辑
        System.out.println("来自pc的订单");
    }
}
