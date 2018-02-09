package com.mm.designpattern.decorator;

/**
 * @author Shmily
 * @date 2018-01-08 08:08:08
 */
public class Tall extends AbstractGirlDecorator {

    private AbstractGirl girl;

    public Tall(AbstractGirl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+is very tall";
    }
}
