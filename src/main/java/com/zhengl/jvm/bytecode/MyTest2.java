package com.zhengl.jvm.bytecode;

/**
 * @author hero良
 * @classname MyTest2
 */
public class MyTest2 {

    String str = "Welcome";

    private int x = 5;

    public static Integer in = 10;

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();

        myTest2.setX(8);

        in = 12;
    }

    private synchronized void setX(int x) {
        this.x = x;
    }

    private void test(String str){
        synchronized (str){
            System.out.println(str);
        }
    }

    //synchronized修饰静态方法，表示锁的是MyTest2对象所对应的Class对象
    private synchronized static void test2(){

    }
}
