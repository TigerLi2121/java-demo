package com.mm.designpattern.factory.abstractfactory;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 14:38
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        switch (color){
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
