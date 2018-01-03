package com.hlj.annotation.field;
/** 
 * @author : HealerJean
 * @date   ： 2017年12月27日 下午4:38:55 
 * @Description:
 */
public class FieldEntry {
	
	@FieldInfo("HealerJean")
	 String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
