package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest18_1
 */
public class MyTest18_1 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("D:\\Users\\Administrator\\Desktop\\");
        //将要加载的class文件放到根类加载器加载的目录中
        Class<?> clazz = loader1.loadClass("com.zfw.jvm.classloader.MyTest1");
        System.out.println("class loader: " + clazz.getClassLoader());
        System.out.println("hashCode: "+ clazz.hashCode());

    }
}
