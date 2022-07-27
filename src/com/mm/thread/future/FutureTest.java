package com.mm.thread.future;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * 获取线程返回结果
 *
 * @author: shmily
 **/
public class FutureTest {

    private final static ThreadPoolExecutor executorService = new ThreadPoolExecutor(2,
            4, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(4),
            new ThreadPoolExecutor.DiscardPolicy());

    public static void main(String[] args) {
        ArrayList<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Future<String> future = executorService.submit(new A(i));
            futures.add(future);
        }
        futures.stream().parallel().map(e -> {
            try {
                System.out.println(e.get());
                return e.get();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return "";
        }).collect(Collectors.toList());
        executorService.shutdown();
    }

    static class A implements Callable {
        private Integer a;

        public A(Integer a) {
            this.a = a;
        }

        @Override
        public Object call() {
            if (a == 2) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return Thread.currentThread().getName() + " === " + a;
        }
    }
}
