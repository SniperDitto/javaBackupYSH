package com.human.dto;

public class Rectangle1111 {
	public double width=0;
	public double height=0;
	public double area() {
		return width*height;
	}
	public double round() {
		return width*2+height*2;
	}
	public Rectangle1111() {}
	public Rectangle1111(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
}
