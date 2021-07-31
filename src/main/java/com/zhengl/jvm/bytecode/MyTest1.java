package com.zhengl.jvm.bytecode;

/**
 * @author hero良
 * @classname MyTest1
 */
public class MyTest1 {

    private int a = 1;

    private Integer b = 2;

//    private String str;
//
//    public MyTest1(int a) {
//        this.a = a;
//    }
//
//    public MyTest1() {
//    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
