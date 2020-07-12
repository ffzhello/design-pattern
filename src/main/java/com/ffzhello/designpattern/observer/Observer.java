package com.ffzhello.designpattern.observer;

/**
 * 观察者
 *
 * @author ffzhello
 * @since 2020/7/12
 **/
public interface Observer {

    /**
     * 被观察者状态发生变更时，调用此方法进行
     *
     * @param observable 被观察的对象
     * @param obj 参数
     **/
    void notice(Observable observable, Object... obj);
}
