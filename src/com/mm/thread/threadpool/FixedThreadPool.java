package com.mm.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 定长线程池
 * 可控制线程最大并发数，超出的线程会在队列中等待。
 * @author: shmily
 * @date: Create in 2017/12/26 17:23
 **/
public class FixedThreadPool {
    private final static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int a = i;
            executorService.submit(() -> {
                out(a);
            });
        }
        executorService.shutdown();
    }

    private static void out(int a){
        System.out.println(Thread.currentThread().getId()+"-"+Thread.currentThread().getName()+"-"+a);
        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) executorService);
        int queueSize = tpe.getQueue().size();
        System.out.println("当前排队线程数："+ queueSize);

        int activeCount = tpe.getActiveCount();
        System.out.println("当前活动线程数："+ activeCount);

        long completedTaskCount = tpe.getCompletedTaskCount();
        System.out.println("执行完成线程数："+ completedTaskCount);

        long taskCount = tpe.getTaskCount();
        System.out.println("总线程数："+ taskCount);
    }
}
