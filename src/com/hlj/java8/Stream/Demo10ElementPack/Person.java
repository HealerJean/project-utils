package com.hlj.java8.Stream.Demo10ElementPack;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  обнГ1:23.
 */
public class Person {

    String name;



    public Person(String name) {
        this.name = name;
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
                '}';
    }
}
