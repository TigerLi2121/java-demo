package com.mm.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 代理
 *
 * @author shmily
 */
public class ReflexDemo {
    String s;

    public void test() {
        System.out.println("0101");
        s = "hello world";
    }

    public static void main(String[] args) throws Exception {
        String className = "com.mm.reflex.ReflexDemo";
        String methodName = "test";
        Field s;
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        System.out.println(aClass.toString());
        Method declaredMethod = aClass.getMethod(methodName);
        declaredMethod.invoke(o);
        try {
            s = aClass.getDeclaredField("aa");
        } catch (NoSuchFieldException e) {
            s = null;
        }
        System.out.println(s == null);
        //System.out.println(s.get(o));
    }
}
