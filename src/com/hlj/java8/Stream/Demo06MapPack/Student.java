package com.hlj.java8.Stream.Demo06MapPack;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class Student {
	
	private String name;
	private String id;
	private Date birthday;
	private Map<String, Double> scores;
	private String from;
	private String phoneNumber;
	private String email;
	private String gender;
	private String[] course;
	private double height;
	private double weight;
	
	
	public Student(String name, String id, Date birthday, Map<String, Double> scores, String from, String phoneNumber,
                   String email, String gender, String[] course, double height, double weight) {
		super();
		this.name = name;
		this.id = id;
		this.birthday = birthday;
		this.scores = scores;
		this.from = from;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.height = height;
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isFrom(String from) {
		return this.from.equalsIgnoreCase(from);
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Map<String, Double> getScores() {
		return scores;
	}
	public void setScores(Map<String, Double> scores) {
		this.scores = scores;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", birthday=" + birthday + ", scores=" + scores + ", from="
				+ from + ", phoneNumber=" + phoneNumber + ", email=" + email + ", gender=" + gender + ", course="
				+ Arrays.toString(course) + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
