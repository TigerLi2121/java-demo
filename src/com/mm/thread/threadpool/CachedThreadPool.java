package com.mm.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 缓存线程池
 * 如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * @author: shmily
 * @date: Create in 2017/12/26 11:30
 **/
public class CachedThreadPool {
    private final static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int a = i;
            executorService.submit(() -> {
                System.out.println(a);
            });
        }
    }
}
