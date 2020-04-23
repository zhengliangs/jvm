package com.zfw.jvm.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * -XX:MetaspaceSize=5m -XX:MaxMetaspaceSize=10m
 * java.lang.OutOfMemoryError: Metaspace
 * 运行期间不停的动态生成Class，最后会导致元空间的溢出
 * @author hero良
 * @classname MetaspaceError
 */
public class MetaspaceError {

    //运行期生成Class对象，模拟元空间的内存溢出
    public static void main(String[] args) {
        for (; ; ){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MetaspaceError.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor)(obj, method, args1, proxy) -> proxy.invokeSuper(obj, args1));

            System.out.println("hello world");

            enhancer.create();
        }
    }
}
