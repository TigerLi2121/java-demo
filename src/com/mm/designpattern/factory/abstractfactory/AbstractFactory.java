package com.mm.designpattern.factory.abstractfactory;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 14:35
 **/
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
