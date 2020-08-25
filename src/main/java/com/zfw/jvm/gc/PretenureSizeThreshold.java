package com.zfw.jvm.gc;

/**
 * 新分配的对象如果大小超过PretenureSizeThreshold设置的值，则直接分配在老年代
 *
 * -verbose:gc -Xmx40m -Xms40m -Xmn20m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
 * -XX:PretenureSizeThreshold=4194304
 *
 * PretenureSizeThreshold 只在UseSerialGC和ConcMarkSweepGC收集器下有效
 *
 * @author hero良
 * @classname PretenureSizeThreshold
 */
public class PretenureSizeThreshold {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc = new byte[6 * size];

//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
