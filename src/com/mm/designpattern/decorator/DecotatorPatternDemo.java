package com.mm.designpattern.decorator;

/**
 * 装饰者模式
 * @author shmily
 * @date 2018-01-08 08:08:08
 */
public class DecotatorPatternDemo {
    public static void main(String[] args) {
        AbstractGirl girl1 = new AmericanGirl();
        System.out.println(girl1.getDescription());

        GoldenHair girl2 = new GoldenHair(girl1);
        System.out.println(girl2.getDescription());

        Tall girl3  = new Tall(girl2);
        System.out.println(girl3.getDescription());

        AbstractGirl cgirl1 = new ChineseGirl();
        System.out.println(cgirl1.getDescription());

        Tall cgril2 = new Tall(cgirl1);
        System.out.println(cgril2.getDescription());
    }
}
