package com.hlj.Closure.CallBack;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��16�� ����4:17:01 
 * @Description:
 */
public class SuperCalculator
{
    public void add(int a, int b, doJob  customer)
    {
        int result = a + b;
        customer.fillBlank(a, b, result);
    }
}