package com.human.dto;

public class Dog {
	public String name="";
	public String color="";
	public int age=0;
	public Dog() {
		
	}
	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	
	
	
	
}
