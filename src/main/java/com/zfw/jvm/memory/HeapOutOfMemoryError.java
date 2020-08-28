package com.zfw.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆溢出时生成 dump 文件
 *
 * -Xms5m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=D:\study\log_hprof\gc.hprof
 *
 * java.lang.OutOfMemoryError: Java heap space
 *
 * @author hero良
 * @classname HeapOutOfMemoryError
 */
public class HeapOutOfMemoryError {

    public static void main(String[] args) {
        List<HeapOutOfMemoryError> list = new ArrayList<>();
        for(; ; ){
            list.add(new HeapOutOfMemoryError());
        }
    }
}
