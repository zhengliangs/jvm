package com.zfw.jvm.g1;

/**
 * -verbose:gc -Xms10m -Xmx10m -XX:+UseG1GC -XX:+PrintGCDetails -XX:+PrintGcDateStamps -XX:MaxGCPauseMillis=200m
 *
 * @author hero良
 * @classname G1GC
 */
public class G1GC {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[size];
        byte[] myAlloc2 = new byte[size];
        byte[] myAlloc3 = new byte[size];
        byte[] myAlloc4 = new byte[size];
    }
}
