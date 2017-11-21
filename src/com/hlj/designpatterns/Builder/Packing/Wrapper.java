package com.hlj.designpatterns.Builder.Packing;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午2:02:28 
 * @Description: 包裹 
 */
public class Wrapper implements Packing {

	   @Override
	   public String pack() {
	      return "Wrapper";
	   }
	}