package com.mm.designpattern.singleton;

/**
 * 饿汉
 *
 * @author: shmily
 * @date: Create in 2017/12/25 10:23
 **/
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
