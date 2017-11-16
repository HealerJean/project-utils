package com.hlj.zigzag;

import javax.swing.Spring;

public class Person {
 String name = "z";
int i;
public Person(int i, String string) {
	
	this.name = string;
	this.i = i;
}
 
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
