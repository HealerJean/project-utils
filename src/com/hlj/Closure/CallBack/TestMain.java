package com.hlj.Closure.CallBack;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��16�� ����4:00:59 
 * @Description:
 */
public class TestMain
{
    public static void main(String[] args)
    {
        int a = 56;
        int b = 31;
        int c = 26497;
        int d = 11256;
        Student s1 = new Student("С��");
        Seller s2 = new Seller("������");
        
        s1.callHelp(a, b);
        s2.callHelp(c, d);
    }
}