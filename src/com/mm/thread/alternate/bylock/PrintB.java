package com.mm.thread.alternate.bylock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author: shmily
 * @date: Create in 2017/12/27 11:45
 **/
public class PrintB implements Runnable {
    private Num num;
    private Lock lock;
    private Condition conditionA;
    private Condition conditionB;

    public PrintB(Num num, Lock lock, Condition conditionA, Condition conditionB) {
        this.num = num;
        this.lock = lock;
        this.conditionA = conditionA;
        this.conditionB = conditionB;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            while (num.i < 10) {
                if (num.flag) {
                    System.out.println(Thread.currentThread().getName() + ":" + num.i++);
                    num.flag = false;
                    conditionA.signal();
                } else {
                    conditionB.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
