package com.mm.designpattern.adapter;

/**
 * 三相转两相适配器
 * @author shmily
 */
public class TwoPlugAdapter implements ThreePlugIf {

    private TwoPlug twoPlug;

    public TwoPlugAdapter(TwoPlug twoPlug) {
        this.twoPlug = twoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        twoPlug.powerWithTwo();
    }
}
