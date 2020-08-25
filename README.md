# jvm
learn JVM example

## MyTest1
    对于静态字段来说，只有直接定义了该字段的类才会被初始化，类初始化的同时，会要求父类已经初始化完毕
## MyTest2
    助记符
## MyTest3
    对于常量（final）来说，编译期可以确定值时，不会导致类的初始化，反之，编译期无法确定值时，会导致类的初始化
## MyTest4
    对于数组类型来说，其类型是JVM运行期间动态生成的（不会导致类的初始化），动态生成的类型，其父类都是Object
## MyTest5
    对于接口来说，常量如果是编译期可以确定的，那么接口不会被初始化，如果编译期无法确定，那么接口会被初始化，接口初始化时，不会触发父接口的初始化
## MyTest6
    重要   类的初始化时机，初始化步骤示例
## MyTest7
    查看类加载器
## MyTest8
    final修饰且编译期可以确定的值类不会初始化，反之会导致类的初始化
## MyTest9
    类初始化的顺序
## MyTest10
    类初始化的顺序；类只会初始化一次；代码块非static修饰的，只有在创建实例才会执行，初始化不执行
## MyTest11
    通过子类访问父类静态方法，不会初始化子类，没有对子类主动使用
## MyTest12
    调用ClassLoader.loadClass加载一个类，不会对类主动使用，不会导致类的初始化
## MyTest13
    递归查看类加载器的父类加载器
## MyTest14
## MyTest15
    对于数组类型来说，其类加载器其元素类加载器相同，基本类型数组没有类加载器
## MyTest16
    重要   自定义类加载器示例
## MyTest17
    
## MyTest18
    获取Bootstrap、Extension、App类加载器加载的路径
## MyTest18_1
    Bootstrap类加载器示例
## MyTest19
    验证Extension 类加载器
## MyTest20
    类加载机制  命名空间（同一个类加载器加载）
## MyTest21
    类加载机制  命名空间（不同的类加载器加载）
## MyTest22
    Extension类加载器示例；java -Djava.ext.dirs={path}
## MyTest23
    使用自定义的类加载器作为系统类加载器-java -Djava.system.class.loader={自定义的类加载器}
## MyTest24
    获取上下文类加载器；获取Thread的类加载器
## MyTest25
    获取当前线程的上下文类加载器，然后set，打印当前线程类加载器及父类加载器
## MyTest26
## MyTest27

## --------------------------------------------------------------------------------------
# memory
## DirectoryMemoryOutOfMemory
    
## EscapeAnalysis
    逃逸分析
## HeapOutOfMemoryError
    堆内存发生OOM
## MetaspaceOutOfMemoryError
    元空间发生OOM
## StackOutOfMemoryError
    栈发生OOM
## StackOverflowError
    栈发生Overflow
## StringConstantPoolOutOfMemoryError
    字符创常量池发生OOM
## TestNewClass
    不同实例的Class对象相等
## TestSynchronized
    给静态方法加锁，锁的是Class对象