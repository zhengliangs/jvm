package com.zhengl.jvm.gc;

/**
 * -XX:MaxTenuringThreshold=5 -XX:+PrintTenuringDistribution -XX:+PrintCommandLineFlags
 *
 * @author hero良
 * @classname MyTest3
 */
public class MyTest3 {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[3 * size];
        byte[] myAlloc2 = new byte[3 * size];
        byte[] myAlloc3 = new byte[3 * size];
        byte[] myAlloc4 = new byte[3 * size];
        byte[] myAlloc5 = new byte[3 * size];
        byte[] myAlloc6 = new byte[3 * size];
    }
}
