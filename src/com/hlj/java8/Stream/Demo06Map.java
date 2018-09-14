package com.hlj.java8.Stream;

import com.hlj.java8.Stream.Demo06MapPack.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Desc: steam映射方法Map，如果希望进行映射操作，使用功能Map方法，，返回值为Stream
 *      这个里面的参数是一个function<T,R>接口
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo06Map {

    /**
     * 功能
     *1、 将字符串10转化为数组10
     *2、然后累加1000,最后得到Integer
     */
    @Test
    public void demo(){
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");

        list.stream().filter(s -> s.equals("10"))
                .map(s -> Integer.parseInt(s))
                .map(s -> s + 1000)
                .forEach(s -> {
                    System.out.println(s);
                });

    }





    @Test
    public  void init() {
        List<Student> students  = Arrays.asList(
                new Student("Ice", "1234", new Date(), null, "Shannxi", "123456", "", "M", null, 170.5, 65.0),
                new Student("Leo", "2344", new Date(), null, "Liaoning", "123456", "", "M", null, 175.5, 50.0),
                new Student("Mark", "4345", new Date(), null, "Shannxi", "123456", "", "M", null, 169.5, 70.0),
                new Student("Will", "4552", new Date(), null, "Fujian", "123456", "", "M", null, 176.5, 45.0),
                new Student("Yuan", "4554", new Date(), null, "Fujian", "123456", "", "M", null, 180.5, 56.0),
                new Student("Bing", "5677", new Date(), null, "Shannxi", "123456", "", "M", null, 166.5, 67.0),
                new Student("Amy", "5675", new Date(), null, "Shannxi", "123456", "", "F", null, 156.5, 78.0),
                new Student("Lily", "7567", new Date(), null, "Shannxi", "123456", "", "F", null, 167.5, 66.0),
                new Student("Timiy", "4677", new Date(), null, "Shannxi", "123456", "", "F", null, 182.5, 68.0),
                new Student("Eline", "4697", new Date(), null, "Liaoning", "123456", "", "F", null, 188.5, 54.0),
                new Student("Chrich", "8799", new Date(), null, "Liaoning", "123456", "", "F", null, 155.5, 75.0));

        /**
         * 只取得Name
         */
        students.stream().map(student -> student.getName()).forEach(s -> {
            System.out.println(s.toString());
        });
        /**
         Ice
         Leo
         Mark
         Will
         Yuan
         Bing
         Amy
         Lily
         Timiy
         Eline
         Chrich
         */

    }

//    @Test //Demo10Element 类中测试




}
