package com.zfw.jvm.memory;

/**
 * 对象优先分配在Eden区
 *
 * @author hero良
 * @classname TestEden
 */
public class TestEden {

    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] allocation1 = new byte[size * 2];
        System.out.println("-------allocation1--------");
        byte[] allocation2 = new byte[size * 2];
        System.out.println("-------allocation2--------");
        byte[] allocation3 = new byte[size * 2];
        System.out.println("-------allocation3--------");
        byte[] allocation4 = new byte[size * 4];
        System.out.println("-------allocation4--------");
    }

    /*
        最后allocation1、allocation2、allocation3晋升到了老年代，allocation4被分配在了新生代

        -------allocation1--------
        [GC (Allocation Failure) [PSYoungGen: 6390K->1016K(9216K)] 6390K->3139K(19456K), 0.0042388 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
        -------allocation2--------
        -------allocation3--------
        -------allocation4--------
        Heap
         PSYoungGen      total 9216K, used 5517K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
          eden space 8192K, 54% used [0x00000000ff600000,0x00000000ffa656f8,0x00000000ffe00000)
          from space 1024K, 99% used [0x00000000ffe00000,0x00000000ffefe010,0x00000000fff00000)
          to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
         ParOldGen       total 10240K, used 6219K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
          object space 10240K, 60% used [0x00000000fec00000,0x00000000ff212f58,0x00000000ff600000)
         Metaspace       used 3757K, capacity 4632K, committed 4864K, reserved 1056768K
          class space    used 415K, capacity 464K, committed 512K, reserved 1048576K
     */
}
