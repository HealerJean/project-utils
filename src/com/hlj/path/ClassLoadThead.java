package com.hlj.path;

import java.net.URL;

import com.hlj.file.FileTest;

/** 
 *  ��weblogic ʹ�ñ�ʵ�� 
 */
public class ClassLoadThead {
	
	public static void main(String[] args) {
		threadClassload();
	}
	private static void threadClassload() {
	
		//�� / ������ʾ 
		URL urlThread_ =Thread.currentThread().getContextClassLoader().getResource("");
		System.out.println("urlThread_"+urlThread_);
		// �� / null
		URL urlThread_1 =Thread.currentThread().getContextClassLoader().getResource("/");
		System.out.println("urlThread_1:λ�գ�����"+urlThread_1);

		/**
		 * �Ӳ��� / ��һ�� ĩβ���� / �������
		 */
		URL urlClassLoader_ = FileTest.class.getClassLoader().getResource("");
		System.out.println("urlClassLoader_"+urlClassLoader_);

		URL urlClassLoader_1 = FileTest.class.getClassLoader().getResource("");
		System.out.println("urlClassLoader_1"+urlClassLoader_1);

	}
}
