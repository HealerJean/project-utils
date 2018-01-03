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
            	
            	//�ж��ǲ��� @MethodInfo��ע��
                if (method.isAnnotationPresent(com.hlj.annotation.method.MethodInfo.class)) {
                    try {
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("��ע��ķ�������Ϊ " + method + " : " + anno);
                        }
                        
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() != 1) {
                            System.out.println("ע���еĲ���revision ������1,: " + method);
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