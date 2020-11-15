package com.human.dto;

public class Man {
	private int age=0;
	private String name="";
	private boolean isMarried=false;
	private int children=0;
	private static Man instance=new Man();
	
	private Man() {}
	public static Man getInstance() {
		return instance;
	}
	@Override
	public String toString() {
		return "age=" + age + "\nname=" + name + "\nisMarried=" + isMarried + "\nchildren=" + children;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		if(age<0)age=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
		if(children<0)children=0;
	}
	
	
}
