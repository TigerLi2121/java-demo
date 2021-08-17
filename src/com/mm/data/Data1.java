package com.mm.data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
//        Data1 t = new Data1();
//        String a = "Hello";
//        Integer b = new Integer(12);
//        t.str(a);
//        t.ing(b);
//        System.out.println(a);
//        System.out.println(b);

//        System.out.println(12>>1);
        List<A> as = Arrays.asList(new A("a", 4), new A("b", 2));
        A a1 = as.stream().max(Comparator.comparing(A::getAge)).get();
        System.out.println(a1);
    }

    static class A {
        public String name;

        public int age;

        public A(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
