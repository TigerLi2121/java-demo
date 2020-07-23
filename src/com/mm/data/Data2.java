package com.mm.data;

import java.util.Arrays;

/**
 * @author lwl
 * @date 2019/9/3
 */
public class Data2 {

    public static void show(String a) {
        a += "as";
        System.out.println(a);
    }

    public static void main(String[] args) {
        String a = "cc";
        show(a);
        System.out.println(a);
    }
}
