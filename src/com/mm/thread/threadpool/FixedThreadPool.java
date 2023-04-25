package com.mm.thread.threadpool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * 定长线程池
 * 可控制线程最大并发数，超出的线程会在队列中等待。
 *
 * @author: shmily
 * @date: Create in 2017/12/26 17:23
 **/
public class FixedThreadPool {

    public static volatile int stop = 0;

    public static void main(String[] args) {
        int n = 5,t = 20;
         ExecutorService es = Executors.newFixedThreadPool(n);
        List<Future> fs = new ArrayList<>();
        long s = System.currentTimeMillis();
        for (int i = 0; i < t; i += n) {
            long s1 = System.currentTimeMillis();
            int jc = i + n;
            jc = jc >= t ? t : jc;
            for (int j = i; j < jc ; j++) {
                final int a = j;
                Future<?> f = es.submit(() -> {
                    System.out.println(Thread.currentThread().getName()+":" +a);
                    if (a == 3 || a == 4) {
                        stop ++;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                });
                fs.add(f);
            }
            for (Future f : fs) {
                try {
                    f.get();
                } catch (Exception e) {
                    es.shutdownNow();
                }
            }
            fs.clear();
            System.out.println(i +":"+ (System.currentTimeMillis() - s1));
            if (stop == 3) {
                break;
            }
        }

        System.out.println("total:"+ (System.currentTimeMillis() - s));
        es.shutdown();
    }
}
