package com.mm.thread.total;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 测试多线程效率
 * @author lwl
 * @date 2019/6/21
 */
public class TotalThread {

    static ThreadPoolExecutor pool = new ThreadPoolExecutor(20, 200,
            60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), r -> new Thread(r, "pool"));

    public static int incre(int i){
        i += 1;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void main(String[] args) {
        int total = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            total += incre(i);
        }
        System.out.println(total);
        System.out.println("耗时："+ (System.currentTimeMillis() - start));

        long start2 = System.currentTimeMillis();
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = pool.submit(new Increment(i));
            list.add(future);
        }
        int total1 = 0;
        for (Future<Integer> future : list) {
            try {
                total1 += future.get();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } catch (ExecutionException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(total1);
        System.out.println("耗时："+ (System.currentTimeMillis() - start2));
        pool.shutdown();
    }
}

class Increment implements Callable {

    private Integer i;

    public Increment(Integer i){
        this.i = i;
    }

    @Override
    public Integer call() throws Exception {

        return TotalThread.incre(i);
    }
}
