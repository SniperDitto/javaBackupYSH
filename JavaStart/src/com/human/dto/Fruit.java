package com.human.dto;

public class Fruit {
	public String name="";
	
	public Fruit() {
		
	}

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	
}
