package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest17
 * @date 2020/3/28
 */
public class MyTest17 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");

        Class<?> clazz = loader1.loadClass("com.zfw.jvm.classloader.MySample");
        System.out.println("clazz: " + clazz.hashCode());

        //如果不调用 newInstance() 那么就不会实例化Sample对象，即Sample构造方法不会被调用
        //因此也不会实例化MyCat对象，即没有对MyCat主动使用，就不会加载MyCat class(是否加载MyCat class是由虚拟机决定，虚拟机会预加载)
        Object o = clazz.newInstance();
    }
}
