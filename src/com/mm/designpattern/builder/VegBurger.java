package com.mm.designpattern.builder;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 16:25
 **/
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
