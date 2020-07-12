package com.ffzhello.designpattern.observer;

/**
 * @author ffzhello
 * @since 2020/7/12
 **/
public class ObserverImplOne implements Observer{

    /**
     * 被观察者状态发生变更时，调用此方法进行
     *
     * @param observable 被观察的对象
     * @param obj        参数
     **/
    @Override
    public void notice(Observable observable, Object... obj) {
        System.out.println(String.format("%s: 状态变更. 接收者:%s", observable.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
