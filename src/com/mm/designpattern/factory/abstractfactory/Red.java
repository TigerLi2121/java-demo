package com.mm.designpattern.factory.abstractfactory;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 14:34
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
