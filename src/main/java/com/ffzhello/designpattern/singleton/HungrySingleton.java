package com.ffzhello.designpattern.singleton;

/**
 * 饿汉式
 *
 * @author ffzhello
 */
public class HungrySingleton {

    private static final HungrySingleton SINGLETON = new HungrySingleton();

    /**
     * 构造方法私有化
     **/
    private HungrySingleton() {

    }

    private void bizMethod() {
        System.out.println("业务方法");
    }

    public static HungrySingleton getInstance() {
        return SINGLETON;
    }
}
