package com.human.dto;

public class ColoredCircle extends Circle{
	public String color="";
	
	public void show() {
		System.out.println("반지름이 "+radius+"인 "+color+" 원이다.");
	}
	public ColoredCircle() {}
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
}
