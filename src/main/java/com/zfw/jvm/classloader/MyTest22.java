package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest22
 */
public class MyTest22 {

    static {
        System.out.println("MyTest22 init");
    }

    public static void main(String[] args) {
        System.out.println(MyTest22.class.getClassLoader());

        System.out.println(MyTest1.class.getClassLoader());
    }
}
