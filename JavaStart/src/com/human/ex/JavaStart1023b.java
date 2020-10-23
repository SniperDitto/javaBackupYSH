package com.human.ex;

import java.util.Arrays;

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
		a[0]=10;
		return a;
	}
	
	
	
	public static void main(String[] args) {
//		function1();
//		function1();
//		function2(2);
//		int a=function3();
//		System.out.println(a);
//		int b=function4(2, 4, 3);
//		System.out.println(b);
		int a=5;
		int arr[]= {1,2};
		function5(a);
		function7(arr);
		System.out.println(a);
		System.out.println(function6(a));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(function8(arr)));
	}

}
