package com.zfw.jvm.classloader;

import java.io.*;

/**
 * @author hero良
 * @className MyTest16
 * @description TODO
 * @date 2020/3/28
 */
public class MyTest16 extends ClassLoader{

    private String classLoaderName;

    private final String fileExtension = ".class";
    //加载类的路径
    private String path;

    //默认的双亲委托  应用类加载器（SystemClassLoader）
    public MyTest16(String classLoaderName){
        super();//将系统类加载器（systemClassLoader） 当做改类加载器的父类
        this.classLoaderName = classLoaderName;
    }

    //指定双亲委托
    public MyTest16(ClassLoader parent, String classLoaderName){
        super(parent);//显式的指定改类加载器的父类
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String className) {
        System.out.println("findClass invoked：" + className);
        System.out.println("class loader name：" + this.classLoaderName);
        byte[] bytes = this.loadClassData(className);
        return this.defineClass(className, bytes, 0, bytes.length);
    }

    private byte[] loadClassData(String className){
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        className = className.replace(".", "\\");
        try{
            is = new FileInputStream(new File(this.path + className + fileExtension));
            baos = new ByteArrayOutputStream();

            int length;

            while (-1 != (length = is.read())){
                baos.write(length);
            }
            data = baos.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
                baos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        //loader1.setPath("E:\\work\\project\\jvm\\out\\production\\classes\\");
        loader1.setPath("C:\\Users\\郑良\\Desktop\\class\\");

        Class<?> clazz1 = loader1.loadClass("com.zfw.jvm.classloader.MyTest15");
        System.out.println("clazz：" + clazz1.hashCode());
        Object object1 = clazz1.newInstance();
        System.out.println(object1);

        System.out.println();

        object1 = null;
        clazz1 = null;
        object1 = null;

        System.gc();
        Thread.sleep(10000);

        loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\郑良\\Desktop\\class\\");

        clazz1 = loader1.loadClass("com.zfw.jvm.classloader.MyTest15");
        System.out.println("clazz：" + clazz1.hashCode());
        object1 = clazz1.newInstance();
        System.out.println(object1);

        System.out.println();

//        MyTest16 loader2 = new MyTest16("loader2");
//        loader2.setPath("C:\\Users\\郑良\\Desktop\\class\\");
//
//        Class<?> clazz2 = loader2.loadClass("com.zfw.jvm.classloader.MyTest15");
//        System.out.println("clazz: " + clazz2.hashCode());
//        Object object2 = clazz2.newInstance();
//        System.out.println(object2);
//
//        System.out.println();
//
//        MyTest16 loader3 = new MyTest16(loader1, "loader3");
//        loader3.setPath("C:\\Users\\郑良\\Desktop\\class\\");
//
//        Class<?> clazz3 = loader3.loadClass("com.zfw.jvm.classloader.MyTest15");
//        System.out.println("clazz: " + clazz3.hashCode());
//        Object object3 = clazz3.newInstance();
//        System.out.println(object3);

    }
}
