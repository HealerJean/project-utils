package com.hlj.path;

import java.net.URL;

import com.hlj.file.FileTest;

/** 
 *  在weblogic 使用本实例 
 */
public class ClassLoadThead {
	
	public static void main(String[] args) {
		threadClassload();
	}
	private static void threadClassload() {
	
		//无 / 正常显示 
		URL urlThread_ =Thread.currentThread().getContextClassLoader().getResource("");
		System.out.println("urlThread_"+urlThread_);
		// 有 / null
		URL urlThread_1 =Thread.currentThread().getContextClassLoader().getResource("/");
		System.out.println("urlThread_1:位空：：："+urlThread_1);

		/**
		 * 加不加 / 都一样 末尾都是 / 二者相等
		 */
		URL urlClassLoader_ = FileTest.class.getClassLoader().getResource("");
		System.out.println("urlClassLoader_"+urlClassLoader_);

		URL urlClassLoader_1 = FileTest.class.getClassLoader().getResource("");
		System.out.println("urlClassLoader_1"+urlClassLoader_1);

	}
}
