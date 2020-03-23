package com.zfw.jvm.classloader;

import java.util.UUID;

/**
 * @author hero良
 * @className MyTest3
 * @description TODO
 * @date 2020/3/22
 */
public class MyTest3 {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}
class MyParent3{
    public static final String str = UUID.randomUUID().toString();

    static{
        System.out.println("MyParent3 static code");
    }
}
