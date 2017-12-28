package com.mm.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁
 *
 * @author: shmily
 * @date: Create in 2017/12/27 16:33
 **/
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        PrintHello printHello = new PrintHello(countDownLatch);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 6; i++) {
            new Thread(printHello).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start)+"ms");
    }
}
