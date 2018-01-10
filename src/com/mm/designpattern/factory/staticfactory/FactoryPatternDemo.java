package com.mm.designpattern.factory.staticfactory;

/**
 * 静态工厂模式
 * @author: shmily
 * @date: Create in 2017/12/25 14:32
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = ShapeFactory.getCircle();

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = ShapeFactory.getRectangle();

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = ShapeFactory.getSquare();

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
