package com.zfw.jvm.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * 运行期间不停的动态生成Class，最后会导致元空间的溢出
 *
 * -XX:MetaspaceSize=5m -XX:MaxMetaspaceSize=10m
 *
 * java.lang.OutOfMemoryError: Metaspace
 *
 * @author hero良
 * @classname MetaspaceOutOfMemoryError
 */
public class MetaspaceOutOfMemoryError {

    //运行期生成Class对象，模拟元空间的内存溢出
    public static void main(String[] args) {
        for (; ; ){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MetaspaceOutOfMemoryError.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor)(obj, method, args1, proxy) -> proxy.invokeSuper(obj, args1));

            System.out.println("hello world");

            enhancer.create();
        }
    }
}
