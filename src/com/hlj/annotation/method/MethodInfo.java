package com.hlj.annotation.method;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


/** 
 * @author : HealerJean
 * @date   ： 2017年12月27日 下午3:20:12 
 * @Description:
 */
/*
@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到  
@Target({})//定义注解的作用目标**作用范围字段、枚举的常量/方法  
@Documented//说明该注解将被包含在javadoc中
*/
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
	    String author() default "Pankaj";
	    String date(); //没有提供默认值，必须给出值
	    int revision() default 1;
	    String comments();
	    String value() default ""; //如果只有这个注解，则，直接    @MethodInfo("Healerjean");
}
