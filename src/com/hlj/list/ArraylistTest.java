package com.hlj.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月13日 下午4:43:59 
 * 类说明 
 */
public class ArraylistTest {

    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
    	  
        /**
         * 1、测试remove方法
         */
      //  RemoveMethod();  
        
        /**
         * 2、设定arraylist最大的size
         * ArrayList中没有值时，则size为0 
         * 不管size初始化为几 其实是没有意义的，只会动态的的得到它的大小
         */
        NewArraylist();
    }
    
    /**
     * 2、设定arraylist最大的size
     * ArrayList中没有值时，则size为0 
     * 不管size初始化为几 其实是没有意义的，只会动态的的得到它的大小
     */
    private static void NewArraylist(){
    	
    	List<String> strs = new ArrayList<String>(2);
    	//里面没有值 自然之类得到的 大小为 0
    	System.out.println(strs.size());
    	
    	strs.add("第一个size");
    	strs.add("第一个size");
    	strs.add("第一个size");
    	strs.add("第一个size");
    	System.out.println(strs.size());

    	
    }
    
    /**
     * 1、测试remove方法
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
