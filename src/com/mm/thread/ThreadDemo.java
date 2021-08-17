package com.mm.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lwl
 */
public class ThreadDemo {

    static ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1,
            0, TimeUnit.SECONDS, new LinkedBlockingQueue(), r -> new Thread(r, "aaa"));

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            pool.execute(()-> System.out.println(finalI));
        }
        pool.shutdown();
    }

}
