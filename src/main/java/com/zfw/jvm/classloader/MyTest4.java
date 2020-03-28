package com.zfw.jvm.classloader;

import java.sql.SQLOutput;

/**
 * @author hero良
 * @className MyTest4
 * @date 2020/3/22
 */
public class MyTest4 {
    public static void main(String[] args) {
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());
        System.out.println(myParent4s.getClass().getSuperclass());
//
//        MyParent4 myParent4 = new MyParent4();
//        System.out.println(myParent4.getClass());

        int[] ints = new int[1];
        System.out.println(ints.getClass());

        double[] doubles = new double[1];
        System.out.println(doubles.getClass());
        System.out.println(doubles.getClass().getSuperclass());

        String[] strings = new String[1];
        System.out.println(strings.getClass());
    }


}
class MyParent4{
    static{
        System.out.println("MyParent4 static block");
    }
}
