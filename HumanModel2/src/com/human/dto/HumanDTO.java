package com.human.dto;

import java.util.Date;

public class HumanDTO {
	private String name;
	private double height;
	private int age;
	private Date birthday;
	
	public HumanDTO() {}
	public HumanDTO(String name, double height, int age, Date birthday) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "HumanDTO [name=" + name + ", height=" + height + ", age=" + age + ", birthday=" + birthday + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
	
	
	
}
