package com.mm.designpattern.proxy;

/**
 * @author: shmily
 * @date: Create in 2017/12/25 15:41
 **/
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
