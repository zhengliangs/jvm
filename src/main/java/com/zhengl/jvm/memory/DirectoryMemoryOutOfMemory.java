package com.zhengl.jvm.memory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 直接内存溢出
 */
public class DirectoryMemoryOutOfMemory {

    static int ONE_MB = 1024 * 1024;
    static int index = 0 ;
    public static void main(String[] args) {

        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe)field.get(null);

            while (true) {
                index ++;
                unsafe.allocateMemory(ONE_MB);
            }
        } catch (Exception | Error e) {
            System.out.println("index  : " + index);
            e.printStackTrace();
        }
    }

}
