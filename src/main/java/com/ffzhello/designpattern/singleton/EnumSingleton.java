package com.ffzhello.designpattern.singleton;

/**
 * @author ff.zheng
 * 枚举实现的单例：构造方法只能被虚拟机调用，可以防止反射攻击
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
