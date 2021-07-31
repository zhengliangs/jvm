package com.zhengl.jvm.memory;

/**
 * 创建的对象如果大小超过设置的值，会直接分配在老年代
 *
 * -verbose:gc -Xmx40m -Xms40m -Xmn20m -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=4194304 -XX:+UseSerialGC -XX:+PrintGCDetails
 *
 * PretenureSizeThreshold只在UseSerialGC、ConcMarkSweepGC收集器下有效
 *
 * @author hero良
 * @classname TestPretenureSizeThreshold
 */
public class TestPretenureSizeThreshold {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] allocation = new byte[6 * size];
    }
}
