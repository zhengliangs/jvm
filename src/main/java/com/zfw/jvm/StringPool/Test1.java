package com.zfw.jvm.StringPool;

/**
 * @author hero良
 * @classname Test1
 */
public class Test1 {

    /**
     * 通过new 创建的字符串对象,如果不调用 intern 是不会进入到字符串常量池的
     * @author hero良
     */
    public static void main(String[] args) {
        
        //这行代码,会在堆中创建"java"对象,然后驻留在字符串常量池中;
        //然后继续执行new指令,new指令会在堆中创建"java"对象,并赋值给s1,
        //但是不会驻留在字符串常量池中;
        String s1 = new String("java");
        //会在字符串常量池中查找内容为"java"的对象,
        //这个时候,字符串常量池已经有"java"的对象了,
        //就是执行上面那行代码通过class字面量创建的,
        //将字符串常量池中的"java"对象赋值给s2,
        String s2 = "java";
        //这行代码同样会在字符串常量池中查找内容为"java"的对象,
        //虽然这个时候字符串常量池中已经有内容为"java"的对象了,
        //但并没有变量来接受,所以可以忽略
        s1.intern();
        //这个时候s1指向堆中的String实例 s2指向常量池中的String实例。所以不相等
        System.out.println(s1 == s2);//false


        //这行代码会创建"hel"和"lo"两个对象,然后存放到字符串常量池;
        //因为有 + 号,内部会创建一个StringBuilder对象,使用append方法进行拼接,
        //最后调用toString方法得到一个内容是"hello"的String对象,并赋值给s3,
        //注意,并没有把hello对象放到字符串常量池中;
        String s3 = new String("hel") + new String("lo");
        //会在字符串常量池中查找内容为"hello"的对象,
        //但是字符串常量池中没有内容是"hello"的对象,
        //所以会在字符串常量池中创建一个内容是"hello"的对象,并赋值给s4
        String s4 = "hello";
        //会在字符串常量池中查找内容为"hello"的对象,
        //字符串常量池中已经存在"hello"对象了,但是没有变量接受,
        //所以s3依然指向堆中的对象；
        s3.intern();
        //这个时候s3指向堆中的对象 s4指向字符串常量池中的对象,所以不相等
        System.out.println(s3 == s4);//false


        //这行代码会创建"hello"对象,并驻留在字符串常量池中,
        //然后继续执行new指令,new指令会在堆中创建"java"对象,并赋值给t1,
        //但是不会驻留在字符串常量池中;
        String t1 = new String("hello");
        //先在字符串常量池中查找内容是"hello"的对象,
        //这个时候字符串常量池中已经有"hello"对象了,
        //但是没有返回值接受，所以可以忽略掉这句话
        t1.intern();
        //同样会去字符串常量池中查找内容是"hello"的对象,
        //这个时候字符串常量池中已经有"hello"对象了,
        //所以将字符串常量池中的"hello"对象,赋值给t2
        String t2 = "hello";
        //这个时候t1指向堆中的对象 t2指向字符串常量池中的对象，所以不相等
        System.out.println(t1 == t2);//false
    }

}
