package com.example.designpatternsdemo.创建型模式.singleton;

/**
 * Ⅰ 懒汉式-线程不安全
 * 以下实现中，私有静态变量 uniqueInstance 被延迟实例化，
 * 这样做的好处是，如果没有用到该类，那么就不会
 * 实例化 uniqueInstance，从而节约资源。
 * <p>
 * 这个实现在多线程环境下是不安全的，如果多个线程能够同时
 * 进入 if (uniqueInstance == null) ，
 * 并且此时 uniqueInstance 为 null，那么会有多个线程
 * 执行 uniqueInstance = new Singleton006(); 语句，
 * 这将导致实例化多次 uniqueInstance。
 */
public class Singleton001 {

    private static Singleton001 uniqueInstance;

    private Singleton001() {
    }

    public static Singleton001 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton001();
        }
        return uniqueInstance;
    }
}