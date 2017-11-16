package com.hlj.Closure.CallBack;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月16日 下午4:00:59 
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
        Student s1 = new Student("小明");
        Seller s2 = new Seller("老婆婆");
        
        s1.callHelp(a, b);
        s2.callHelp(c, d);
    }
}