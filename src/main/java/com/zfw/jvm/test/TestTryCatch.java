package com.zfw.jvm.test;

/**
 * 测试try之后finally是否会修改返回值
 * @author hero良
 * @classname TestTryCatch
 * @date 2020/3/28
 */
public class TestTryCatch {
    public static void main(String[] args) {
        TestTryCatch test = new TestTryCatch();
        System.out.println(test.fun());
        //结果为10
        System.out.println(test.fun1());
        //结果为HelloWordfinally

        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        System.out.println("b==="+b.hashCode());

        method(a, b);
        System.out.println("b==="+b.hashCode());

        System.out.println(a + "," + b);
    }

    public static void method(StringBuffer x, StringBuffer y){

        x.append(y);
        System.out.println("y==="+y.hashCode());
        y = x;
        System.out.println("y==="+y.hashCode());
    }

    public int fun() {
        int i = 10;
        try {
            String str = new String();
            //doing something
            return i;
        } catch (Exception e) {
            return i;
        } finally {
            i = 20;
        }
    }

    public StringBuilder fun1() {
        StringBuilder s = new StringBuilder("Hello");
        try {
            //doing something
            s.append("Word");
            return s;
        } catch (Exception e) {
            return s;
        } finally {
            s = new StringBuilder("qwe");
//            s.append("finally");
        }
    }
}
