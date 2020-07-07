package com.zfw.jvm.memory;

/**
 * 栈溢出
 * @author hero良
 * @classname StackOOM
 */
public class StackOOM {

    private void dontStop() {
        while (true) {
        }
    }

    //通过不断的创建新的线程使Stack内存耗尽
    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(() -> dontStop());
            thread.start();
        }
    }

    public static void main(String[] args) {
        StackOOM oom = new StackOOM();
        oom.stackLeakByThread();
    }
}
