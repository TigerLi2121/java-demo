package com.mm.designpattern.singleton.singleton2;

/**
 * 懒汉(同步方法)
 * 优点：线程安全
 * 缺点：同步效率太低
 *
 * @author: shmily
 **/

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    // 加入同步代码块，解决线程不安全问题
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}