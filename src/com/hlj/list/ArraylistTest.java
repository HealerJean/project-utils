package com.hlj.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��13�� ����4:43:59 
 * ��˵�� 
 */
public class ArraylistTest {

    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
    	  
        /**
         * 1������remove����
         */
      //  RemoveMethod();  
        
        /**
         * 2���趨arraylist����size
         * ArrayList��û��ֵʱ����sizeΪ0 
         * ����size��ʼ��Ϊ�� ��ʵ��û������ģ�ֻ�ᶯ̬�ĵĵõ����Ĵ�С
         */
        NewArraylist();
    }
    
    /**
     * 2���趨arraylist����size
     * ArrayList��û��ֵʱ����sizeΪ0 
     * ����size��ʼ��Ϊ�� ��ʵ��û������ģ�ֻ�ᶯ̬�ĵĵõ����Ĵ�С
     */
    private static void NewArraylist(){
    	
    	List<String> strs = new ArrayList<String>(2);
    	//����û��ֵ ��Ȼ֮��õ��� ��СΪ 0
    	System.out.println(strs.size());
    	
    	strs.add("��һ��size");
    	strs.add("��һ��size");
    	strs.add("��һ��size");
    	strs.add("��һ��size");
    	System.out.println(strs.size());

    	
    }
    
    /**
     * 1������remove����
     */
	private static void RemoveMethod() {
		List<String> empList = new ArrayList<String>();  
        empList.add("String one");  
        empList.add("String two");
          
        String str1 = "String one";
        empList.remove(str1); 
        
        System.out.println(empList.size()+empList.get(0));   // 1 
        
        Iterator it = empList.iterator();  
        while(it.hasNext()){  
            String emp = (String)it.next();  
            System.out.println(emp.toString());    
        }
	}  
}
