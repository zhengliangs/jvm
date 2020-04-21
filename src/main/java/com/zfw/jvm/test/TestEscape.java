package com.zfw.jvm.test;

import java.time.Instant;

/**
 * 测试逃逸分析
 * -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:+EliminateAllocations -XX:+DoEscapeAnalysis
 * @author hero良
 * @classname TestEscape
 */
public class TestEscape {

    public static void alloc(){
        User user = new User(1, "test");
    }

    public static void main(String[] args) {
        long start = Instant.now().toEpochMilli();
        for (int i = 0; i < 100_000_000; i++) {
            alloc();
        }
        long end = Instant.now().toEpochMilli();
        System.out.println("耗时：" + (end - start));
    }
}
