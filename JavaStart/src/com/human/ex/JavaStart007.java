package com.human.ex;

import java.util.Arrays;

public class JavaStart007 {

	public static void main(String[] args) {//반복문
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		System.out.println("문제1)----------------------------");
		for(int i=1;i<4;i++) {
			System.out.println(i);
		}
		
		System.out.println("문제2)----------------------------");
		int sum1_3=0;
		for(int i=0;i<3;i++) {
			sum1_3=sum1_3+1;
		}
		System.out.println(sum1_3);
		
		System.out.println("문제3)----------------------------");
		for(int i=3;i<11;i++) {
			System.out.println(i);
		}
		
		System.out.println("문제4)----------------------------");
		int sum1_10=0;
		for(int i=1;i<11;i++) {
			sum1_10=sum1_10+i;	
		}
		System.out.println(sum1_10);
		
		System.out.println("문제5)----------------------------");
		int sum15_30=0;
		for(int i=1;i<11;i++) {
			sum15_30=sum15_30+i;	
		}
		System.out.println(sum15_30);
		
		System.out.println("문제6)----------------------------");
		for(int i=1;i<51;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("문제7)----------------------------");
		for(int i=1;i<101;i++) {
			if(i%10==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("문제8)----------------------------");
		int sum30_300=0;
		for(int i=30;i<301;i++) {
			if(i%6==0) {
				sum30_300=sum30_300+i;
			}
		}
		System.out.println(sum30_300);
		
		System.out.println("문제9)----------------------------");
		System.out.print("숫자 입력 : ");
		int n=Integer.parseInt(scanner.nextLine());
		for(int i=1;i<n+1;i++) {
			System.out.println(i);
		}
		
		System.out.println("문제10)----------------------------");
		System.out.print("숫자1 입력 : ");
		int n1=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2(숫자1보다 큰 수) 입력 : ");
		int n2=Integer.parseInt(scanner.nextLine());
		for(int i=n1;i<n2+1;i++) {
			System.out.println(i);
		}
		
		System.out.println("문제11)----------------------------");
		System.out.print("숫자1 입력 : ");
		int n3=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2(숫자1보다 큰 수) 입력 : ");
		int n4=Integer.parseInt(scanner.nextLine());
		for(int i=n3;i<n4+1;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("문제12)----------------------------");
		int sum1=0;
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				sum1=sum1-i;
			}else {
				sum1=sum1+i;
			}
		}
		System.out.println(sum1);
		
		System.out.println("문제13)----------------------------");
		float sum2=0;
		for(float i=1;i<100;i++) {
			sum2=sum2+(i/(i+1));
		}
		System.out.println(sum2);
		
		System.out.println("문제14)----------------------------");
		int[] Fn = new int[10];
		for(int i=0;i<10;i++) {
			if(i==0) {
				
				Fn[i]=0;
			}else {
				if(i==1){
					Fn[i]=1;
					
				}else {
					Fn[i]=Fn[i-2]+Fn[i-1];
					
				}
			}
			System.out.println(Fn[i]);
		}
		System.out.println(Arrays.toString(Fn));
		
		System.out.println("문제15)----------------------------");
		System.out.print("색깔 입력(빨강/노랑/파랑) : ");
		String colorInput=scanner.nextLine();
		System.out.println(colorInput);
		while(!colorInput.equals("빨강") && !colorInput.equals("노랑") && !colorInput.equals("파랑")) {
			System.out.print("색깔 다시 입력(빨강/노랑/파랑) : ");
			colorInput=scanner.nextLine();
		}
		System.out.print("밝기 입력(0~100) : ");
		int brightnessInput=Integer.parseInt(scanner.nextLine());
		while(brightnessInput>100 || brightnessInput<0) {
			System.out.print("밝기 다시 입력(0~100) : ");
			brightnessInput=Integer.parseInt(scanner.nextLine());
		}
		System.out.printf("현재 색상은 %s, 밝기는 %d 이다",colorInput,brightnessInput);
		
		
		
		
	}

}
