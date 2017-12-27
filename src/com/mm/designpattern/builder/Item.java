package com.mm.designpattern.builder;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 16:27
 **/
public interface Item {
    String name();
    Packing packing();
    float price();
}
