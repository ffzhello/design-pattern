package com.ffzhello.designpattern.template.callback;

/**
 * @author ffzhello
 * @since 2020/8/2
 **/
@FunctionalInterface
public interface Callback<P, R> {

    /**
     * 模板方法虽然解决了代码的复用和扩展问题
     * 但也带来了新的问题：模板方法使用继承，会导致子类泛滥
     *
     * @param param 参数
     * @return R
     **/
    R customMethod(P param);
}
