package com.zfw.jvm.memory;

import com.zfw.jvm.test.Entity;

import java.time.Instant;

/**
 * 测试逃逸分析
 * -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:+EliminateAllocations -XX:+DoEscapeAnalysis
 * @author hero良
 * @classname EscapeAnalysis
 */
public class EscapeAnalysis {

    public static void alloc(){
        Entity entity = new Entity(1, "test");
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
