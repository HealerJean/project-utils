package com.hlj.xml;

public class XmlEntry {
	public String name ;
	public int age;
	public boolean sutudent;
	public String grade;
	public double salary; //нˮ
	public String classId;
	public int classPersonNum;

	public XmlEntry() {
	}
	
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public int getClassPersonNum() {
		return classPersonNum;
	}

	public void setClassPersonNum(int classPersonNum) {
		this.classPersonNum = classPersonNum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSutudent() {
		return sutudent;
	}
	public void setSutudent(boolean sutudent) {
		this.sutudent = sutudent;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
