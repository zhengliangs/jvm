package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @className MyTest12
 * @description TODO
 * @date 2020/3/23
 */

//调用ClassLoad类的loadClass方法加载一个类，不会对类主动使用，并不会导致类的初始化
public class MyTest12 {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = classLoader.loadClass("com.zfw.jvm.classloader.CL");
        System.out.println(clazz);

        System.out.println("------");

        Class<?> clazz1 = Class.forName("com.zfw.jvm.classloader.CL");
        System.out.println(clazz1);

    }
}

class CL{
    static {
        System.out.println("CL");
    }
}
