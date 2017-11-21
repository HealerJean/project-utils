package com.hlj.designpatterns.Builder.Item;

import com.hlj.designpatterns.Builder.Packing.Packing;

/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����2:01:05 
 * @Description: ��Ʒ��Ŀ  
 */
public interface Item {
	
	   public String name(); //����
	   public Packing packing(); //��װ
	   public float price();     //�۸�
}