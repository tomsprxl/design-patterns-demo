package com.example.designpatternsdemo.singleton;

/**
 * 描述:
 * Ⅴ 静态内部类实现
 * 当 Singleton006 类被加载时，静态内部类 SingletonHolder
 * 没有被加载进内存。只有当调用 getUniqueInstance()
 * 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder
 * 才会被加载，此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 * <p>
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 *
 * @author xuliang
 * @create 2019-09-09 16:23
 */
public class Singleton005 {

    private Singleton005() {
    }

    private static class SingletonHolder {
        private static final Singleton005 INSTANCE = new Singleton005();
    }

    public static Singleton005 getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }

}