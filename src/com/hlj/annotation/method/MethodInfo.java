package com.hlj.annotation.method;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


/** 
 * @author : HealerJean
 * @date   �� 2017��12��27�� ����3:20:12 
 * @Description:
 */
/*
@Retention(RetentionPolicy.RUNTIME) // ע�����class�ֽ����ļ��д��ڣ�������ʱ����ͨ�������ȡ��  
@Target({})//����ע�������Ŀ��**���÷�Χ�ֶΡ�ö�ٵĳ���/����  
@Documented//˵����ע�⽫��������javadoc��
*/
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
	    String author() default "Pankaj";
	    String date(); //û���ṩĬ��ֵ���������ֵ
	    int revision() default 1;
	    String comments();
	    String value() default ""; //���ֻ�����ע�⣬��ֱ��    @MethodInfo("Healerjean");
}
