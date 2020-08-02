package com.ffzhello.designpattern.template;

import com.ffzhello.designpattern.template.callback.Template;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ffzhello
 * @since 2020/8/2
 **/
class TemplateTest {

    @Test
    void templateMethod() {
        Template template = new Template();
        List<String> result = template.templateMethod(new ArrayList<>(Arrays.asList(1L, 2L)) ,(param) -> {
            List<String> r = new ArrayList<>();
            param.forEach(p -> r.add(p + "str"));
            return r;
        });

        assertEquals(new ArrayList<>(Arrays.asList("1str", "2str")), result);
    }
}