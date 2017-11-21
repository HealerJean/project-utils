package com.hlj.Closure.CallBack;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月16日 下午4:17:01 
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