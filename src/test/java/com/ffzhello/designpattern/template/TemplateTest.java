package com.ffzhello.designpattern.template;

import com.ffzhello.designpattern.template.callback.Callback;
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
        List<String> result = template.templateMethod(new ArrayList<>(Arrays.asList(1L, 2L)), new Callback<List<Long>, List<String>>() {

            /**
             * 模板方法虽然解决了代码的复用和扩展问题
             * 但也带来了新的问题：模板方法使用继承，会导致子类泛滥
             *
             * @param param 参数
             * @return R
             **/
            @Override
            public List<String> customMethod(List<Long> param) {
                List<String> result = new ArrayList<>();
                param.forEach(p -> {
                    result.add(p + "str");
                });

                return result;
            }
        });

        assertEquals(new ArrayList<>(Arrays.asList("1str", "2str")), result);
    }
}