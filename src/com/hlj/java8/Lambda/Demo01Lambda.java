package com.hlj.java8.Lambda;

import com.hlj.java8.Lambda.Demo01LambdaPack.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda表达式
 * 1、前面一个小括号，不需要任何参数可以直接执行        一些参数
 * 2、箭头指向后面要做的事情                         一个箭头
 * 3、箭头后面就好比方法体大括号，代表具体要做的事情     一些代码
 *
 * 如果参数有多个，那么使用逗号分隔，(Person s,Person) ->{一些代码}
 * 如果参数没有，则留空
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo01Lambda {

    @Test
    public void demo(){
        Person[] array = {
                new Person("迪丽热巴",13),
                new Person("张宇晋",26),
                new Person("赵春宇",13),
                new Person("刘利",15)
        };

        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println(Arrays.toString(array));
        /**
         [Person{name='迪丽热巴', age=13}, Person{name='赵春宇', age=13}, Person{name='刘利', age=15}, Person{name='张宇晋', age=26}]
         */

        Arrays.sort(array, (Person o1,Person o2) ->{
            return o1.getAge()-o2.getAge();
        });

        Arrays.sort(array, ( o1, o2) ->{
            return o1.getAge()-o2.getAge();
        });

        System.out.println(Arrays.toString(array));

    }
}
