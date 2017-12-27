package com.mm.thread.future;

import java.util.concurrent.Callable;

/**
 * @author: shmily
 * @date: Create in 2017/12/26 9:35
 **/
public class AThread implements Callable {

    private int id;

    public AThread(int id){
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        System.out.println("线程:" + id + " -> 运行...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程:" + id + " -> 结束.");
        return "返回的字符串:" + id;
    }
}
