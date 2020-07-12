package com.ffzhello.designpattern.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/7/12
 **/
class RegisterCenterTest {
    @Test
    void noticeAll() {
        Observable observable = new ObservableImpl();
        Observer observer = new ObserverImplOne();
        RegisterCenter.register(observable, observer);
        observable.noticeAll();
    }
}