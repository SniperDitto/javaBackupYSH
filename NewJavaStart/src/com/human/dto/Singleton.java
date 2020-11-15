package com.human.dto;

public class Singleton {//메모리에 하나만 만들도록 함 ex)시계
	public int count=0;
	private static Singleton instance=new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
