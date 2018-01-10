package com.mm.designpattern.decorator;

public class Tall extends GirlDecorator {

    private Girl girl;

    public Tall(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+is very tall";
    }
}
