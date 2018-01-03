package com.hlj.annotation.method;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
 
public class AnnotationParsingMain {
 
    public static void main(String[] args) {
        try {
            for (Method method : AnnotationParsingMain.class
                    .getClassLoader()
                    .loadClass(("com.hlj.annotation.AnnotationMain"))
                    .getMethods()) {
            	
            	//判断是不是 @MethodInfo的注解
                if (method.isAnnotationPresent(com.hlj.annotation.method.MethodInfo.class)) {
                    try {
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("被注解的方法名字为 " + method + " : " + anno);
                        }
                        
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() != 1) {
                            System.out.println("注解中的参数revision 不等于1,: " + method);
                        }
 
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
 
}