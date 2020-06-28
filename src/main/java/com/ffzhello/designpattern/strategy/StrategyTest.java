package com.ffzhello.designpattern.strategy;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ffzhello
 * @since 2020/6/28
 **/
@Service
public class StrategyTest {

    @Resource
    private OrderHandlerFactory orderHandlerFactory;

    public void handle(Order order) {
        AbstractOrderHandler orderHandler = orderHandlerFactory.getOrderHandler(order.getSource());
        orderHandler.handle(order);
    }
}
