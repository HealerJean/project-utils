package com.hlj.clone;


class Address implements Cloneable  { 
    private String add; 
 
    public String getAdd() { 
        return add; 
    } 
 
    public void setAdd(String add) { 
        this.add = add; 
    } 
    
    @Override 
    public Object clone() { 
        Address addr = null; 
        try{ 
            addr = (Address)super.clone(); 
        }catch(CloneNotSupportedException e) { 
            e.printStackTrace(); 
        } 
        return addr; 
    } 
} 
 
class StudentHaveDeep implements Cloneable{ 
    private int number; 
 
    private Address addr; 
     
    public Address getAddr() { 
        return addr; 
    } 
 
    public void setAddr(Address addr) { 
        this.addr = addr; 
    } 
 
    public int getNumber() { 
        return number; 
    } 
 
    public void setNumber(int number) { 
        this.number = number; 
    } 
     
    @Override 
    public Object clone() { 
        StudentHaveDeep stu = null; 
        try{ 
            stu = (StudentHaveDeep)super.clone();  //浅复制  
        }catch(CloneNotSupportedException e) { 
            e.printStackTrace(); 
        } 
        stu.addr = (Address)addr.clone();   //深度复制  

        return stu; 
    } 
} 