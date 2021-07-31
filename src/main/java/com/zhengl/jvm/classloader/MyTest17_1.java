package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest17_1
 */
public class MyTest17_1 {

    /*
        1. Sample使用自定义的类加载器加载，MyCat使用SystemClassLoader类加载器加载，MyCat访问Sample类对象失败，NoClassDefFoundError
        2. Sample使用自定义的类加载器加载，MyCat使用SystemClassLoader类加载器加载，Sample可以访问MyCat对象
     */
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\郑良\\Desktop\\");

        Class<?> clazz = loader1.loadClass("com.zhengl.jvm.classloader.MySample");
        System.out.println("clazz: " + clazz.hashCode());

        clazz.newInstance();
    }
}
