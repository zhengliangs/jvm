package com.zfw.jvm.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author hero良
 * @classname MyTest4
 */
public class MyTest4 {

    //运行期生成Class对象，模拟元空间的内存溢出
    public static void main(String[] args) {
        for (; ; ){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MyTest4.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor)(obj, method, args1, proxy) -> proxy.invokeSuper(obj, args1));

            System.out.println("hello world");

            enhancer.create();
        }
    }
}
