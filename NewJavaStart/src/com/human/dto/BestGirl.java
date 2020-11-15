package com.human.dto;

public class BestGirl extends GoodGirl{
	public void show() {
		System.out.println(name+"는 자바를 매우 잘 안다.");
	}
	public BestGirl(String name) {
		super(name);
	}
}

