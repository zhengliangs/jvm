package com.zfw.jvm.memory;

/**
 * 通过一个类new出来的不同实例，是不相等的，因为类的实例保存在heap中，
 * 但是通过每个实例调用getClass()得到Class对象是相等的，因为每个类的有且只有一份Class对象，存放在方法区中
 *
 * @author hero良
 * @className TestNewClass
 */
public class TestNewClass {

    public static void main(String[] args) {
        Entity entity1 = new Entity(1, "1");
        Entity entity2 = new Entity(2, "2");

        System.out.println(entity1 == entity2);//false

        Class clazz1 = entity1.getClass();
        Class clazz2 = entity2.getClass();

        System.out.println(clazz1 == clazz2);//true
    }
}
