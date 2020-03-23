package com.zfw.jvm.classloader;

import java.util.Random;

/**
 * @author hero良
 * @className MyTest5
 * @description TODO
 * @date 2020/3/22
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.p);
    }
}

interface MyParent5{
    int p = 4;
}
interface MyChild5 extends MyParent5{
    int c = 3;
}
