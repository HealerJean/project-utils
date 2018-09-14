package com.hlj.java8.Lambda.Demo01LambdaPack;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  ÏÂÎç1:23.
 */
public class Person {

    String name;

    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
