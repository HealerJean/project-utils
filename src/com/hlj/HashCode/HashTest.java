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
     *  对象的内存地址与hashcode有关系，但并不是hashcode值相等，就是代表内存地址相同，这种想法是幼稚的
     *  比如hashtable中hashcode值相等，
     *  	但是存了很多的对象，这表明对象的== 肯定不相等，Ojbect逆向推理，equals不相等，==肯定不相等 
     *  
     */
     
    public final static void main(String[] args) {    
        HashTest a = new HashTest();    
        HashTest b = new HashTest();  
        
        System.out.println(a.hashCode() == b.hashCode());  //true 人为制造hashcode值相同  
        System.out.println(a==b);    //false //== 比较对象的相等比较对象引用地址是否相等。还要要比较对象内容是否相等
        System.out.println(a.equals(b));    //false 不同的对象 object中 == 和euqals是一样的

        a.setI(1);    
        b.setI(1);    
        Set<HashTest> set = new HashSet<HashTest>();    
        set.add(a);    
        set.add(b);    
        //没有 equels 重写的情况
        System.out.println(a.hashCode() == b.hashCode());  //true hashcode相同   
        
        System.out.println(a.equals(b));    //false 不同的对象 ，创建出来的是地址就不同了
        
      //2 这个时候会发想存入了两个值  set中存放是根据hashcode值存放，如果hashcode值相同，
       //再比较equals值，如果equals值也相同，则产生一个单链表放进去
        System.out.println(set.size());    
        
    }    
}   
