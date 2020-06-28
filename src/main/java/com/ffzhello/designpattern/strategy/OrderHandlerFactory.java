package com.ffzhello.designpattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ffzhello
 * @since 2020/6/28
 **/
@Service
public class OrderHandlerFactory {
    private final Map<String, AbstractOrderHandler> orderHandlerMap = new HashMap<>();

    /**
     * 订单处理器注入
     **/
    @Resource
    public void orderHandlerMapInit(List<AbstractOrderHandler> orderHandlerList) {
        orderHandlerList.forEach(orderHandler -> {
            OrderType orderType = AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderType.class);
            if (orderType == null) {
                throw new IllegalArgumentException(String.format("order handle type not found. class: %s", orderHandler.getClass().getSimpleName()));
            }

            orderHandlerMap.putIfAbsent(orderType.type().getType(), orderHandler);
        });
    }

    /**
     * 工厂模式
     * 根据订单来源获取订单处理器
     **/
    public AbstractOrderHandler getOrderHandler(String source) {
        if (!orderHandlerMap.containsKey(source)) {
            throw new IllegalArgumentException(source + "illegal.");
        }

        return orderHandlerMap.get(source);
    }
}
