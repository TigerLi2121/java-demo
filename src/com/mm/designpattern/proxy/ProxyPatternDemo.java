package com.mm.designpattern.proxy;

/**
 * 代理模式
 * @author: shmily
 * @date: Create in 2017/12/25 15:45
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_10mb.jpg");
        Image image2 = new RealImage("test_20mb.jpg");
        //图像将从磁盘加载
        image1.display();
        image2.display();
    }
}
