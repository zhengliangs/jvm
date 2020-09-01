package com.zfw.jvm.StringPool;

/**
 * @author hero良
 * @classname Test1
 */
public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "java";
        s1.intern();
        System.out.println(s1 == s2);//false

        String t3 = new String("hell") + new String("0");
        String t4 = "hello";
        t3.intern();
        System.out.println(t3 == t4);//false
    }

}
