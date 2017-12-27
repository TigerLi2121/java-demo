package com.mm.designpattern.singleton;

/**
 * 静态内部类
 *
 * @author: shmily
 * @date: Create in 2017/12/25 10:26
 **/
public class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {
    }

    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
