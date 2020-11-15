package com.human.dto;

public class Circle {
	public int radius=0;
	
	public void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
	}
	
}
