package com.hlj.Closure.CallBack;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��16�� ����4:00:22 
 * @Description:
 */
public class Student
{
    private String name = null;

    public Student(String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public class doHomeWork implements doJob
    {

        @Override
        public void fillBlank(int a, int b, int result)
        {
            // TODO Auto-generated method stub
            System.out.println(name + "����С�����:" + a + " + " + b + " = " + result);
        }
        
    }
    
    public void callHelp (int a, int b)
    {
        new SuperCalculator().add(a, b, new doHomeWork());
    }
}