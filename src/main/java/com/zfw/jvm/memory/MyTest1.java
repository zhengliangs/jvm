package com.zfw.jvm.memory;

import java.util.ArrayList;
import java.util.List;

//-Xms5m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
/**
 * @author hero良
 * @classname MyTest1
 */
public class MyTest1 {

    public static void main(String[] args) {
        List<MyTest1> list = new ArrayList<>();
        for(; ; ){
            list.add(new MyTest1());
            //赋值后再次尝试
            System.gc();
        }
    }
}
