package com.ffzhello.designpattern.template;

/**
 * 模板方法：复用/扩展(封装不变的部分，扩展可变的部分)
 * @author ffzhello
 * @since 2020/8/2
 **/
public abstract class AbstractTemplate<P, R> {

    /**
     * 模板方法，定义好算法框架(操作步骤)
     **/
    public final R templateMethod(P params) {
        // 通用方法在父类中实现
        commonMethod1(params);

        // 个性化方法延时到子类中实现
        R res = customMethod(params);

        // 通用方法在父类中实现
        commonMethod2(res);

        return res;
    }

    /**
     * 子类中的通用方法(复用)
     **/
    protected void commonMethod1(P params) {

        // 一些通用逻辑，埋点啥的
        System.out.println(String.format("%s:通用方法1被调用, 记录请求参数:%s", this.getClass().getSimpleName(), params));
    }

    /**
     * 子类中的通用方法(复用)
     **/
    protected void commonMethod2(R res) {
        System.out.println(String.format("%s:通用方法2被调用, 记录响应:%s", this.getClass().getSimpleName(), res));
    }

    /**
     * 子类中的个性化方法(扩展)
     *
     * @param param P
     * @return R
     **/
    protected abstract R customMethod(P param);
}