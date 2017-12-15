package com.hlj.designpatterns.ObserverPattern.inter;
import java.util.ArrayList;
import java.util.List;

import com.hlj.designpatterns.ObserverPattern.abstractClass.Observer;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:28:08 
 * @Description:
 */


public class Subject {
    
   private List<Observer> observers 
      = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);        
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }     
}