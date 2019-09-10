package com.example.designpatternsdemo.创建型模式.singleton;

/**
 * 描述:
 * Ⅳ 双重校验锁-线程安全
 * uniqueInstance 只需要被实例化一次，之后就可以直接
 * 使用了。加锁操作只需要对实例化那部分的代码进行，
 * 只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
 * <p>
 * 双重校验锁先判断 uniqueInstance 是否已经被实例化，
 * 如果没有被实例化，那么才对实例化语句进行加锁。
 *
 * @author xuliang
 * @create 2019-09-09 16:03
 */
public class Singleton004 {
    private volatile static Singleton004 uniqueInstance;

    private Singleton004() {
    }

    public static Singleton004 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton004.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton004();
                }
            }
        }
        return uniqueInstance;
    }
}