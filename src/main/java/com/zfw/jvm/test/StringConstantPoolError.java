package com.zfw.jvm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试常量池所在的区域
 * @author hero良
 * @className StringConstantPoolError
 */
public class StringConstantPoolError {

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
