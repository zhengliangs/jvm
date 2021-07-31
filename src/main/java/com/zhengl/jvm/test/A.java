package com.zhengl.jvm.test;

/**
 * @author hero良
 * @classname A
 */
public class A {

    static {
        System.out.println("A");
    }

    int a = 1;
    double d =2.0;

    public void show(){
        System.out.println("Class A");
    }
}

class B extends A{

    static {
        System.out.println("B");
    }

    float a = 3.0f;

    String d = "Java";

    public void show(){
//        super.show();
        System.out.println("Class B");
    }
}
