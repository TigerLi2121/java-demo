package com.mm.data;

import java.util.Arrays;

/**
 * @author lwl
 * @date 2019/9/3
 */
public class Data2 {

    public void show(String a, String... as) {
        System.out.println(a);
        Arrays.asList(as).forEach(s -> System.out.print(s));
        System.out.println();
    }

    public static void main(String[] args) {
        Data2 d = new Data2();
        d.show("a");
        d.show("b", "c");

        d.show("b", "c", "d");
    }
}
