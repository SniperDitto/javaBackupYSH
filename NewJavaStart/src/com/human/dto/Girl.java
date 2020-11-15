package com.human.dto;

public class Girl {
	protected String name="그녀";
	public void show() {
		System.out.println(name+"는 자바 초보자이다.");
	}
	public Girl(String name) {
		this.name = name;
	}
}
