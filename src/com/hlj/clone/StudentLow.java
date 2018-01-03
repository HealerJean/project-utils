package com.hlj.clone;

class StudentLow implements Cloneable{ 
    private int number; 
 
    public int getNumber() { 
        return number; 
    } 
 
    public void setNumber(int number) { 
        this.number = number; 
    } 
     
    @Override 
    public Object clone() { 
        StudentLow stu = null; 
        try{ 
            stu = (StudentLow)super.clone(); 
        }catch(CloneNotSupportedException e) { 
            e.printStackTrace(); 
        } 
        return stu; 
    } 
} 