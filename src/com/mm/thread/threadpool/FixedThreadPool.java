package com.mm.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定长线程池
 * 可控制线程最大并发数，超出的线程会在队列中等待。
 * @author: shmily
 * @date: Create in 2017/12/26 17:23
 **/
public class FixedThreadPool {
    private final static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int a = i;
            executorService.submit(() -> {
                System.out.println(a);
            });
        }
    }
}
