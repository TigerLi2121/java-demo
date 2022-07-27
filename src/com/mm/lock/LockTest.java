package com.mm.lock;

import java.util.concurrent.TimeUnit;

public class LockTest {

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        new Thread(() -> {
            synchronized (a) {
                System.out.println("获取a锁");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b) {
                    System.out.println("获取b锁");
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (b) {
                System.out.println("获取b锁");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a) {
                    System.out.println("获取a锁");
                }
            }
        }).start();

    }
}
