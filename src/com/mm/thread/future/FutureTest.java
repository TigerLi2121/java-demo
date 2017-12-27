package com.mm.thread.future;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * 获取线程返回结果
 *
 * @author: shmily
 * @date: Create in 2017/12/26 9:34
 **/
public class FutureTest {

    private final static ThreadPoolExecutor executorService = new ThreadPoolExecutor(1,
            1, 1L, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(4),
            new ThreadPoolExecutor.DiscardPolicy());

    public static void main(String[] args) {
        ArrayList<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            AThread aThread = new AThread(i);
            Future<String> future = executorService.submit(aThread);
            futures.add(future);
        }
        System.out.println("获取结果中...");
        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("得到结果.");
        executorService.shutdown();
    }
}
