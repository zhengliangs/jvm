package com.zfw.jvm.test;

import java.util.Random;

/**
 * @author hero良
 * @className Test
 * @description TODO
 * @date 2020/3/22
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println(Child.b);
//        System.out.println(Child1.a);
//        System.out.println(Child2.a);
        System.out.println(Child3.a);
    }
}

interface Parent4{
    public static final int p = 1;

    public static Thread thread = new Thread(){
        {
            System.out.println("Parent4");
        }
    };

//    static {
//        System.out.println("Parent4");
//    }
}

class Parent3 implements Parent4{
    public static final int a = new Random().nextInt();

    static {
        System.out.println("Parent3");
    }
}
class Child3 extends Parent3{
    public static final int b = new Random().nextInt();

    static {
        System.out.println("Child3");
    }
}


class Parent2{
    public static int a = new Random().nextInt();

    static {
        System.out.println("Parent2");
    }
}
class Child2 extends Parent2{
    public static int b = 9;

    static {
        System.out.println("Child2");
    }
}

class Parent{
    public static int a = 9;

    static {
        System.out.println("Parent");
    }
}

class Child extends Parent{
    public static int b = 3;

    static {
        System.out.println("Child");
    }
}

class Parent1{
    public static final int a = 9;

    static {
        System.out.println("Parent1");
    }
}

class Child1 extends Parent1{
    public static final int b = 3;

    static {
        System.out.println("Child1");
    }
}
