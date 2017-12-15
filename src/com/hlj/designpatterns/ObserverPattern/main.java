package com.hlj.designpatterns.ObserverPattern;

import com.hlj.designpatterns.ObserverPattern.abstractClass.son.BinaryObserver;
import com.hlj.designpatterns.ObserverPattern.abstractClass.son.HexaObserver;
import com.hlj.designpatterns.ObserverPattern.abstractClass.son.OctalObserver;
import com.hlj.designpatterns.ObserverPattern.inter.Subject;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:31:12 
 * @Description:
 */
public class main {
	 public static void main(String[] args) {
		 
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");    
	      subject.setState(15);
	      System.out.println("Second state change: 10");    
	      subject.setState(10);
	   }
}
