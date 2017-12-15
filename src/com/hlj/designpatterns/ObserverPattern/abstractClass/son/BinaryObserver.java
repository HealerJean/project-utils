package com.hlj.designpatterns.ObserverPattern.abstractClass.son;

import com.hlj.designpatterns.ObserverPattern.abstractClass.Observer;
import com.hlj.designpatterns.ObserverPattern.inter.Subject;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:29:58 
 * @Description:
 */
public class BinaryObserver extends Observer{

	   public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Binary String: " 
	      + Integer.toBinaryString( subject.getState() ) ); 
	   }
	}