package com.hlj.Closure;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��16�� ����3:26:29 
 * @Description: ���������� Mike ���Ահ�
 */
public class PersonMain {
	/**
	 * 
	 * @author :HealerJean: 
	 * @date   :2017��11��16�� ����3:30:32 
	 * @Description:�ر�ע�⣺�հ��ᵼ����Դ�������գ�
	 * 				��main�����н�m��Ϊnull��ʹ��haveMeals��������drink������Ȼ��ȵ�һƿţ�̣�
	 * 				˵��Milk����û�б��ͷŵ���
	 */
	
	
	public static void main(String[] args) {
		//��һ��ţ��
		Milk m = new Milk();
	//�ڲ��࣬ͬ��
		Active haveMeals = m.HaveMeals();
		
	// ���þ�̬�ڲ��� 
	//	Active haveMeals =  new Milk().new HaveMeals();
		//û�º�һƿ
		haveMeals.drink();
		//���º�һƿ
		haveMeals.drink();
		
		//������ʣ���٣�
		m.currentNum();
	}

}