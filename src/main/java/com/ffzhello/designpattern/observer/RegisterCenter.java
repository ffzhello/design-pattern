package com.ffzhello.designpattern.observer;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 注册中心，负责注册观察者到观察者
 *
 * @author ffzhello
 * @since 2020/7/12
 **/
public class RegisterCenter {
    /**
     * 观察者-被观察者映射
     **/
    private static final Map<Observable, List<Observer>> OBSERVER_MAPPER = new HashMap<>();

    /**
     * 将某个观察者注册到某个被观察对象上
     *
     * @param observable 被观察者
     * @param observer 观察者
     **/
    public static void register(Observable observable, Observer observer) {
        if (observable == null || observer == null) {
            throw new IllegalArgumentException();
        }

        synchronized (OBSERVER_MAPPER) {
            OBSERVER_MAPPER.computeIfAbsent(observable, i -> new ArrayList<>()).add(observer);
        }
    }

    /**
     * 将多个观察者注册到某个被观察对象上
     *
     * @param observable 被观察者
     * @param observerList 观察者列表
     **/
    public static void register(Observable observable, List<Observer> observerList) {
        if (observable == null || CollectionUtils.isEmpty(observerList)) {
            return;
        }

        synchronized (OBSERVER_MAPPER) {
            OBSERVER_MAPPER.computeIfAbsent(observable, i -> new ArrayList<>()).addAll(observerList);
        }
    }

    /**
     * 从某个被观察对象上移除某个观察者
     **/
    public static void remove(Observable observable, Observer observer) {
        if (observable == null || observer == null) {
            throw new IllegalArgumentException();
        }

        if (OBSERVER_MAPPER.containsKey(observable) && OBSERVER_MAPPER.get(observable).contains(observer)) {
            synchronized (OBSERVER_MAPPER) {
                OBSERVER_MAPPER.get(observable).remove(observer);
            }
        }
    }

    /**
     * 移除某个被观察者上所有的观察者
     **/
    public static void removeAll(Observable observable) {
        if (observable == null || !OBSERVER_MAPPER.containsKey(observable)) {
            return;
        }

        // 移除
        synchronized (OBSERVER_MAPPER) {
            OBSERVER_MAPPER.remove(observable);
        }
    }

    /**
     * 被观察者状态变更，通知观察者
     **/
    public static void noticeAll(Observable observable) {
        if (observable == null) {
            throw new IllegalArgumentException();
        }

        List<Observer> observers = OBSERVER_MAPPER.get(observable);
        if (CollectionUtils.isEmpty(observers)) {
            return;
        }

        // 通知每个观察者
        observers.forEach(observer -> observer.notice(observable));
    }
}
