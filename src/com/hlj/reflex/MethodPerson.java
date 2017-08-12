package com.hlj.reflex;


public class MethodPerson {
   private String name;//����
   private String type;//����
   private int camp;//0,������1������
    
   public MethodPerson(){}

   public MethodPerson(String name, String type, int camp) {
       super();
       this.name = name;
       this.type = type;
       this.camp = camp;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getType() {
       return type;
   }

   public void setType(String type) {
       this.type = type;
   }

   public int getCamp() {
       return camp;
   }

   public void setCamp(int camp) {
       this.camp = camp;
   }
   /**
    * 
    */
   @Override
   public String toString() {
       return "MethodPerson [\n name=" + name + ", \n type=" + type + ", \n camp=" + camp + "\n]";
   }
    
}