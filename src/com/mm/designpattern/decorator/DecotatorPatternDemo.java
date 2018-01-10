package com.mm.designpattern.decorator;

/**
 * 装饰者模式
 */
public class DecotatorPatternDemo {
    public static void main(String[] args) {
        Girl girl1 = new AmericanGirl();
        System.out.println(girl1.getDescription());

        GoldenHair girl2 = new GoldenHair(girl1);
        System.out.println(girl2.getDescription());

        Tall girl3  = new Tall(girl2);
        System.out.println(girl3.getDescription());

        System.out.println(new Tall(new GoldenHair(new AmericanGirl())).getDescription());
    }
}
