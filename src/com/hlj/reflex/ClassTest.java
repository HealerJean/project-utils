package com.hlj.reflex;

public class ClassTest {
	/**
	 * ���캯��
	 */
	public ClassTest() {
		System.out.println("ClassTest!");
	}
	  // ��̬�Ĳ�����ʼ��  
    static {  
        System.out.println("--��̬�Ĳ�����ʼ��--");  
    }  
    // �Ǿ�̬�Ĳ�����ʼ��  
    {  
        System.out.println("--�Ǿ�̬�Ĳ�����ʼ��--");  
    }  
	public static void main(String[] args) throws Exception {
		//one testClass();

		// two testNewgetClass();
	}
	/**
	 * two
	 */
	private static void testNewgetClass() {
		Class<?> class1 = new ClassTest().getClass(); 
		/**
		 * ��ӡ���
		  --��̬�Ĳ�����ʼ��--
		  --�Ǿ�̬�Ĳ�����ʼ��--
		  ClassTest!

		 */
	}
	/**
	 * one 
	 */
	private static void testClass() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		//�������ʣ��϶�����ִ�� ��static ��̬�Ĳ�����ʼ��  
	/**
		���Ѽ��ز�������������ӣ���������class�ľ�̬����forName������ɵĹ�����
	*/
	Class clazz = Class.forName("com.hlj.reflex.ClassTest"); //��ӡ --��̬�Ĳ�����ʼ��--
	System.out.println(clazz);  //��ӡ class com.hlj.reflex.ClassTest
	/**
	 * 1��ʹ��newInstance���Խ��ʹ��newInstance��ǰ���ǣ����Ѽ��ز�������������ӣ�
	 * ��������class�ľ�̬����forName������ɵĹ�����newInstanceʵ�����ǰ�new �����ʽ�ֽ�Ϊ������
	 * �������ȵ���class�ļ��ط�������ĳ���࣬Ȼ��ʵ����
	   2��newInstance: �����͡���Ч�ʡ�ֻ�ܵ����޲ι��졣 new: ǿ���͡���Ը�Ч���ܵ����κ�public���졣
	   3�� A a = (A)Class.forName("pacage.A").newInstance(); 
		����������һ���Ľ��
		A a = new A()
	 */
	 clazz.newInstance()  ;//��ӡ --�Ǿ�̬�Ĳ�����ʼ��-- +  ClassTest! 
	
	ClassTest classDemo = (ClassTest) clazz.newInstance(); //��ӡ --�Ǿ�̬�Ĳ�����ʼ��-- +  ClassTest! 
	System.out.println(classDemo);//com.hlj.reflex.ClassTest@15db9742
	//�����������д���
	System.out.println(new ClassTest() ); //��ӡ --�Ǿ�̬�Ĳ�����ʼ��-- +  ClassTest!  + com.hlj.reflex.ClassTest@6d06d69c
	}
	

}
