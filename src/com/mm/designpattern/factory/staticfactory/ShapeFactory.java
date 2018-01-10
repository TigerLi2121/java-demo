package com.mm.designpattern.factory.staticfactory;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 14:30
 **/
public class ShapeFactory {
    public static Shape getCircle(){
        return new Circle();
    }

    public static Shape getRectangle(){
        return new Rectangle();
    }

    public static Shape getSquare(){
        return new Square();
    }
}
