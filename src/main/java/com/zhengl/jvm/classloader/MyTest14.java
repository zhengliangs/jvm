package com.zhengl.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author hero良
 * @classname MyTest14
 */
public class MyTest14 {

    public static void main(String[] args) throws IOException {
        //当前线程的上下文加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        //
        String path = "com/zhengl/jvm/classloader/MyTest1.class";

        URL resource = classLoader.getResource(path);
        System.out.println(resource.hashCode());

        Enumeration<URL> resources = classLoader.getResources(path);
        while (resources.hasMoreElements()){
            URL url = resources.nextElement();
            System.out.println(url);
        }
    }
}
