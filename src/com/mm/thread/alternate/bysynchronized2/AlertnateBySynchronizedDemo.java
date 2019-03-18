package com.mm.thread.alternate.bysynchronized2;

/**
 * 线程交替执行
 *
 * @author: shmily
 * @date: Create in 2017/12/27 11:25
 **/
public class AlertnateBySynchronizedDemo {
    static class SoulutionTask implements Runnable {
        static int val = 0;

        @Override
        public void run() {
            while (val < 10) {
                synchronized (SoulutionTask.class) {
                    System.out.println(Thread.currentThread().getName() + ":" + ++val);
                    SoulutionTask.class.notify();
                    try {
                        SoulutionTask.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new SoulutionTask(), "A").start();
        new Thread(new SoulutionTask(), "B").start();
    }
}
