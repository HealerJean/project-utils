package com.hlj.yc;


/*下面做了归纳总结,欢迎批评指正*/  

/*自定义异常*/  
class ChushulingException extends Exception  
{  
    public ChushulingException(String msg)  
    {  
        super(msg);  
    }  
}   
  
class ChushufuException extends Exception  
{  
    public ChushufuException(String msg)  
    {  
        super(msg);  
    }  
}  
  
/*自定义异常 End*/  
  
class Numbertest   
{  
    public int shang(int x,int y) throws ChushulingException,ChushufuException  
    {  
        if(y<0)  
        {  
            throw new ChushufuException("您输入的是"+y+",规定除数不能为负数!");//抛出异常  设置异常的信息
        }  
        if(y==0)  
        {  
            throw new ChushulingException("您输入的是"+y+",除数不能为0!");  
        }  
      
        int m=x/y;  
        return m;  
    }  
}  
  
  
  
  
  
public class TestYc  
{  
    public static void main(String[]args)  
    {  
        Numbertest n=new Numbertest();  
  
        //捕获异常  
        try  
        {  
            System.out.println("商="+n.shang(1,-3));  
        }  
        catch(ChushulingException yc)  
        {  
            System.out.println(yc.getMessage());  
            yc.printStackTrace();  
        }  
        catch(ChushufuException yx)  
        {  
            System.out.println(yx.getMessage()+"hello");  
           yx.printStackTrace();  
        }  
        catch(Exception y)  
        {  
            System.out.println(y.getMessage());  
            y.printStackTrace();  
        }  
      
    finally{ System.out.println("finally!");} ////finally不管发没发生异常都会被执行    
        System.out.println("结束");
    }  
}  
/* 
[总结] 
 
1.自定义异常: 
 
class 异常类名 extends Exception 
{ 
    public 异常类名(String msg) 
    { 
        super(msg); 
    } 
}  
 
2.标识可能抛出的异常: 
 
throws 异常类名1,异常类名2 
 
3.捕获异常: 
try{} 
catch(异常类名 y){} 
catch(异常类名 y){} 
 
4.方法解释 
getMessage() //输出异常的信息 
printStackTrace() //输出导致异常更为详细的信息 
 
 
*/  