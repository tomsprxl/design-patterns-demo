package com.example.designpatternsdemo.singleton;

/**
 * 描述:
 * Ⅱ 饿汉式-线程安全
 * 线程不安全问题主要是由于 uniqueInstance 被
 * 实例化多次，采取直接实例化 uniqueInstance
 * 的方式就不会产生线程不安全问题。
 * <p>
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 *
 * @author xuliang
 * @create 2019-09-09 15:55
 */
public class Singleton002 {
    private static Singleton002 uniqueInstance = new Singleton002();

    private Singleton002() {
    }

    public static Singleton002 getUniqueInstance() {

        return uniqueInstance;
    }
}