package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @className MyTest13
 * @description
 * @date 2020/3/25 9:40
 */
public class MyTest13 {

    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //加载类的ClassLoad
        System.out.println(systemClassLoader);
        while (null != systemClassLoader){
            systemClassLoader = systemClassLoader.getParent();
            System.out.println(systemClassLoader);
        }
    }
}
