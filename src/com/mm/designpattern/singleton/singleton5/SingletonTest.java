package com.mm.designpattern.singleton.singleton5;

/**
 * 饿汉(静态代码块)
 * 优点：写法简单；在类装载时就完成实例化，避免了线程同步问题
 * 缺点：没有达到Lazy Loading效果，浪费内存
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

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
