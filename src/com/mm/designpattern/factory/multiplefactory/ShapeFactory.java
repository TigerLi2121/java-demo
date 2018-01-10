package com.mm.designpattern.factory.multiplefactory;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 14:30
 **/
public class ShapeFactory {
    public Shape getCircle(){
        return new Circle();
    }

    public Shape getRectangle(){
        return new Rectangle();
    }

    public Shape getSquare(){
        return new Square();
    }
}
