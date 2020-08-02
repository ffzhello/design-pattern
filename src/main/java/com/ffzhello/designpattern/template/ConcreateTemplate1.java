package com.ffzhello.designpattern.template;

/**
 * @author ffzhello
 * @since 2020/8/2
 **/
public class ConcreateTemplate1 extends AbstractTemplate<String,  Long> {

    /**
     * 子类中的个性化方法(扩展)
     *
     * @param param P
     * @return R
     **/
    @Override
    protected Long customMethod(String param) {
        return Long.valueOf(param);
    }
}
