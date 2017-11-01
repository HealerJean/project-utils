package com.hlj.test;

import java.text.DecimalFormat;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月30日 下午5:49:46 
 * 类说明 
 */
public class TestJar {
	public static void main(String[] args) {
		DecimalFormat dfg = new DecimalFormat("###0");
		System.out.println(dfg);
 	}
}
