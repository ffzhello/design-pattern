package com.ffzhello.designpattern.template.callback;

/**
 * @author ffzhello
 * @since 2020/8/2
 **/
public final class Template {

    /**
     * 与模板方法一样，定义算法框架
     **/
    public <P,R> R templateMethod(P param, Callback<P, R> callback) {

        commonMethod1(param);

        // 回调方法
        R r = callback.customMethod(param);

        commonMethod2(r);

        return r;
    }

    /**
     * 公共方法
     **/
    private <P> void commonMethod1(P param) {
        System.out.println(String.format("请求参数:%s", param));
    }

    /**
     * 公共方法
     **/
    private <R> void commonMethod2(R r) {
        System.out.println(String.format("响应:%s", r));
    }
}
