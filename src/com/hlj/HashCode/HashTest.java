package com.hlj.HashCode;

import java.util.HashSet;
import java.util.Set;


public class HashTest {    
    private int i;    
    
    public int getI() {    
        return i;    
    }    
    
    public void setI(int i) {    
        this.i = i;    
    }    
 /*   
    @Override
    public boolean equals(Object object) {    
        if (object == null) {    
            return false;    
        }    
        if (object == this) {    
            return true;    
        }    
        if (!(object instanceof HashTest)) {    
            return false;    
        }    
        HashTest other = (HashTest) object;    
        if (other.getI() == this.getI()) {    
            return true;    
        }    
        return false;    
    }  */
    /*
    @Override
    public int hashCode() {    
        return i % 10;    
    } */   
    /**
     *  ������ڴ��ַ��hashcode�й�ϵ����������hashcodeֵ��ȣ����Ǵ����ڴ��ַ��ͬ�������뷨�����ɵ�
     *  ����hashtable��hashcodeֵ��ȣ�
     *  	���Ǵ��˺ܶ�Ķ�������������== �϶�����ȣ�Ojbect��������equals����ȣ�==�϶������ 
     *  
     */
     
    public final static void main(String[] args) {    
        HashTest a = new HashTest();    
        HashTest b = new HashTest();  
        
        System.out.println(a.hashCode() == b.hashCode());  //true ��Ϊ����hashcodeֵ��ͬ  
        System.out.println(a==b);    //false //== �Ƚ϶������ȱȽ϶������õ�ַ�Ƿ���ȡ���ҪҪ�Ƚ϶��������Ƿ����
        System.out.println(a.equals(b));    //false ��ͬ�Ķ��� object�� == ��euqals��һ����

        a.setI(1);    
        b.setI(1);    
        Set<HashTest> set = new HashSet<HashTest>();    
        set.add(a);    
        set.add(b);    
        //û�� equels ��д�����
        System.out.println(a.hashCode() == b.hashCode());  //true hashcode��ͬ   
        
        System.out.println(a.equals(b));    //false ��ͬ�Ķ��� �������������ǵ�ַ�Ͳ�ͬ��
        
      //2 ���ʱ��ᷢ�����������ֵ  set�д���Ǹ���hashcodeֵ��ţ����hashcodeֵ��ͬ��
       //�ٱȽ�equalsֵ�����equalsֵҲ��ͬ�������һ��������Ž�ȥ
        System.out.println(set.size());    
        
    }    
}   
