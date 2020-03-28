package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @className MySample
 * @description TODO
 * @date 2020/3/28
 */
public class MySample {
    //Class是由Classloader加载的，所以每个Class对象中都会有一个getClassLoader来获取加载它的ClassLoader
    public MySample(){
        System.out.println("MySample is loaded by: " + this.getClass().getClassLoader());

        new MyCat();
    }
}
