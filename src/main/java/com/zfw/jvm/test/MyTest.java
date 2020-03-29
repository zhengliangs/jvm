package com.zfw.jvm.test;

import javax.sound.midi.Soundbank;
import java.util.Random;

/**
 * @author hero良
 * @classname MyTest
 * @date 2020/3/22
 */
public class MyTest {
    public static void main(String[] args) {
//        System.out.println(MyChild1.c1);
        System.out.println(MyChild2.c2);
    }
}

interface MyParent2{
    public static final int p2 = new Random().nextInt();

    public static Thread thread = new Thread(){
        {
            System.out.println("MyParent2");
        }
    };
}
interface MyChild2 extends MyParent2{
    public static final int c2 = new Random().nextInt();

    public static Thread thread = new Thread(){
        {
            System.out.println("MyChild2");
        }
    };
}

interface MyParent1{
    public static final int p1 = 4;

    public static Thread thread = new Thread(){
        {
            System.out.println("MyParent1");
        }
    };
}
interface MyChild1 extends MyParent1{
    public static final int c1 = 2;

    public static Thread thread = new Thread(){
        {
            System.out.println("MyChild1");
        }
    };
}
