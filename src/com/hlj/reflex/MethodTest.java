package com.hlj.reflex;

import java.lang.reflect.Method;


public class MethodTest {
    public static void main(String[] args) {
       // two 
    	getMethodSome();
    	// one getMethods();
    }

    private static void getMethods() {
	    	Class<?> methodPersonClass = MethodPerson.class;
	        Method[] methods = methodPersonClass.getMethods();
	        for (Method method : methods) {
	            System.out.println(method);
	            System.out.println(method.getName());

	        }
        }
    /**
     * two
     */
	private static void getMethodSome() {
		Class<?> methodPersonClass = MethodPerson.class;
        try {
            Method setNameMethod = methodPersonClass.getMethod("setName",String.class);
            Method getNameMethod = methodPersonClass.getMethod("getName");
            MethodPerson methodPerson = (MethodPerson)methodPersonClass.newInstance();
           // Object methodPerson = herosClass.newInstance(); //ͬ��
            
            setNameMethod.invoke(methodPerson,"setNameMethod.setName����");
            /**
             * 1����� MethodPerson ����  û�� toString ����������ӡ������������ 
             * 
	             * ��ӡ�� ����set������com.hlj.reflex.MethodPerson@6d06d69c
	         * 
             * 2�����  MethodPerson ���� �� toString ����������ӡToString���������е�����
	             * ��ӡ�� ����set������MethodPerson [
						 name=setNameMethod.setName����, 
						 type=null, 
						 camp=0
						]
             */
            System.out.println("����set������"+methodPerson);
            /**
             * ֱ�Ӵ�ӡ��getNname�Ľ��ֵ �������Ѿ���ֵ�ˣ����Դ�ӡ�������
             * ��ӡ������get������setNameMethod.setName����
             */
            System.out.println("����get������"+getNameMethod.invoke(methodPerson));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}