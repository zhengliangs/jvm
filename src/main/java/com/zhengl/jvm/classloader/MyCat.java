package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyCat
 * @date 2020/3/28
 */
public class MyCat {

    public MyCat(){
        System.out.println("MyCat is loaded by: " + this.getClass().getClassLoader());

        System.out.println("from :" + MySample.class);
    }
}
