package com.human.dto;

public class Cat {
	public int age=0;
	public String name="";
	public boolean isVac=false;
	
	public Cat() {}
	public Cat(int age, String name, boolean isVac) {
		super();
		this.age = age;
		this.name = name;
		this.isVac = isVac;
	}
	@Override
	public String toString() {
		return "고양이 이름은 " + name + ", 나이는" + age + "입니다.";
	}
	
	public void addage(int age) {
		this.age+=age;
	}
	
	public boolean isVaccination() {
		if(this.age>5 && this.isVac==false) {
			return true;
		}else {
			return false;
		}
	}
}
