package com.zfw.jvm.gc;

/**
 * -XX:PretenureSizeThreshold=4194304 -XX:+UseSerialGC
 * @author hero良
 * @classname StackOverflowError
 */
public class MyTest2 {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc = new byte[5 * size];

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
