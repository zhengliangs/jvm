package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest1
 * @date 2020/3/19
 */
/*
对于静态字段来说，只有直接定义了该字段的类才会被初始化
当一个类被初始化时，要求其父类都已经初始化完毕
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
    }
}
class MyParent1{
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1{
    public static String str1 = "welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}
