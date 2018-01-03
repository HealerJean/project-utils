package com.hlj.annotation.field;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.hlj.designpatterns.ObserverPattern.main;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��27�� ����4:40:56 
 * @Description:
 */
public class Main {
	
	public static void main(String[] args) {
		Field[] fields = FieldEntry.class.getDeclaredFields();
		for(Field field :fields){
			for(Annotation annotation:field.getAnnotations()){
				System.out.println(annotation.toString());
			}
		}
	}
}
