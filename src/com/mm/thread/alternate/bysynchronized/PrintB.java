package com.mm.thread.alternate.bysynchronized;

/**
 * @author: shmily
 * @date: Create in 2017/12/27 11:19
 **/
public class PrintB implements Runnable {
    private Num num;

    public PrintB(Num num){
        this.num  = num;
    }

    @Override
    public void run() {
        while (num.i <= 10) {
            synchronized (num){
                if (!num.flag){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName()+":"+num.i);
                    num.flag = false;
                    num.i++;
                    num.notify();
                }
            }
        }
    }
}
