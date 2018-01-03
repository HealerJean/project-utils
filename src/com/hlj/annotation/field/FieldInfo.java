package com.hlj.annotation.field;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldInfo {
	
	
	    String value() default ""; //如果只有这个注解，则，直接    @MethodInfo("Healerjean");
	    
}
