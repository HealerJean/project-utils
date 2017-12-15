package com.hlj.designpatterns.ObserverPattern.abstractClass.son;

import com.hlj.designpatterns.ObserverPattern.abstractClass.Observer;
import com.hlj.designpatterns.ObserverPattern.inter.Subject;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:30:23 
 * @Description:
 */
public class OctalObserver extends Observer{

	   public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " 
	     + Integer.toOctalString( subject.getState() ) ); 
	   }
}