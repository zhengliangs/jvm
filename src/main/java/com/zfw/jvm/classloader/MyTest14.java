package com.zfw.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author hero良
 * @className MyTest14
 */
public class MyTest14 {

    public static void main(String[] args) throws IOException {
        //当前线程的上下文加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        //
        String path = "com/zfw/jvm/classloader/MyTest1.class";

        URL resource = classLoader.getResource(path);
        System.out.println(resource.getContent());

        Enumeration<URL> resources = classLoader.getResources(path);
        while (resources.hasMoreElements()){
            URL url = resources.nextElement();
            System.out.println(url);
        }
    }
}
