package com.mm.thread.alternate.bylock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程交替执行
 *
 * @author: shmily
 * @date: Create in 2017/12/27 11:25
 **/
public class AlertnateByLockDemo {
    public static void main(String[] args) {
        Num num = new Num();
        Lock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();
        PrintA printA = new PrintA(num, lock, conditionA, conditionB);
        PrintB printB = new PrintB(num, lock, conditionA, conditionB);
        Thread thread1 = new Thread(printA, "A");
        Thread thread2 = new Thread(printB, "B");
        thread1.start();
        thread2.start();
    }
}
