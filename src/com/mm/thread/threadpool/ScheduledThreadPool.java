package com.mm.thread.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 定长线程池
 * 定时及周期性任务执行。
 * @author: shmily
 * @date: Create in 2017/12/26 17:23
 **/
public class ScheduledThreadPool {
    private final static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int a = i;
            executorService.schedule(() -> {
                System.out.println(a);
            }, 3, TimeUnit.SECONDS);
        }
    }
}
