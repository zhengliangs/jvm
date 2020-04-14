package com.zfw.jvm.gc;

/**
 * -verbose:gc -Xms20m -Xmx20m -Xmn10m  -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author hero良
 * @classname MyTest1
 */
public class MyTest1 {

    /*
     [GC (Allocation Failure) [PSYoungGen: 6637K->1000K(9216K)] 6637K->3156K(19456K), 0.0020617 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]

     GC (Allocation Failure)
     表示发生了GC（GC的原因）

     PSYoungGen
     PS表示垃圾收集器Parallel Scavenge年轻代

     6637K->1000K(9216K)]
     年轻代垃圾回收前的大小->年轻代垃圾回收以后的大小（新生代总的空间容量=9216k=9m;因为新生代和Survivor是8:1:1,，而Survivor To区只有垃圾回收完才存对象）

     6637K->3156K(19456K)
     堆区垃圾回收前的大小->堆区垃圾回收后的大小（堆区总大小）

     0.0020617 secs
     （回收时间）

     [Times: user=0.03（Young GC用户耗时） sys=0.00（Young GC系统耗时）, real=0.02 secs（Young GC实际耗时）]

     GC后
     新生代释放 6637 - 1000 = 5637
     堆总容量释放 6637 - 3156 =  3481

     5637 - 3481 = 2156 晋升到老年代的

       Heap
 PSYoungGen      total 9216K, used 6525K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
  eden space 8192K, 67% used [0x00000000ff600000,0x00000000ffb65748,0x00000000ffe00000)
  from space 1024K, 97% used [0x00000000ffe00000,0x00000000ffefa020,0x00000000fff00000)
  to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 ParOldGen       total 10240K, used 2156K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
  object space 10240K, 21% used [0x00000000fec00000,0x00000000fee1b3c8,0x00000000ff600000)
 Metaspace       used 3764K, capacity 4632K, committed 4864K, reserved 1056768K
  class space    used 415K, capacity 464K, committed 512K, reserved 1048576K
     */
    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[3 * size];
        byte[] myAlloc4 = new byte[3 * size];

        System.out.println("hello world");
    }
}
