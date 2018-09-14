package com.hlj.java8.Lambda.Demo04ObjectRefPack;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  下午4:15.
 */
public class MethodRefObject {


    public MethodRefObject() {
    }

    /**
     * 静态类方法引用
     *
     *   MethodRefObject::staticPrintStringUpper
     *
     * @param string
     */
    public static void staticPrintStringUpper(String string){
        System.out.println("静态类方法引用"+string.toUpperCase());
    }


    /**
     * 非静态的方法引用
     *   new MethodRefObject()::printStringUpper
     *
     * @param s
     */
    public void printStringUpper(String s) {
        System.out.println("非静态的方法引用"+s.toUpperCase());
    }


    /**
     * 构造器引用
     */
    public MethodRefObject(String s) {
        System.out.println("构造器引用"+s.toUpperCase());
    }
}
