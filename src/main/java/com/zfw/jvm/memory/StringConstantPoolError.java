package com.zfw.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * java.lang.OutOfMemoryError: Java heap space
 *
 * 字符串常量池溢出，表示字符串常量池移到了堆中
 *
 * -Xms10m -Xmx10m
 *
 * @author hero良
 * @classname StringConstantPoolError
 */
public class StringConstantPoolError {

    static String base = "string";

    /*
     Exception in thread "main" java.lang.JunitTest: Java heap space
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(; ;){
            String str = base + base;
            base = str;
            list.add(str.intern());
        }
    }
}
