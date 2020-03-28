package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @className MyTest6
 * @date 2020/3/22
 */
public class MyTest6 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("a==="+instance.a);
        System.out.println("b==="+instance.b);
    }
}
class Singleton{
    public static int a;

    //准备  构造器不会运行
    private Singleton(){
        a++;
        b++;
    }
    //准备  赋予null
    private static Singleton singleton = new Singleton();

    public static int b = 0;

    public static Singleton getInstance(){
        return singleton;
    }
}
