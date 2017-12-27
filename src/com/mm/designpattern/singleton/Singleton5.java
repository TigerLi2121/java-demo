package com.mm.designpattern.singleton;

/**
 * 双重校验锁
 *
 * @author: shmily
 * @date: Create in 2017/12/25 10:29
 **/
public class Singleton5 {
    private volatile static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
