package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest9
 * @date 2020/3/23
 */
public class MyTest9 {
    //  1
    static {
        System.out.println("MyTest9");
    }

    public static void main(String[] args) {
//        System.out.println(Parent9.p);
        System.out.println(Child9.c);
    }
}

class Parent9{
    public static int p = 1;
    //  2
    static {
        System.out.println("Parent9");
    }
}

class Child9 extends Parent9{
    public static int c = 5;
    //  3
    static {
        System.out.println("Child9");
    }
}
