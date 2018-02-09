package com.mm.designpattern.decorator;

/**
 * @author Shmily
 * @date 2018-01-08 08:08:08
 */
public class GoldenHair extends AbstractGirlDecorator {

    private AbstractGirl girl;

    public GoldenHair(AbstractGirl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+with golden hair";
    }
}
