package com.mm.designpattern.builder;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 16:37
 **/
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 12.5f;
    }
}
