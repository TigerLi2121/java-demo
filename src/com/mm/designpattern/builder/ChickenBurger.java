package com.mm.designpattern.builder;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 16:25
 **/
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}
