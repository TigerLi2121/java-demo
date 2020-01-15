package com.mm.data;

/**
 * @author lwl
 * @date 2019/9/3
 */
public class Data1 {

    public void str(String a){
        a += " World";
        System.out.println(a);
    }

    public void ing(Integer b){
        b += 12;
        System.out.println(b);
    }

    public static void main(String[] args) {
        Data1 t = new Data1();
        String a = "Hello";
        Integer b = new Integer(12);
        t.str(a);
        t.ing(b);

        System.out.println(a);
        System.out.println(b);
    }
}
