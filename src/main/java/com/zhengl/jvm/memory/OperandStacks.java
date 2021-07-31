package com.zhengl.jvm.memory;

/**
 * javap -c  验证虚拟机栈的操作栈
 *
 * @author hero良
 * @classname OperandStacks
 */
public class OperandStacks {

  private int i1;
  private int i2;

  public int testByteCode(int i1, int i2){
    return i1 + i2;
  }

}
