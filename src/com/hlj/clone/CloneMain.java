package com.hlj.clone;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��28�� ����3:36:56 
 * @Description:
 */
public class CloneMain {
	
	/**
	 1�� = ����
	 	��⣺�����������ͣ�������֮�󣬲���ı䣬
	 	����� ���󣬲�����û��new�������ɵĸı䣬�ɵ���Ȼ��ı䡣 
	 	ԭ�����(stu2 = stu1) ��һ�䡣�����������ǽ�stu1�����ø�ֵ��stu2��
		������stu1��stu2ָ���ڴ����ͬһ������

	 */
	@Test
	public void copeObject(){
		
		int a = 2;
		int b = a;
		b = 4;
		System.out.println("a="+a+"b="+b);
		
		Person personOne = new Person();
		personOne.setId(123L);
		
		//ԭ�����(personTwo = personOne) ��һ�䡣�����������ǽ�personOne�����ø�ֵ��personTwo��
		//������personOne��personTwoָ���ڴ����ͬһ��������ͼ��
		Person personTwo = personOne;
		
		
		System.out.println(personTwo.hashCode());
		personTwo.setId(234l);;
		personTwo.setName("HealerJean"); 
		System.out.println("personTwo:"+personTwo.getId()+"��Name:"+personTwo.getName()); //234
		System.out.println("personOne:"+personOne.getId()+"��Name:"+personOne.getName());  //234
		
		System.out.println();
		Person personThree = new Person();
		personThree = personOne;
		personThree.setId(456L);
		System.out.println("personThree:"+personThree.getId()+"��Name:"+personThree.getName());  //456
		System.out.println("personOne:"+personOne.getId()+"��Name:"+personOne.getName());  //456

		/**
		a=2b=4
		personTwo:234��Name:HealerJean
		personOne:234��Name:HealerJean
		
		personThree:456��Name:HealerJean
		personOne:456��Name:HealerJean

		 */
	
	}
	
	/**
	2��ǳ����
		1���ȹ۲�Object�е�clone����������ķ�����Protected ��Ϊ�����ǵ�������ã���Ҫ��д���clone����
    	protected native Object clone() throws CloneNotSupportedException;
		2�������Ƶ��࣬����ʵ��Cloneable�ӿڣ���ʵ�ֵĻ��ڵ���clone�������׳�CloneNotSupportedException�쳣) 
		�ýӿ�Ϊ��ǽӿ�(�����κη���)
	
		���������������ͬһ������
		
		�� �����ƶ�������б�����������ԭ���Ķ�����ͬ��ֵ�������еĶ����������������Ȼָ��ԭ���Ķ���
		 ����֮��ǳ���ƽ������������ǵĶ��󣬶��������������õĶ���
	 */
	@Test
	public void lowCopy(){
        StudentLow stu1 = new StudentLow(); 
        stu1.setNumber(12345); 
        StudentLow stu2 = (StudentLow)stu1.clone(); 
         
        System.out.println("ѧ��1:" + stu1.getNumber()); 
        System.out.println("ѧ��2:" + stu2.getNumber()); 
         
        stu2.setNumber(54321);  //����Ǹ��ƹ����ģ�ѧ��2�ı��ˣ�ѧ��1�ǲ�����
     
        System.out.println("ѧ��1:" + stu1.getNumber()); 
        System.out.println("ѧ��2:" + stu2.getNumber()); 
        
        System.out.println(("ѧ��1��ѧ��2��ͬһ��������"+(stu1==stu2)));
        
	}
	
	/**
	 * 
	3��ǳ�����м�����󣬲��Թ۲��������

	ǳ����ֻ�Ǹ�����addr���������ã���û�������Ŀ�����һ��ռ䣬��ֵ���ƺ��ٽ����÷��ظ��¶���
	���ԣ�Ϊ�˴ﵽ�����ĸ��ƶ��󣬶����Ǵ������ø��ơ�
	������Ҫ��Address��ɸ��ƻ��������޸�Sudent�е�clone���� ����۲�4
	 */
	@Test
	public void noDeepCopy(){
		
	        AddressNo addr = new AddressNo(); 
	        addr.setAdd("������"); 
	        StudentNoDeep stu1 = new StudentNoDeep(); 
	        stu1.setNumber(123); 
	        stu1.setAddr(addr); 
	         
	        StudentNoDeep stu2 = (StudentNoDeep)stu1.clone(); 
	         
	        System.out.println("ѧ��1:" + stu1.getNumber() + ",��ַ:" + stu1.getAddr().getAdd()); 
	        System.out.println("ѧ��2:" + stu2.getNumber() + ",��ַ:" + stu2.getAddr().getAdd()); 
	   
	       
	        //ͬһ����ַaddr �ı������ݣ������stu1��stu2����ı�
	        addr.setAdd("̫ԭ��");
	       
	        //�������¿��ٵĵ�ַ�����Ի�ı䣬���Ƕ�����Ըı��Լ��Ķ��������ụ��Ӱ��
	       // stu2.setAddr(getAddressNo()); 
	       // stu1.setAddr(getAddressNo()); 

	        System.out.println("ѧ��1:" + stu1.getNumber() + ",��ַ:" + stu1.getAddr().getAdd()); 
	        System.out.println("ѧ��2:" + stu2.getNumber() + ",��ַ:" + stu2.getAddr().getAdd()); 
	}
	
	
	public AddressNo getAddressNo(){
		  AddressNo addr = new AddressNo(); 
	       addr.setAdd("̫ԭ��"); 
	       return addr;
	}
	
	/**
	 ���
	 */
	@Test
	public void deepCopy(){
		
	        Address addr = new Address(); 
	        addr.setAdd("������"); 
	        StudentHaveDeep stu1 = new StudentHaveDeep(); 
	        stu1.setNumber(123); 
	        stu1.setAddr(addr); 
	         
	        StudentHaveDeep stu2 = (StudentHaveDeep)stu1.clone(); 
	         
	        System.out.println("ѧ��1:" + stu1.getNumber() + ",��ַ:" + stu1.getAddr().getAdd()); 
	        System.out.println("ѧ��2:" + stu2.getNumber() + ",��ַ:" + stu2.getAddr().getAdd()); 
	

	        addr.setAdd("̫ԭ��");
	        
	        System.out.println("ѧ��1:" + stu1.getNumber() + ",��ַ:" + stu1.getAddr().getAdd()); 
	        System.out.println("ѧ��2:" + stu2.getNumber() + ",��ַ:" + stu2.getAddr().getAdd()); 
	}
	
	public native void test();
}
