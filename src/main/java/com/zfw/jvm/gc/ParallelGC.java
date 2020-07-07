package com.zfw.jvm.gc;

/**
 * 并行垃圾收集器
 * --verbose:gc -Xms20m -Xmx20m -Xmn10m  -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+PrintCommandLineFlags
 *
 * JDK8 默认新生代使用Parallel Scavenge来收集，老年代默认使用Parallel Old来收集，使用PrintCommandLineFlags来打印虚拟机启动参数来查看
 *
 * @author hero良
 * @classname ParallelGC
 */
public class ParallelGC {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        byte[] myAlloc4 = new byte[3 * size];

        System.out.println("hello world");
    }
}
