package com.ffzhello.designpattern.strategy;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author ffzhello
 * @since 2020/6/28
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface OrderType {
    // 订单类型
    OrderTypeEnum type();
}
