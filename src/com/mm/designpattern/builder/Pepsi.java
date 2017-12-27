package com.mm.designpattern.builder;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 16:36
 **/
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 8.5f;
    }
}
