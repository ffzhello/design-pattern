package com.ffzhello.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/7/11
 **/
class InnerClassSingletonTest {

    @Test
    void getInstance() throws Exception {
        /*
         * 校验单例
         */
        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();
        // 满足单例
        assertSame(innerClassSingleton1, innerClassSingleton2);

        /*
         * 校验反射是否满足单例
         */
        Class<InnerClassSingleton> innerClassSingletonClass = InnerClassSingleton.class;
        Constructor<InnerClassSingleton> declaredConstructor = innerClassSingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        InnerClassSingleton innerClassSingleton3 = declaredConstructor.newInstance();
        // 不满足单例
        assertSame(innerClassSingleton1, innerClassSingleton3);
    }
}