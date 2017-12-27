package com.mm.designpattern.factory.factorymethod;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 14:30
 **/
public class ShapeFactory {
    public Shape getShape(String shapeType){
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
