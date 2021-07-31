package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest8
 * @date 2020/3/23
 */
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.i);
    }
}

class FinalTest{
//    public static final int i = 9;

    //  final修饰且编译期可以确定  i  的值不会初始化 FinalTest
    //  否则会初始化
    public static final int i = 1;

    static {
        System.out.println("FinalTest");
    }
}
