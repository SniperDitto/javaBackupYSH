package com.human.ex;

import java.util.Arrays;

import com.human.dto.Car2;
import com.human.dto.Human;

public class JavaStart1023b {

	public static void function1() {//리턴값x, 매개변수x
		System.out.println("asdf");
		//return;
	}
	
	public static void function2(int a) {//리턴값x, 매개변수o
		System.out.println(a);
		//return;
	}	
	
	public static int function3() {//리턴값o, 매개변수x
		int returnV=1;
		return returnV;
	}
	
	public static int function4(int a,int b,int c) {//리턴값o, 매개변수o
		int returnV=0;
		returnV=a*b*c;
		return returnV;
	}
	
	public static void function5(int a) {
		a=10;
		//return;
	}
	public static int function6(int a) {
		a=10;
		return a;
	}
	public static void function7(int a[]) {//배열을 매개변수로
		a[0]=10;
		//return;
	}
	public static int[] function8(int a[]) {//배열을 매개변수로
		a[0]=12;
		return a;
	}
	public static int[] function9(int a[]) {//배열을 매개변수로
		int rValue[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			rValue[i]=a[i];
		}
		rValue[1]=21;
		a[1]=20;
		return rValue;
	}
	public static Human function10(Human h) {
		Human rHuman=h;
		rHuman.age=31;
		return rHuman;
	}
	public static Human function11(Human h) {
		Human rHuman=new Human();
		rHuman.name=h.name;
		rHuman.height=h.height;
		rHuman.age=32;
		return rHuman;
	}
	

	
	public static void main(String[] args) {
//		function1();
//		function1();
//		function2(2);
//		int a=function3();
//		System.out.println(a);
//		int b=function4(2, 4, 3);
//		System.out.println(b);
//		int i=5;
//		int arr[]= {1,2};
//		function5(i);
//		function7(arr);
//		System.out.println(i);
//		System.out.println(function6(i));
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(function8(arr)));
		
//		int b[] = {10,11};
//		System.out.println(Arrays.toString(b));
//		int rB[]=function9(b);
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(rB));
//		rB[0]=1;
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(rB));		
		
		Human h = new Human("홍길동",11,11.1);
		Human rH=function10(h);
		Human rH1=function11(h);
		System.out.println("h : "+h);
		System.out.println("rH : "+rH);
		System.out.println("rH1 : "+rH1);
		h.age=45;
		rH.height=123.4;
		rH1.height=133.3;
		System.out.println("h : "+h);
		System.out.println("rH : "+rH);
		System.out.println("rH1 : "+rH1);
		
		Car2 car = new Car2();
		car.color="빨강";
		car.company="현대";
		car.maxSpeed=200;
		car.model="소나타";
		car.tire.company="금호";
		car.tire.price=50000;
		car.tire.mileage=20;
		
		Car2 newCar = new Car2();
		newCar.color=car.color;
		newCar.company=car.company;
		newCar.maxSpeed=car.maxSpeed;
		newCar.model=car.model;
		newCar.tire.company=car.tire.company;
		newCar.tire.price=car.tire.price;
		newCar.tire.mileage=car.tire.mileage;
		
		
		
		
	}

}
