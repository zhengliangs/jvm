package com.zhengl.jvm.classloader;

/**
 * @author hero良
 * @classname MyTest25
 */
public class MyTest25 implements Runnable{

    private Thread thread;

    public MyTest25(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        ClassLoader classloader = this.thread.getContextClassLoader();

        this.thread.setContextClassLoader(classloader);

        System.out.println("classloader: " + classloader.getClass());
        System.out.println("classloader parent: "+ classloader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
