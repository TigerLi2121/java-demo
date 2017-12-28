package com.mm.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author: shmily
 * @date: Create in 2017/12/27 16:30
 **/
public class PrintHello implements Runnable {
    private CountDownLatch countDownLatch;

    public PrintHello(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        synchronized(this){
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i+":Hello World!");
                }
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }
    }
}
