package com.hlj.clone;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月28日 下午3:36:56 
 * @Description:
 */
public class CloneMain {
	
	/**
	 1、 = 复制
	 	理解：基本数据类型，它复制之后，不会改变，
	 	如果是 对象，不管有没有new，新生成的改变，旧的自然会改变。 
	 	原因出在(stu2 = stu1) 这一句。该语句的作用是将stu1的引用赋值给stu2，
		这样，stu1和stu2指向内存堆中同一个对象

	 */
	@Test
	public void copeObject(){
		
		int a = 2;
		int b = a;
		b = 4;
		System.out.println("a="+a+"b="+b);
		
		Person personOne = new Person();
		personOne.setId(123L);
		
		//原因出在(personTwo = personOne) 这一句。该语句的作用是将personOne的引用赋值给personTwo，
		//这样，personOne和personTwo指向内存堆中同一个对象。如图：
		Person personTwo = personOne;
		
		
		System.out.println(personTwo.hashCode());
		personTwo.setId(234l);;
		personTwo.setName("HealerJean"); 
		System.out.println("personTwo:"+personTwo.getId()+"、Name:"+personTwo.getName()); //234
		System.out.println("personOne:"+personOne.getId()+"、Name:"+personOne.getName());  //234
		
		System.out.println();
		Person personThree = new Person();
		personThree = personOne;
		personThree.setId(456L);
		System.out.println("personThree:"+personThree.getId()+"、Name:"+personThree.getName());  //456
		System.out.println("personOne:"+personOne.getId()+"、Name:"+personOne.getName());  //456

		/**
		a=2b=4
		personTwo:234、Name:HealerJean
		personOne:234、Name:HealerJean
		
		personThree:456、Name:HealerJean
		personOne:456、Name:HealerJean

		 */
	
	}
	
	/**
	2、浅复制
		1、先观察Object中的clone方法，里面的方法是Protected ，为了我们的类可以用，需要重写这个clone方法
    	protected native Object clone() throws CloneNotSupportedException;
		2、被复制的类，必须实现Cloneable接口，不实现的话在调用clone方法会抛出CloneNotSupportedException异常) 
		该接口为标记接口(不含任何方法)
	
		结果：这两个不是同一个对象
		
		： 被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。
		 换言之，浅复制仅仅复制所考虑的对象，而不复制它所引用的对象。
	 */
	@Test
	public void lowCopy(){
        StudentLow stu1 = new StudentLow(); 
        stu1.setNumber(12345); 
        StudentLow stu2 = (StudentLow)stu1.clone(); 
         
        System.out.println("学生1:" + stu1.getNumber()); 
        System.out.println("学生2:" + stu2.getNumber()); 
         
        stu2.setNumber(54321);  //这个是复制过来的，学生2改变了，学生1是不会变得
     
        System.out.println("学生1:" + stu1.getNumber()); 
        System.out.println("学生2:" + stu2.getNumber()); 
        
        System.out.println(("学生1和学生2是同一个对象吗"+(stu1==stu2)));
        
	}
	
	/**
	 * 
	3、浅复制中加入对象，测试观察引出深复制

	浅复制只是复制了addr变量的引用，并没有真正的开辟另一块空间，将值复制后再将引用返回给新对象。
	所以，为了达到真正的复制对象，而不是纯粹引用复制。
	我们需要将Address类可复制化，并且修改Sudent中的clone方法 具体观察4
	 */
	@Test
	public void noDeepCopy(){
		
	        AddressNo addr = new AddressNo(); 
	        addr.setAdd("杭州市"); 
	        StudentNoDeep stu1 = new StudentNoDeep(); 
	        stu1.setNumber(123); 
	        stu1.setAddr(addr); 
	         
	        StudentNoDeep stu2 = (StudentNoDeep)stu1.clone(); 
	         
	        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd()); 
	        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd()); 
	   
	       
	        //同一个地址addr 改变了内容，下面的stu1和stu2都会改变
	        addr.setAdd("太原市");
	       
	        //下面是新开辟的地址，所以会改变，但是都会各自改变自己的东西。不会互相影响
	       // stu2.setAddr(getAddressNo()); 
	       // stu1.setAddr(getAddressNo()); 

	        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd()); 
	        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd()); 
	}
	
	
	public AddressNo getAddressNo(){
		  AddressNo addr = new AddressNo(); 
	       addr.setAdd("太原市"); 
	       return addr;
	}
	
	/**
	 深复制
	 */
	@Test
	public void deepCopy(){
		
	        Address addr = new Address(); 
	        addr.setAdd("杭州市"); 
	        StudentHaveDeep stu1 = new StudentHaveDeep(); 
	        stu1.setNumber(123); 
	        stu1.setAddr(addr); 
	         
	        StudentHaveDeep stu2 = (StudentHaveDeep)stu1.clone(); 
	         
	        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd()); 
	        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd()); 
	

	        addr.setAdd("太原市");
	        
	        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd()); 
	        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd()); 
	}
	
	public native void test();
}
