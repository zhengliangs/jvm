package com.zhengl.jvm.memory;

/**
 * 不停的创建栈帧，导致访问的深度超过了虚拟机栈的最大深度，就会抛出StackOverflowError
 *
 * -Xss100k
 *
 * java.lang.StackOverflowError
 *
 * @author hero良
 * @classname StackOverflowError
 */
public class StackOverflowError {

    private int length;

    public int getLength() {
        return length;
    }

    public void test(){
        this.length++;

//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        test();
    }

    public static void main(String[] args) {
        StackOverflowError stackOverflowError = new StackOverflowError();
        try {
            stackOverflowError.test();
        //StackOverflowError 、 OutOfMemoryError都不属于Exception的子类zhid
        } catch (Throwable e) {
            System.out.println(stackOverflowError.getLength());
            e.printStackTrace();
        }

    }
}
