package com.mm.designpattern.singleton.singleton8;

/**
 * 枚举
 * 优点：避免多线程，防止反序列化重新创建新对象
 *
 * @author: shmily
 **/
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.EnumSingleton.INSTANCE.getInstance();
        Singleton singleton2 = Singleton.EnumSingleton.INSTANCE.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {

    private Singleton() {
    }

    public enum EnumSingleton {
        INSTANCE;

        private Singleton instance;

        EnumSingleton() {
            instance = new Singleton();
        }

        public Singleton getInstance() {
            return instance;
        }
    }
}
