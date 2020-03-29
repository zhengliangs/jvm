package com.zfw.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * @author hero良
 * @classname MyTest19
 */
public class MyTest19 {

    public static void main(String[] args) {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();

        System.out.println("class loader: " + aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
