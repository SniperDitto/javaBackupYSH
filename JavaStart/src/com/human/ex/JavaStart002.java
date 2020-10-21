package com.human.ex;

import com.human.dto.Human;


class Dog{
	public String name="";
	public int age=0;
	public String eyeColor="";
}

public class JavaStart002 {
	
	public static void main(String[] args) {
		Human h1=new Human();
		h1.name="홍길동";
		h1.age=23;
		h1.height=177.88;
		Human h2=new Human();
		h2.name="qwe";
		h2.age=22;
		h2.height=172.88;
		Dog d1=new Dog();
		d1.name="asdf";
		d1.age=3;
		d1.eyeColor="black";
			
		System.out.println();
			
	}

}
