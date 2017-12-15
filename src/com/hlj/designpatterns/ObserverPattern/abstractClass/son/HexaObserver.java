package com.hlj.designpatterns.ObserverPattern.abstractClass.son;

import com.hlj.designpatterns.ObserverPattern.abstractClass.Observer;
import com.hlj.designpatterns.ObserverPattern.inter.Subject;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:30:46 
 * @Description:
 */
public class HexaObserver extends Observer{

	   public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Hex String: " 
	      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
}
