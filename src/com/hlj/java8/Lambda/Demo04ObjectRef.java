package com.hlj.java8.Lambda;

import com.hlj.java8.Lambda.Demo04ObjectRefPack.MethodRefObject;
import com.hlj.java8.Lambda.Demo04ObjectRefPack.MyInterfaceObjectRef;
import org.junit.Test;


/**
 * @Desc: 对象的引用输出
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo04ObjectRef {



    /**
     * 如果对象中有一个成员方法，正好就是lambda表示式所唯一希望使用的内容，
     *      那么这个时候就可以使用方法引用，格式"
     *
     *   对象名称::方法名称
     */

    @Test
    public void demo(){

        //lombdb表达式写法
        method(s->{
            System.out.println(s.toUpperCase());
        });

        //原样输出
        method(System.out::println);

        //对象的引用输出
        method(new MethodRefObject()::printStringUpper);

        method(s->{
            new MethodRefObject().printStringUpper(s);
        });


        //静态类方法引用
        method(MethodRefObject::staticPrintStringUpper);
        method(s->{
            MethodRefObject.staticPrintStringUpper(s);
        });

        //构造器引用
        method(MethodRefObject::new);
        method((s)->{
            new MethodRefObject(s);
        });

        /**
         * 张宇晋
         张宇晋
         非静态的方法引用张宇晋
         非静态的方法引用张宇晋
         静态类方法引用张宇晋
         静态类方法引用张宇晋
         构造器引用张宇晋
         构造器引用张宇晋
         */

    }

    public void method(MyInterfaceObjectRef myInterfaceObjectRef){
        myInterfaceObjectRef.printStringUpper("张宇晋");
    }


}
