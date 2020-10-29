package com.human.ex;

public class JavaStart005 {//1029
	
	public static int functionA(int a) {
		System.out.println("Astart");
		a=functionB(a);
		System.out.println("Aend");
		return a+1;
	}
	public static int functionB(int a) {
		System.out.println("Bstart");
		System.out.println("Bend");
		return a*2;
	}
	public static int functionC(int a) {
		System.out.println("Cstart");
		System.out.println("Cend");
		return a+3;
	}
	public static int functionD(int a) {
		System.out.println("Dstart");
		System.out.println("Dend");
		return a+4;
	}
	
	public static void main(String[] args) {
		int a=1;	
		System.out.println(functionA(a));	
		System.out.println(functionC(a));		
		System.out.println(functionD(a));
	}

}
