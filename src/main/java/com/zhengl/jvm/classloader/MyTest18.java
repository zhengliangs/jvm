package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest18
 */
public class MyTest18 {

    public static void main(String[] args) {
        System.out.println("bootstrap===  " + System.getProperty("sun.boot.class.path"));
        System.out.println("extension===  " + System.getProperty("java.ext.dirs"));
        System.out.println("system===  " + System.getProperty("java.class.path"));
    }
}
