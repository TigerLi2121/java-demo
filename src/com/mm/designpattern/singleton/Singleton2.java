package com.mm.designpattern.singleton;

/**
 * 懒汉，线程安全
 *
 * @author: shmily
 * @date: Create in 2017/12/25 10:21
 **/
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
