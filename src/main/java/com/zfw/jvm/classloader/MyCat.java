package com.zfw.jvm.classloader;

/**
 * @author hero良
 * @className MyCat
 * @description TODO
 * @date 2020/3/28
 */
public class MyCat {

    public MyCat(){
        System.out.println("MyCat is loaded by: " + this.getClass().getClassLoader());
    }
}
