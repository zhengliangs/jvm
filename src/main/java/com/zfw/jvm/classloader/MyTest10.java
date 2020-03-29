package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest10
 * @date 2020/3/23
 */
public class MyTest10 {

    static {
        System.out.println("MyTest10");//1
    }

    public static void main(String[] args) {
        Parent10 parent10;
        System.out.println("--------");
        parent10 = new Parent10();
        System.out.println("--------");
        System.out.println(parent10.p);
        System.out.println("--------");
        System.out.println(Child10.c);
//        new Child10();

    }
}

class Parent10{
    public static int p = 10;//3

    static {
        System.out.println("Parent10");//2
    }
}

class Child10 extends Parent10{
    public static int c = 8;//5

    //初始化阶段不会输出，只有创建实例才会输出
    {
        System.out.println("代码块");
    }
    static {
        System.out.println("Child10");//4
    }
}
