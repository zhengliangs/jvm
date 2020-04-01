package com.zfw.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author hero良
 * @classname MyTest26
 */
public class MyTest26 {

    public static void main(String[] args) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        Thread.currentThread().setContextClassLoader(contextClassLoader.getParent());
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);

        Iterator<Driver> it = loader.iterator();

        while(it.hasNext()){
            Driver driver = it.next();
            System.out.println("driver: "+ driver.getClass() + " , loader: " + driver.getClass().getClassLoader());
        }

        System.out.println("当前线程上下文类加载器: " + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader: " + ServiceLoader.class.getClassLoader());
    }
}
