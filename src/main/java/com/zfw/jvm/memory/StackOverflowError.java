package com.zfw.jvm.memory;

/**
 * 虚拟机栈溢出(StackOverflowError)  -Xss100k
 * 虚拟机栈会出现OutOfMemoryError和StackOverflowError
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
            /*
            StackOverflowError 、 OutOfMemoryError都不属于Exception的子类
             */
        } catch (Throwable e) {
            System.out.println(stackOverflowError.getLength());
            e.printStackTrace();
        }

    }
}
