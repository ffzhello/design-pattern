package com.ffzhello.designpattern.strategy;

/**
 * 移动端订单处理
 *
 * @author ffzhello
 * @since 2020/6/28
 **/
@OrderType(type = OrderTypeEnum.MOBILE)
public class MobileOrderHandler extends AbstractOrderHandler {

    /**
     * 订单处理
     *
     * @param order 订单
     **/
    @Override
    protected void doHandle(Order order) {
        // 埋点
        System.out.println("来自移动端的订单处理");
    }
}
