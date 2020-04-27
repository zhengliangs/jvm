package com.zfw.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * java.lang.OutOfMemoryError: Java heap space
 * 堆溢出
 *
 * -Xms5m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author hero良
 * @classname JunitTest
 */
public class OutOfMemoryError {

    public static void main(String[] args) {
        List<OutOfMemoryError> list = new ArrayList<>();
        for(; ; ){
            list.add(new OutOfMemoryError());
            //赋值后再次尝试
//            System.gc();
        }
    }
}
