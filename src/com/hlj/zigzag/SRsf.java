package com.hlj.zigzag;


import java.util.ArrayList;  
import java.util.List;  
  
  
public class SRsf {  
  
    public static void main(String[] args) {  
        List<Person> personlist = new ArrayList<Person>();  
        System.out.println("人员有：");  
        for (int i = 1; i < 21; i++) {  
            Person person = new Person(i,""+i+"号");  
            personlist.add(person);  
            System.out.print(person.getName()+",");  
        }  
        List<Person> list = killBody(personlist);  
        while(list.size()>6) {  
            list = killBody(list);  
        }  
    }  
      
    public static List<Person> killBody(List<Person> personlist) {  
        List<Person> personlisttemp = new ArrayList<Person>(personlist.size()-1);   //索引从0开始
        int num = 0;  
        for (int i = 7; i < personlist.size(); i++) {  
            personlisttemp.add(num, personlist.get(i));  
            num += 1;  
        }   
        for (int i = 5; i > -1; i--) {  
            personlisttemp.add(num, personlist.get(i));  
        }  
        System.out.println();  
        System.out.println("杀人：");  
        for (int i = 0; i < personlisttemp.size(); i++) {  
            Person person = personlisttemp.get(i);  
            System.out.print(person.getName()+",");  
        }  
        System.out.println();  
        return personlisttemp;  
    }  
  
}  