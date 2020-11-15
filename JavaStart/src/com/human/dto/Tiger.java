package com.human.dto;

public class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
	}
	public void move() {
		System.out.println("네발로 걷는다");
	}
	public void hunting() {
		System.out.println("사냥");
	}
}
