package com.ffzhello.designpattern.singleton;

/**
 * 基于内部类实现的单例
 *
 * @author ffzhello
 * @since 2020/7/11
 **/
public class InnerClassSingleton {

    /**
     * 私有化构造方法
     **/
    private InnerClassSingleton() {}

    /**
     *  TODO 巧妙的设计
     * 静态内部类实现的单例
     **/
    private static final class InnerClassSingletonHolder {
        private static final InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }

    /**
     * 外部调用接口
     **/
    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.SINGLETON;
    }
}