package com.zhengl.jvm.classloader;

import java.util.UUID;

/**
 * @author hero良
 * @classname MyTest3
 * @date 2020/3/22
 */
public class MyTest3 {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}
class MyParent3{
    //编译期无法确定
    public static final String str = UUID.randomUUID().toString();
    //编译期可以确定
//    public static final String str = "hello world";

    static{
        System.out.println("MyParent3 static code");
    }
}
