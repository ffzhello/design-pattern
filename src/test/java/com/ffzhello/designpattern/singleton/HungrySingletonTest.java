package com.ffzhello.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/7/11
 **/
class HungrySingletonTest {

    @Test
    void getInstance() throws Exception {
        /*
         * case1: 满足单例的场景
         */
        // 无法通过构造器创建对象
        // HungrySingleton hungrySingleton = new HungrySingleton();
        // 只能通过HungrySingleton暴露的getInstance方法获取单例对象
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();

        // 校验getInstance方法返回的对象是单例
        assertSame(hungrySingleton1, hungrySingleton2);

        /*
         * case2：不满足单例的场景
         */
        // 通过反射，还是可以新建对象的
        // 此时就违反了单例
        Class<HungrySingleton> clazz = HungrySingleton.class;
        Constructor<HungrySingleton> defaultConstructor = clazz.getDeclaredConstructor();
        defaultConstructor.setAccessible(true);
        HungrySingleton hungrySingleton3 = defaultConstructor.newInstance();
        assertSame(hungrySingleton1, hungrySingleton3);
    }
}