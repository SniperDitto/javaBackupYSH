package com.human.ex;

class ToyRobot implements Toy{
	public void alarm() {
		System.out.println("The robot has no alarm function.");
	}

	public void light() {
		System.out.println("The robot has light function.");
	}

	public void walk() {
		System.out.println("The robot can walk.");
	}

	public void run() {
		System.out.println("The robot can run.");
	}
}

class ToyAirplane implements Toy{
	public void alarm() {
		System.out.println("The airplane has alarm function.");
	}

	public void light() {
		System.out.println("The airplane has no light function.");
	}

	public void walk() {
		System.out.println("The airplane can not walk.");
	}

	public void run() {
		System.out.println("The airplane can not run.");
	}
}

interface Toy{
	public void alarm();
	public void light();
	public void walk();
	public void run();
	
}

public class JavaInter1113 {

	public static void main(String[] args) {
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		Toy toys[] = {robot,airplane};
		
		for (int i=0;i<toys.length;i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}

	}

}
