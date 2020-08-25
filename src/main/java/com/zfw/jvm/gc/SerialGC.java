package com.zfw.jvm.gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/**
 * 串行垃圾收集器
 *
 * -verbose:gc -Xmx20m -Xms20m -Xmn10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseSerialGC
 *
 * @author hero良
 * @classname SerialGC
 */
public class SerialGC {

    public static void main(String[] args) throws InterruptedException {

        List<Object> list = new ArrayList<>();

        for(; ;){
            int sleep = new Random().nextInt(100);

            if(System.currentTimeMillis() % 2 == 0){
                list.clear();
            } else {
                for (int i = 0; i < 10000; i++) {
                    Properties properties = new Properties();

                    properties.put("key : " + i , "value : " + System.currentTimeMillis());

                    list.add(properties);
                }
            }
            Thread.sleep(sleep);
        }
    }
}
