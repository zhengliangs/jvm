package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyPerson
 */
public class MyPerson {

    private MyPerson myPerson;

    public void setMyPerson(Object object){
        this.myPerson = (MyPerson) object;
    }
}
