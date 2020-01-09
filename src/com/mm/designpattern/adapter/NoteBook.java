package com.mm.designpattern.adapter;

/**
 * 适配器模式
 * @author shmily
 */
public class NoteBook {

    private ThreePlugIf threePlugIf;

    public NoteBook(ThreePlugIf threePlugIf){
        this.threePlugIf = threePlugIf;
    }

    /**
     * 充电
     */
    public void charge(){
        threePlugIf.powerWithThree();
    }

    public static void main(String[] args) {
        TwoPlug twoPlug = new TwoPlug();
        ThreePlugIf threePlugIf = new TwoPlugAdapter(twoPlug);
        NoteBook noteBook = new NoteBook(threePlugIf);
        noteBook.charge();
    }

}
