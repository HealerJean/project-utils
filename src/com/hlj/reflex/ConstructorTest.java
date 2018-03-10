package com.hlj.reflex;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

//������Ĺ��캯����������Ķ���  
public class ConstructorTest {  
    
		
	public static void main(String[] args) throws Exception {
		//�޲ι����� 
		test1() ;
		//�вι����� test2();
		//˽�й�����
		//test3();
	}
	
  //���乹�캯����public PersonRemove()   �޲ι�����
  public static void test1() throws Exception{  
        
      Class clazz = Class.forName("com.hlj.reflex.ConstructorPerson");  
      Constructor c = clazz.getConstructor();   //һ��
    //  Constructor c = clazz.getConstructor(null);  

      System.out.println(c);   //��ӡ public com.hlj.reflex.ConstructorPerson() 

  
  }  
    
    
    
  //���乹�캯����public PersonRemove(String name)
  public static void test2() throws Exception{  
        
      Class clazz = Class.forName("com.hlj.reflex.ConstructorPerson");  
      Constructor c = clazz.getConstructor(String.class);  
      System.out.println(c);   //��ӡ public com.hlj.reflex.ConstructorPerson(java.lang.String)
      ConstructorPerson person = (ConstructorPerson)c.newInstance("���Գɹ�");  //��ӡ �в� String str ������ 
        
      System.out.println(person.str); //��ӡ ���Գɹ�  
  }  
    
    
    

    
    
    
  //����˽�еĹ��캯����private PersonRemove(String  str1 ,int n )
  public static void test3() throws Exception{  
      Class clazz = Class.forName("com.hlj.reflex.ConstructorPerson");  
      Constructor c = clazz.getDeclaredConstructor(String.class,int.class);  
        
      c.setAccessible(true);//��������  
       
      ConstructorPerson p = (ConstructorPerson) c.newInstance("˽�й�����",2);  
        
      System.out.println(p.str);  
  }  
    
    
 
} 