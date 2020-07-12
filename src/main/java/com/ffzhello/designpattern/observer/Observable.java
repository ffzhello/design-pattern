package com.ffzhello.designpattern.observer;

/**
 * 被观察者
 *
 * @author ffzhello
 * @since 2020/7/12
 **/
public interface Observable {

    /**
     * 状态变更，通知观察者
     * 实现类需要在具体业务方法中调用此方法
     * TODO 此方法不好，对用户不透明
     **/
    default void noticeAll() {
        RegisterCenter.noticeAll(this);
    }
}
