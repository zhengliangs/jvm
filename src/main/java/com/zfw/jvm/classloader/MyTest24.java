package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest24
 */
public class MyTest24 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
    }
}
