package com.hlj.Serializable;
/** 
 * @author : HealerJean
 * @date   �� 2017��12��4�� ����4:59:47 
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
        {  //���´���ʵ�����л�  
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("my.out"));//�����������ļ���Ϊ my.out ��ObjectOutputStream�ܰ�Object�����Byte��  
            SerializableOne myTest=new SerializableOne();  
            oos.writeObject(myTest);   
            oos.flush();  //������   
            oos.close(); //�ر���  
        } catch (FileNotFoundException e)   
        {          
            e.printStackTrace();  
        } catch (IOException e)   
        {  
            e.printStackTrace();  
        }   
        fan();//���������  �����л�  ����  
    }  
    public static void fan()//�����еĹ���  
    {      
         ObjectInputStream oin = null;//�ֲ���������Ҫ��ʼ��  
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
            mts = (SerializableOne ) oin.readObject();//��Object��������ת��ΪMyTest����  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }       
         System.out.println("name="+mts.name);      
         System.out.println("age="+mts.age);      
    }  
}  