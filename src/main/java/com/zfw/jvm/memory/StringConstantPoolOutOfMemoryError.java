package com.zfw.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 不停的往字符串常量池存储字符串，最终抛出OOM，表示字符串常量池移到了堆中
 *
 * -Xms10m -Xmx10m
 *
 * java.lang.OutOfMemoryError: Java heap space
 *
 * @author hero良
 * @classname StringConstantPoolOutOfMemoryError
 */
public class StringConstantPoolOutOfMemoryError {

    static String base = "string";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(; ;){
            String str = base + base;
            base = str;
            list.add(str.intern());
        }
    }
}
