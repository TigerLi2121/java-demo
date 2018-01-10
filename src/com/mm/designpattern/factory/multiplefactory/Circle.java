package com.mm.designpattern.factory.multiplefactory;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 14:23
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
