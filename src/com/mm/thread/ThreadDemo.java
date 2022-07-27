package com.mm.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lwl
 */
public class ThreadDemo {

    static class PoolThreadFactory implements ThreadFactory {

        private final String namePrefix;

        private final AtomicInteger nextId = new AtomicInteger(1);

        PoolThreadFactory(String namePrefix) {
            this.namePrefix = namePrefix;
        }

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, namePrefix + "-" + nextId);
        }
    }

    static ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10,
            0, TimeUnit.SECONDS, new LinkedBlockingQueue(), new PoolThreadFactory("test"));

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            pool.execute(() -> System.out.println(Thread.currentThread().getName() + " = " + finalI));
        }
//        pool.shutdown();
//        long s = System.currentTimeMillis();
//        List<Integer> list = Arrays.asList(1, 2, 3);
//        list = list.stream().map(e -> CompletableFuture.supplyAsync(() -> {
//                    System.out.println(Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(1000L);
//                    } catch (InterruptedException ex) {
//                        ex.printStackTrace();
//                    }
//                    return e + 1;
//                }, pool))
//                .collect(Collectors.toList())
//                .stream()
//                .map(CompletableFuture::join)
//                .collect(Collectors.toList());
//        list = list.stream().map(e -> {
//                    try {
//                        Thread.sleep(1000L);
//                    } catch (InterruptedException ex) {
//                        ex.printStackTrace();
//                    }
//                    return ++e;
//                })
//                .collect(Collectors.toList());

//        list.forEach(System.out::println);
//        System.out.println(System.currentTimeMillis()  - s);

//        for (int i = 0; i < 100; i++) {
//            Thread.sleep(1000);
//            CompletableFuture.runAsync(() -> {
//                System.out.println("1");
//            }).get();
//        }
//        Thread.sleep(Integer.MAX_VALUE);
    }

}
