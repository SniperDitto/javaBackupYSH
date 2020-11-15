package com.human.dto;

public class RPillar extends Rectangle1111{
	public double length=0;
	public double volume() {
		return area()*length;
	}
	public RPillar(double width, double height, double length) {
		this.width=width;
		this.height=height;
		this.length = length;
	}
	public RPillar() {}
	
	
	
}
