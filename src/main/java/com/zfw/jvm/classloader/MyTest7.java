package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest7
 * @date 2020/3/23
 */
public class MyTest7 {

    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz1 = Class.forName("com.zfw.jvm.classloader.C");
        System.out.println(clazz1.getClassLoader());
    }
}

class C{

}
