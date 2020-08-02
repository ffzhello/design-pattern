package com.ffzhello.designpattern.template;

import org.assertj.core.util.Lists;
import org.hibernate.validator.constraints.br.CNPJ;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/8/2
 **/
class ConcreateTemplate2Test {

    private static ConcreateTemplate2 concreateTemplate2;

    @BeforeAll
    public static void init() {
        concreateTemplate2 = new ConcreateTemplate2();
    }

    @Test
    void templateMethod() {
        assertEquals(new ArrayList<>(Arrays.asList("1", "2")), concreateTemplate2.templateMethod(new ArrayList<>(Arrays.asList(1L, 2L))));
    }
}