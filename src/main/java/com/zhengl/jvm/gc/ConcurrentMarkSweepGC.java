package com.zhengl.jvm.gc;

/**
 * 并发垃圾收集器
 *
 * -verbose:gc -Xmx20m -Xms20m -Xmn10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseConcMarkSweepGC
 *
 * @author hero良
 * @classname ConcurrentMarkSweepGC
 */
public class ConcurrentMarkSweepGC {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        System.out.println(MyTest6.by);

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
