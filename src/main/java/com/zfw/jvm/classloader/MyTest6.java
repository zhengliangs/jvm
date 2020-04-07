package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest6
 * @date 2020/3/22
 */
public class MyTest6 {

    public static void main(String[] args) {
        //访问了静态方法，导致类的初始化
        /*
            类的初始化步骤
            1.如果类没有被加载和连接，那就先加载和连接
            2.如果类存在父类并且没有被初始化，那就先初始化其父类
            3.假如类中存在初始化语句，那就依次执行他们
         */
        Singleton instance = Singleton.getInstance();
        System.out.println("a==="+instance.a);
        System.out.println("b==="+instance.b);
    }
}
class Singleton{
    // 1 准备  赋予默认值  0
    // 2 初始化 依然为 0
    public static int a;

    // 1 准备  构造器不会运行
    // 2 不会执行
    private Singleton(){
        a++;
        b++;
    }
    // 1 准备  赋予null
    // 2 调用构造器  此时  a == 1,b == 1
    private static Singleton singleton = new Singleton();

    // 1 准备 赋予默认值  0
    // 2 初始化 b == 0
    public static int b = 0;

    public static Singleton getInstance(){
        return singleton;
    }
}
