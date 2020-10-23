package com.human.dto;

public class Human {
	public String name="";
	public int age=0;
	public double height=0;
	
	public Human() {//기본 생성자 : 사용자가 생성자를 따로 만들었을 때는 없어지므로 따로 써줘야함
		
	}
	public Human(String name, int age, double height) {//생성자 만들기
		super();//부모 클래스
		this.name = name;
		this.age = age;
		this.height = height;
	}
	//toString
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

}
