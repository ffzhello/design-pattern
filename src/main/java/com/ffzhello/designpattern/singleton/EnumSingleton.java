package com.ffzhello.designpattern.singleton;

/**
 * @author ff.zheng
 * 枚举实现的单例
 */
public enum EnumSingleton {
  /**
   * 单例
   **/
  SINGLETON;

  public void bizMethod() {
    System.out.println("业务方法");
  }

  public static EnumSingleton getInstance() {
    return SINGLETON;
  }
}
