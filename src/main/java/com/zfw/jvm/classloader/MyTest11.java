package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @className MyTest11
 * @description TODO
 * @date 2020/3/23
 */
public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(Child11.p);
        System.out.println("-------------");
        Child11.doSomething();
    }
}

class Parent11{
    static int p =11;// 2

    static {
        System.out.println("Parent11"); // 1
    }

    static void doSomething(){
        System.out.println("do something");//  3
    }
}

class Child11 extends  Parent11{

    static {
        System.out.println("Child11");
    }
}
