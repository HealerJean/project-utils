package com.hlj.equils;

public class EquilsTest {
	public static void main(String[] args) {
		dy();
		//== ��ַ��ͬ��equit ׃����ͬ
	}
	public static void dy(){
		
		String a = "132456";
		String a2 = "132456";

		String abuilder = new String("123456");
		String abuilder2 = new String(abuilder);

		String ab = new String(abuilder);
		if(a==a2){ //a a2 ��ַ��ͬ
			System.out.println("a==a2"); //����
		}else {
			System.out.println("a !=a2");
		}
		
		if(a==abuilder){//a abuilder ��ַ��ͬ
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !=abuilder");//����
		}
		
		if(a.equals(abuilder)){ //��ַ��ָ��Ķ��� ��ͬ
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !equals =abuilder");//����
		}
		
		if(abuilder==abuilder2){ //��ַ��ͬ
			System.out.println("abuilder = abuilder2");
		}else {
			System.out.println("abuilder != abuilder2"); //����
		}
		
		if(abuilder.equals(abuilder2)){
			System.out.println("abuilder equals= abuilder2"); //����
		}else {
			System.out.println("abuilder !equals= abuilder2");
		}
		
		/**
		 1��
		 String���е�equals()�����������ǽ��������˶������ݵıȽϣ���û�бȽ϶���洢��ַ,
		 					������ΪString����д��equals()������hashCode()������
		 					
		 ==           �϶������õ�ַ�Ƿ���ȡ�   ��Ҫ�Ƚ϶����������
		  
		 2��
		 * �����== ��equals
		  
			 Ĭ����� �� equals()��hashCode()���Ǵ�Object���м̳ж����ģ�
			 ��Object��equals()Ĭ��ʵ�ֵ��ǱȽ����������Ƿ�==����Ĭ�ϵ�equals()��==��Ч����һ����
			 Object��equels��������
			     public boolean equals(Object obj) {
	        		return (this == obj);
	    		} 
			 
		 * �����equals�Ƚ�����ͨ�� �����hashcode ֵ�ҵ����ӣ�λ�ã����ٿ�����ַ�ǲ���һ����
		 * Object�ĵ�ַ�ڴ�����ʱ��ͻ᲻һ���ģ�
		 * hashcode ����ȷ�������λ�ã����ӣ����ٱȽ϶�������
		 * 
		 * == �ǱȽϵ�ַ�����ݶ��ǲ�����ͬ
		 */
		
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		System.out.println(person1.hashCode()+"\n"+person2.hashCode()); // ����� 
		System.out.println(person1==person2); //false 
		System.out.println(person1.equals(person2)); //false 
		
		
		
	}
}
