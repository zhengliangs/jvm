package com.zfw.jvm.test;

/**
 * @author hero良
 * @className TestClass
 */
public class TestClass {


    /**
     * 通过一个类new出来的不同实例，是不相等的，因为类的实例分别存在了heap中
     * 但是所有类的实例通过getClass()方法得到Class对象时相等的，因为每个类的有且只有一份Class对象，存放在方法区中
     */
    public static void main(String[] args) {
        Entity entity1 = new Entity(1, "1");
        Entity entity2 = new Entity(2, "2");

        System.out.println(entity1 == entity2);//false

        Class clazz1 = entity1.getClass();
        Class clazz2 = entity2.getClass();

        System.out.println(clazz1 == clazz2);//true
    }
}
