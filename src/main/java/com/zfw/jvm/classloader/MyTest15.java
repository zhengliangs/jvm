package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest15
 * @date 2020/3/28
 */
public class MyTest15 {

    public static void main(String[] args) {

        String[] strings = new String[2];
        System.out.println(strings.getClass());//class [Ljava.lang.String;
        System.out.println(strings.getClass().getClassLoader());//null  表示根类加载器

        MyTest15[] myTest15s = new MyTest15[2];
        System.out.println(myTest15s.getClass());//class [Lcom.zfw.jvm.classloader.MyTest15;
        System.out.println(myTest15s.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2

        int[] ints = new int[2];
        System.out.println(ints.getClass());//class [I
        System.out.println(ints.getClass().getClassLoader());//null  表示没有类加载器，不是根类加载器
    }
}
