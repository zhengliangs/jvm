package com.zfw.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author hero良
 * @classname MyTest27
 */
public class MyTest27 {

    public static void main(String[] args) throws Exception {
        //返回com.mysql.jdbc.Driver的类对象   会初始化
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("", "", "");
    }
}
