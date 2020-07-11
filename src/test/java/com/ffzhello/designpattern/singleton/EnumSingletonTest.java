package com.ffzhello.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/7/11
 **/
class EnumSingletonTest {

    @Test
    void getInstance() throws Exception {
        /*
         * case1：满足单例的场景
         */
        // 无法实例化枚举类型
        // EnumSingleton enumSingleton = new EnumSingleton();   报错
        // 通过getInstance方法获取单例对象
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
        assertSame(enumSingleton1, enumSingleton2);

        /*
         * case2: 反射也满足单例
         */
        // 枚举类型不能通过反射实例化对象
        // TODO 为什么枚举的构造方法只能被jvm调用？
        Class<EnumSingleton> clazz = EnumSingleton.class;
        // 报错，提示NoSuchMethodException. <init>()
        // Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // constructor.newInstance();
    }
}