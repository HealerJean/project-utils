package com.hlj.Serializable;
/** 
 * @author : HealerJean
 * @date   ： 2017年12月4日 下午4:59:47 
 * @Description:
 */
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
import java.io.Serializable;  
  
public class SerializableOne implements Serializable  
{  
    private static final long serialVersionUID = 1L;  
    private String name="SheepMu";  
    private int age=24;  
    
    public static void main(String[] args) {
        try   
        {  //以下代码实现序列化  
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("my.out"));//输出流保存的文件名为 my.out ；ObjectOutputStream能把Object输出成Byte流  
            SerializableOne myTest=new SerializableOne();  
            oos.writeObject(myTest);   
            oos.flush();  //缓冲流   
            oos.close(); //关闭流  
        } catch (FileNotFoundException e)   
        {          
            e.printStackTrace();  
        } catch (IOException e)   
        {  
            e.printStackTrace();  
        }   
        fan();//调用下面的  反序列化  代码  
    }  
    public static void fan()//反序列的过程  
    {      
         ObjectInputStream oin = null;//局部变量必须要初始化  
        try  
        {  
            oin = new ObjectInputStream(new FileInputStream("my.out"));  
        } catch (FileNotFoundException e1)  
        {          
            e1.printStackTrace();  
        } catch (IOException e1)  
        {  
            e1.printStackTrace();  
        }        
        SerializableOne mts = null;  
        try {  
            mts = (SerializableOne ) oin.readObject();//由Object对象向下转型为MyTest对象  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }       
         System.out.println("name="+mts.name);      
         System.out.println("age="+mts.age);      
    }  
}  