package com.zfw.jvm.StringPool;

/**
 * @author hero良
 * @classname Test2
 */
public class Test2 {

    public static void main(String[] args) {
        String t1 = new String("hello");
        t1.intern();
        String t2 = "hello";
        System.out.println(t1 == t2);//false

        String t3 = new String("wor") + new String("ld");
        t3.intern();
        String t4 = "world";
        System.out.println(t3 == t4);//true
    }

}
