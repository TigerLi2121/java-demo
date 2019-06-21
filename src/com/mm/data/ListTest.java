package com.mm.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * list
 *
 * @author lwl
 * @date 2019/6/13
 */
public class ListTest {
    public static void main(String[] args) {
        String s = "1,2,3,4,5,6";
        Arrays.asList(s.split(",")).forEach(System.out::println);
        List<String> ss = new ArrayList<>();
        ss.add("123");
        ss.add(0, "456");
        ss.sort(null);
        ss.forEach(System.out::println);
    }
}
