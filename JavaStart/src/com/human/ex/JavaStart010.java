package com.human.ex;

import java.util.Arrays;

public class JavaStart010 {

	public static void main(String[] args) {//배열
		System.out.println("문제1)----------------------------");
		int[] a=new int[3];
		int sum=0;
		int count=0;
		for(count=0;count<3;count++){
			a[count]=count+1;
		}
		for(count=0;count<3;count++){
			System.out.printf("a[%d]=%d%n",count,a[count]);
			sum=sum+a[count];
		}
		System.out.println("sum="+sum);

		System.out.println("문제2)----------------------------");
		int[] a1 = {1,2,3};
		for(int i=0;i<3;i++){
			a1[i]=a1[i]+2;

		}
		System.out.println(Arrays.toString(a1));

		System.out.println("문제3)----------------------------");
		int[] a2 = new int[10];
		int i3=3;
		for(int i=0;i<a2.length;i++){
			a2[i]=i3;
			i3=i3+3;
		}
		System.out.println(Arrays.toString(a2));

		System.out.println("문제4)----------------------------");
		int[] a3 = new int[100];
		for(int i=0;i<a3.length;i++){
			a3[i]=i+1;
			if(i%2==0){
				System.out.print(a3[i]+" ");
			}
		}

		System.out.println("문제5)----------------------------");
		int[] a4 = {12,1,5,3,6,8,5,3};
		int sum1 = 0;
		for(int i=0;i<a4.length;i++){
			sum1=sum1+a4[i];
		}
		System.out.println("sum="+sum1);

		System.out.println("문제6)----------------------------");
		int sum2=0;
		for(int i=0;i<a4.length;i++){
			if(a4[i]%2==0){
				sum2=sum2+a4[i];
			}
		}
		System.out.println("sum="+sum2);

		System.out.println("문제7)----------------------------");
		int most=a4[0];
		int least=a4[0];
		for(int i=0;i<a4.length;i++){
			if(a4[i]>most){
				most=a4[i];
			}
			if(a4[i]<least){
				least=a4[i];
			}
			
		}
		System.out.println("sum="+(most+least));

		
	}

}
