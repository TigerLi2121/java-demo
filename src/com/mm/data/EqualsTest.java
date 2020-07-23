package com.mm.data;

import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {
        Long a = 999L;
        Long b = 999L;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(Objects.equals(a, b));
    }
}
