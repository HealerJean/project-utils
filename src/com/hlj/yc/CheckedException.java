package com.hlj.yc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��20�� ����10:35:29 
 * @Description:
 */
public class CheckedException {
	
	/**
	 *1�� FileNotFoundException
	 */
	@Test
	public void testFileNotFoundException() throws FileNotFoundException{
		FileInputStream file = new FileInputStream(new File("666"));
		
	}
	
	/**
	 * 2��ClassNotFoundException
	 */
	@Test
	public void testClassNotFoundException() throws ClassNotFoundException {

			Class<?> cla = Class.forName("a");
	}
	
	
}
