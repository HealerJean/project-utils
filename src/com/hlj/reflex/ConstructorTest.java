package com.hlj.reflex;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

//解剖类的构造函数，创建类的对象  
public class ConstructorTest {  
    
		
	public static void main(String[] args) throws Exception {
		//无参构造器 
		test1() ;
		//有参构造器 test2();
		//私有构造器
		//test3();
	}
	
  //反射构造函数：public Person()   无参构造器
  public static void test1() throws Exception{  
        
      Class clazz = Class.forName("com.hlj.reflex.ConstructorPerson");  
      Constructor c = clazz.getConstructor();   //一样
    //  Constructor c = clazz.getConstructor(null);  

      System.out.println(c);   //打印 public com.hlj.reflex.ConstructorPerson() 

  
  }  
    
    
    
  //反射构造函数：public Person(String name)  
  public static void test2() throws Exception{  
        
      Class clazz = Class.forName("com.hlj.reflex.ConstructorPerson");  
      Constructor c = clazz.getConstructor(String.class);  
      System.out.println(c);   //打印 public com.hlj.reflex.ConstructorPerson(java.lang.String)
      ConstructorPerson person = (ConstructorPerson)c.newInstance("测试成功");  //打印 有参 String str 构造器 
        
      System.out.println(person.str); //打印 测试成功  
  }  
    
    
    

    
    
    
  //反射私有的构造函数：private Person(String  str1 ,int n )  
  public static void test3() throws Exception{  
      Class clazz = Class.forName("com.hlj.reflex.ConstructorPerson");  
      Constructor c = clazz.getDeclaredConstructor(String.class,int.class);  
        
      c.setAccessible(true);//暴力反射  
       
      ConstructorPerson p = (ConstructorPerson) c.newInstance("私有构造器",2);  
        
      System.out.println(p.str);  
  }  
    
    
 
} 