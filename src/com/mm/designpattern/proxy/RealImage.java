package com.mm.designpattern.proxy;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 15:38
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying:" + fileName);
    }
}
