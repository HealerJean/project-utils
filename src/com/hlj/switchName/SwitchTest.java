package com.hlj.switchName;

import org.junit.Test;

public class SwitchTest {
	public static void main(String[] args) {
		name();
	}
	
	public static void name() {
			String i="b";

			switch(i) {
			case "a":
			System.out.println("a");
			break;
			case "b":
				System.out.println("b");

			case "c":
			System.out.println("c");

			default:
			System.out.println("default");
			break;

			}
		}

		@Test
		public void switchVar(){

			String name = "naem";
			switch (name){
				case  "healerjean":
					String user = name ;
				break;
				case  "zhangyujin":
//					String user = name ; ±¨´í
			}


		}


}
