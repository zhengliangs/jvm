package com.zfw.jvm.gc;

/**
 * -verbose:gc -Xmx20m -Xms20m -Xmn10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseConcMarkSweepGC
 * @author hero良
 * @classname MyTest5
 */
public class MyTest5 {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[3 * size];

        System.out.println("11111");

        byte[] myAlloc2 = new byte[4 * size];

        System.out.println("22222");

        byte[] myAlloc3 = new byte[3 * size];

        System.out.println("33333");

        byte[] myAlloc4 = new byte[3 * size];

        System.out.println("44444");
    }
}
