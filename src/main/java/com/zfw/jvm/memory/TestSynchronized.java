package com.zfw.jvm.memory;

/**
 * 如果synchronized关键字修饰的是静态方法，则锁的则为当前类的Class对象
 *
 * 线程产生死锁
 * @author hero良
 * @classname TestSynchronized
 */

//不加sleep时，Thread-A 总阻止3，等待1  Thread-B总阻止1 等待0
public class TestSynchronized {

    public static void main(String[] args) {
        new Thread(()->A.method(), "Thread-A").start();

        new Thread(()->B.method(), "Thread-B").start();
    }
}

class A{
    public static synchronized void method(){
        System.out.println("Method from A");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        B.method();
    }
}

class B{
    public static synchronized void method(){
        System.out.println("Method from B");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        A.method();
    }
}
