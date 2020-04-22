package com.zfw.jvm.test;

/**
 * @author hero良
 * @classname JunitTest
 */
public class JunitTest {

    /*
       最后j的值为0；因为j++的计算是在压入栈后在才执行的，但是对栈顶的值没有影响。
     */
    @org.junit.Test
    public void t1(){
        int j = 0;
        for(int i = 0;i < 10;i++){
            j = (j++);
        }
        System.out.println(j);
    }

    @org.junit.Test
    public void t2(){
        A b = new B();
        b.show();
    }

    @org.junit.Test
    public void t3(){
        A b = new A();
        b.show();
    }
}
