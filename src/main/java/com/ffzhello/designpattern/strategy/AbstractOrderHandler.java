package com.ffzhello.designpattern.strategy;

/**
 * @author ffzhello
 * @since 2020/6/28
 **/
public abstract class AbstractOrderHandler {

    /**
     * 订单处理
     *
     * @param order 订单
     **/
    protected abstract void doHandle(Order order);

    /**
     * 公共部分
     **/
    public void handle(Order order) {
        // TODO 通用处理 埋点啥的
        doHandle(order);
    }
}
