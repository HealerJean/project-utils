package com.hlj.java8.Interface.Demo03InterfaceDefaultPack;

/**
 * Java8开始，
 * 1、接口中，允许定义default默认方法 public default (public 可以省略，default不可以省略)
 * 2、接口中允许定义静态风阀 ，静态方法的修饰符：public static （public可以省略，static不可以省略）
 *
 * Java 9开始，支持再接口中定义私有方法
 * 接口静态方法在java9中的使用，比如利用Map.of(key,value,key1,value2)等方法
 * private  void method （提供给接口中使用） 提供给其他有公共部分进行私有化操作
 * private static void  method 都不可省略
 * @Author HealerJean
 * @Date 2018/9/14  下午3:24.
 */
public interface MyInterface {

    void method1();

    void method2();


    /**
     * 1、默认的方法修饰符，public default (public 可以省略，default不可以省略)
     *
     * 默认方法可以有方法体实现 :具体实现
     * 作用：
     * 1、新加一个功能，不会影响其他已经使用这个接口的其他功能。接口升级的时候，用到，同事子类也可以实现覆盖重写
     */
    public default  void methodNew(){
        System.out.println("interface  default 方法");
    }


    /**
     * 2、接口中允许定义静态风阀 ，静态方法的修饰符：public static （public可以省略，static不可以省略）
     */
    public static void methodStatic(){
        System.out.println("接口中的静态方法");
    }




}
