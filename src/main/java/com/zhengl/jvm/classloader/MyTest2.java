package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest2
 * @date 2020/3/21
 */
// 助记符
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.q);
    }
}
class MyParent2{
    public static final int i = 5;
    public static final double d = 5;
    public static final int m = -1;
    public static final int q = 0;
}
