package com.mm.designpattern.singleton;

/**
 * 枚举
 * @author: shmily
 * @date: Create in 2017/12/25 10:35
 * 获取实例：EunmSingleton.INSTANCE.getInstance()
 **/
public class Singleton6 {

    private Singleton6(){}

    private enum EunmSingleton{
        INSTANCE;

        private Singleton6 instance;

        EunmSingleton(){
            instance = new Singleton6();
        }

        public Singleton6 getInstance(){
            return instance;
        }
    }
}
