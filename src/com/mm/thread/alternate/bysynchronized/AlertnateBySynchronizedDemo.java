package com.mm.thread.alternate.bysynchronized;

/**
 * 线程交替执行
 * @author: shmily
 * @date: Create in 2017/12/27 11:25
 **/
public class AlertnateBySynchronizedDemo {
    public static void main(String[] args) {
        Num num = new Num();
        PrintA printA = new PrintA(num);
        PrintB printB = new PrintB(num);
        Thread thread1 = new Thread(printA,"A");
        Thread thread2 = new Thread(printB,"B");
        thread1.start();
        thread2.start();
    }
}
