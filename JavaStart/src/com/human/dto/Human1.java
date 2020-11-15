package com.human.dto;

public class Human1 extends Animal{
	public Human1(String name) {
		super(name);
	}
	@Override //annotation
	public void move() {
		System.out.println("두발로 걷는다.");
	}
	public void read() {
		System.out.println("책을 읽는다.");
	}
}
