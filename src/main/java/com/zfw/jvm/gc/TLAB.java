package com.zfw.jvm.gc;

/**
 * @author hero良
 * @classname TLAB
 */
public class TLAB {

    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] alloc1 = new byte[size * 2];
        byte[] alloc2 = new byte[size * 2];
        byte[] alloc3 = new byte[size * 2];
        byte[] alloc4 = new byte[size * 2];
        System.out.println("hello world");
    }
}
