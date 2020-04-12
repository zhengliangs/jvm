package com.zfw.jvm.test;

import org.junit.Test;

/**
 * @author hero良
 * @classname MyTest1
 */
public class MyTest1 {

    /*
       最后j的值为0；因为j++的计算是在压入栈后在才执行的，但是对栈顶的值没有影响。
     */
    @Test
    public void t1(){
        int j = 0;
        for(int i = 0;i < 10;i++){
            j = (j++);
        }
        System.out.println(j);
    }
}
