package com.zfw.jvm.classloader;

import sun.misc.Launcher;

/**
 * @author hero良
 * @classname MyTest23
 */
public class MyTest23 {

    public static void main(String[] args) {
        System.out.println("bootstrap===  " + System.getProperty("sun.boot.class.path"));
        System.out.println("extension===  " + System.getProperty("java.ext.dirs"));
        System.out.println("system===  " + System.getProperty("java.class.path"));

        System.out.println("classloader : " + ClassLoader.class.getClassLoader());

        System.out.println("launcher: " + Launcher.class.getClassLoader());

        System.out.println("-----------");

        //java -Djava.system.class.loader=com.zfw.jvm.classloader.MyTest16 com.zfw.jvm.classloader.MyTest23

        System.out.println(System.getProperty("java.system.class.loader"));

        System.out.println(MyTest23.class.getClassLoader());

        System.out.println(MyTest16.class.getClassLoader());

        System.out.println(ClassLoader.class.getClassLoader());
    }
}
