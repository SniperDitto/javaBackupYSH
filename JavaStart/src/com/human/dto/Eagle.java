package com.human.dto;

public class Eagle extends Animal{
	public Eagle(String name) {
		super(name);
	}
	public void move() {
		System.out.println("날아간다");
	}
	public void hunting() {
		System.out.println("사냥");
	}
}