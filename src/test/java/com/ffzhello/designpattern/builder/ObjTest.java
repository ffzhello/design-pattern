package com.ffzhello.designpattern.builder;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/8/8
 **/
class ObjTest {

    public static void main(String[] args) {
        // 构建对象
        Obj obj = new Obj.Builder("ffzhello", 25)
                .sex(1)
                .host(86)
                .phoneNumber("183****6898")
                .build();

        System.out.println(obj.toString());
    }
}