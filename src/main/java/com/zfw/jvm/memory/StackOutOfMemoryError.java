package com.zfw.jvm.memory;

/**
 *
 * @author hero良
 * @classname StackOutOfMemoryError
 */
public class StackOutOfMemoryError {

    private void dontStop() {
        while (true) {
        }
    }

    //通过不断的创建新的线程使Stack内存耗尽
    public void stackLeakByThread() {
        while (true) {
            new Thread(() -> dontStop()).start();
        }
    }

    public static void main(String[] args) {
        StackOutOfMemoryError oom = new StackOutOfMemoryError();
        oom.stackLeakByThread();
    }
}
