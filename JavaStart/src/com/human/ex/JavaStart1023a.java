package com.human.ex;

import java.util.Arrays;

import com.human.dto.Human;

public class JavaStart1023a {
	public static int sum(int a, int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	public static int min(int a, int b) {
		int min=0;
		min=a-b;
		return min;
	}
	public static int mul(int a, int b) {
		int mul=0;
		mul=a*b;
		return mul;
	}
	public static int div(int a, int b) {
		int div=0;
		div=a/b;
		return div;
	}
	
	
	
	public static void main(String[] args) {
		
//		int a[]= {0,1,2,3};
//		int b[];
//		b=a;
//		//b[1]=10;
//		//System.out.println(a[1]);//a와 b가 연동되어 10이 된다
//		
//		int c[];
//		c=a.clone();
//		c[1]=10;
//		System.out.println("a:"+Arrays.toString(a));
//		System.out.println("c:"+Arrays.toString(c));
//		
//		int d[]=new int[a.length];
//		for(int i=0;i<a.length;i++) {
//			d[i]=a[i];
//		}
//		d[1]=20;
//		System.out.println("d:"+Arrays.toString(d));
		
//		Human arr1[]=new Human[2];
//		arr1[0]=new Human("홍길동",10,155.5);
//		arr1[1]=new Human("홍길남",10,155.5);
//		
//		Human arr2[]=arr1;
//		Human arr3[]=new Human[2];
//
//		for(int i=0;i<arr3.length;i++) {
//			arr3[i]=new Human();
//			arr3[i].name=arr1[i].name;
//			arr3[i].age=arr1[i].age;
//			arr3[i].height=arr1[i].height;
//		}
//		
//		arr1[1].age=20;
//		System.out.println("arr1:"+Arrays.toString(arr1));
//		System.out.println("arr2:"+Arrays.toString(arr2));
//		System.out.println("arr3:"+Arrays.toString(arr3));
		int a=1;int b=2;
		System.out.println(sum(a,b)+" "+min(a, b)+" "+mul(a, b)+" "+div(a, b));
		
		
		
		
		
		

	}

}
