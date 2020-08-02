package com.ffzhello.designpattern.template;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/8/2
 **/
class ConcreateTemplate1Test {

    private static ConcreateTemplate1 concreateTempleate1;

    @BeforeAll
    public static void init() {
        concreateTempleate1 = new ConcreateTemplate1();
    }

    @Test
    void templateMethod() {
        assertEquals(12L, concreateTempleate1.templateMethod("12"));
    }
}