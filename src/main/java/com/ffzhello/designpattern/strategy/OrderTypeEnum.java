package com.ffzhello.designpattern.strategy;

/**
 * @author ffzhello
 * @since 2020/6/28
 **/
public enum OrderTypeEnum {
    /**
     * PC订单
     **/
    PC("pc"),

    /**
     * 移动端订单
     **/
    MOBILE("mobile")

    ;

    private final String type;

    OrderTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
