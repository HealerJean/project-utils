package com.hlj.Closure;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��16�� ����3:24:00 
 * @Description: �հ���ʹ��
 */
public class Milk {
	
	public final static String name = "��ţ��";//����
	
	private static int num = 16;//����
	
	public Milk()
	{
		System.out.println(name+"��16/ÿ��");
	}
	
	/**
	 * �հ���ͨ������Active�ķ���ʵ�ֶ�Milk˽�б���num�����޸ġ�
	 * @return ����һ����ţ�̵Ķ���
	 */
	public Active HaveMeals(){
		return new Active(){
			public void drink(){
				if(num == 0){
					System.out.println("ľ���ˣ�������Ѿ������.");
					return;
				}
				num--;
				System.out.println("�ȵ�һƿţ��");
			}
		};
	}
	
	/**
	 * ��ȡʣ������
	 */
	public void currentNum()
	{
		System.out.println(name+"ʣ�ࣺ"+num);
	}
}

/**
 * ͨ�ýӿ�
 */
interface Active
{
	void drink();
}