package com.ffzhello.designpattern.singleton;

/**
 * @author ff.zheng
 */
public class LazySingleton {

  private static LazySingleton singleton = new LazySingleton();

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    return singleton;
  }
}
