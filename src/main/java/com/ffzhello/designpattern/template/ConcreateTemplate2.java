package com.ffzhello.designpattern.template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ffzhello
 * @since 2020/8/2
 **/
public class ConcreateTemplate2 extends AbstractTemplate<List<Long>, List<String>> {
    /**
     * 子类中的个性化方法(扩展)
     *
     * @param param P
     * @return R
     **/
    @Override
    protected List<String> customMethod(List<Long> param) {
        List<String> result = new ArrayList<>();
        param.forEach(str -> result.add(String.valueOf(str)));
        return result;
    }
}
