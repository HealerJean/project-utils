package com.hlj.java8.Interface;

import com.hlj.java8.Interface.Demo03InterfaceDefaultPack.MyInterface;
import com.hlj.java8.Interface.Demo03InterfaceDefaultPack.impl.MyInterfaceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo01 {

    @Test
    public void demo(){

        MyInterface myInterface = new MyInterfaceImpl() ;

        /**
         *  我们发现这个里面的默认方法，可以帮我们继承下去，我们也可以对这个方法进行覆盖重写
         */
        myInterface.methodNew();

        MyInterface.methodStatic();


    }
}
