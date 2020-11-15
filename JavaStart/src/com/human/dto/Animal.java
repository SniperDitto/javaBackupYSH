package com.human.dto;


public class Animal {
	public String name="";
	public void getname() {
		System.out.println(name);
	}
	public static void displayName(Animal a) {
		a.getname();
		a.move();
	}
	
	
	public void eat() {
		System.out.println("먹는다.");
	}
	public void move() {
		System.out.println("움직인다.");
	}
	public Animal() {}
	public Animal(String name) {
		super();
		this.name = name;
	}
	
}