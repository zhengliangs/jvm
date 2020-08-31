package com.zfw.jvm.memory;

/**
 * @author hero良
 * @classname StringPool
 */
public class StringPool {

    public static void main(String[] args) {

        String str2 = new String("hello world");
        String str1 = "hello world";
        System.out.println(str1 == str2);//false

        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);//false

//        String s3 = new String("1") + new String("1");
//        s3.intern();
//        String s4 = "11";
//        System.out.println(s3 == s4);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println(s3 == s4);
    }
}
