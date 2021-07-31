package com.zhengl.jvm.classloader;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * @author hero良
 * @classname MyTest27
 */
public class MyTest27 {

    public static void main(String[] args) throws Exception {

//        System.out.println(System.getProperty("jdbc.drivers"));
        //返回com.mysql.jdbc.Driver的类对象   会初始化
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println(Driver.class.getClassLoader());

        System.out.println(DriverManager.class.getClassLoader());//启动类加载器
        Connection connection = DriverManager.getConnection("", "", "");
    }
}
