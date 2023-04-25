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
        int count = 5;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName()+":"+ finalI);
                    Thread.sleep(1000);
                } catch (Exception e) {
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
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
