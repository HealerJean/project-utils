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
 * @Date 2018/9/14  ����11:48.
 */
public class Demo01 {

    @Test
    public void demo(){

        MyInterface myInterface = new MyInterfaceImpl() ;

        /**
         *  ���Ƿ�����������Ĭ�Ϸ��������԰����Ǽ̳���ȥ������Ҳ���Զ�����������и�����д
         */
        myInterface.methodNew();

        MyInterface.methodStatic();


    }
}
