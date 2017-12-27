package com.mm.designpattern.builder;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 16:23
 **/
public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
