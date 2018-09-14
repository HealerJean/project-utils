package com.hlj.java8.Stream;

import com.hlj.java8.Stream.Demo10ElementPack.Person;
import org.junit.Test;
import sun.security.acl.PermissionImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo10Element {

    /**
     * 1、第一个队伍只要名字为3个字的成员名字
     * 2、第一个队伍筛选之后只要前三个人
     * 3、第二个队伍只要姓张的成员姓名
     * 4、第二个队伍筛选之后不要前两个人
     * 5、将两个队伍合并为一个队伍
     * 6、根据性别创建Person对象
     * 打印整个队伍的Person对象信息
     */
    @Test
    public void demo(){
        List<String> listOne = new ArrayList<>();
        listOne.add("迪丽热巴");
        listOne.add("老子");
        listOne.add("庄子");
        listOne.add("丁春秋");
        listOne.add("习近平");
        listOne.add("天山童姥");
        listOne.add("张无忌");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("古力娜扎");
        listTwo.add("张宇晋");
        listTwo.add("张翠山");
        listTwo.add("张飞");
        listTwo.add("宋远桥");
        listTwo.add("包不同");


        listOne.stream().filter(s->s.length()==0)
                        .limit(3);
        listTwo.stream().filter(s->s.startsWith("张"))
                          .skip(2);

    List<Person>  personList  =  Stream.concat(
                listOne.stream().filter(s->s.length()==3).limit(3),
                listTwo.stream().filter(s->s.startsWith("张")).skip(2))
                .map(Person::new).collect(Collectors.toList());

        System.out.println(personList);
        /**
         [Person{name='丁春秋'}, Person{name='习近平'}, Person{name='张无忌'}, Person{name='张飞'}]
         */

    }
}
