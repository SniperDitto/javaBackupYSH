package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStart1021 {

	public static void main(String[] args) {
		/*
		 * 자료구조 - 정렬 배열, 리스트, 스택, 큐, 트리, (그래프), 네트워크, 채팅(쓰레드) 
		 * git에 배운 것들 정리 
		 * html, css, javascript, jquery -웹 
		 * +java, jsp, spring, spring boot
		 * bootstrap, vue, angular, react -GUI
		 * oracle, ms sql, sqlite, mysql, mongo(객체지향db) -db
		 * c#, asp .net / c, php -서버
		 * nodejs
		 */
		java.util.Scanner scanner =new java.util.Scanner(System.in);
//		for(int i=0;i<10;i++) {
//			
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		for(;;) {
//			System.out.print("숫자 입력1 (1004를 입력하여 반복 중지): ");
//			int num = Integer.parseInt(scanner.nextLine());
//			if(num==1004) {
//				break;
//			}
//		}
//		System.out.println("종료");
//		while(true) {
//			System.out.print("숫자 입력2 (1004를 입력하여 반복 중지): ");
//			int num = Integer.parseInt(scanner.nextLine());
//			if(num==1004) {
//				break;
//			}
//		}
//		System.out.println("종료");
//-----------------------------------------------------------------------------------------		
//		System.out.println("1-------------------------------");
//		int a=2;
//		int b=1;
//		b++;
//		System.out.printf("1: a, b = %d, %d%n",a,b);
//		while(b<15) {
//			a++;
//			b=b+a;
//		}
//		System.out.printf("while : a, b = %d, %d%n",a,b);
//		int a1=2;
//		int b1=1;
//		b1++;
//		for(;;) {
//			if(b1>=15) {
//				break;
//			}
//			a1++;
//			b1=b1+a1;
//		}
//		System.out.printf("for : a, b = %d, %d%n",a1,b1);
//		
//		System.out.println("2-------------------------------");
//		System.out.print("100의 약수 : ");
//		for(int i=1;i<=100;i++) {
//			if(100%i==0) {
//				System.out.print(i+" ");
//			}
//		}
//		System.out.println();
//				
//		System.out.println("3-------------------------------");
//		System.out.print("숫자1 입력: ");
//		int num1 = Integer.parseInt(scanner.nextLine());
//		System.out.print("숫자2 입력: ");
//		int num2 = Integer.parseInt(scanner.nextLine());
//		int i1=-1;int i2=-2;int index=0;int[] gcd;
//		System.out.print("두 수의 공약수 : ");
//		if(num1>num2) {
//			gcd = new int[num1];
//			for(int i=1;i<=num1;i++) {
//				if(num1%i==0) {
//					//System.out.print(i+" ");
//					i1=i;
//				}else {
//					i1=-1;
//				}
//				if(num2%i==0) {
//					//System.out.print(i+" ");
//					i2=i;
//				}else {
//					i1=-2;
//				}
//				if(i1==i2) {
//					System.out.print(i+" ");
//					gcd[index]=i;
//					index++;
//				}
//			}
//		}else {
//			gcd = new int[num2];
//			for(int i=1;i<=num2;i++) {
//				if(num1%i==0) {
//					//System.out.print(i+" ");
//					i1=i;
//				}else {
//					i1=-1;
//				}
//				if(num2%i==0) {
//					//System.out.print(i+" ");
//					i2=i;
//				}else {
//					i1=-2;
//				}
//				if(i1==i2) {
//					System.out.print(i+" ");
//					gcd[index]=i;
//					index++;
//				}
//			}
//		}
//		System.out.println();
//		
//		System.out.println("4-------------------------------");
//		System.out.print("숫자1 입력: ");
//		int num3 = Integer.parseInt(scanner.nextLine());
//		System.out.print("숫자2 입력: ");
//		int num4 = Integer.parseInt(scanner.nextLine());
//		int i3=-1;int i4=-2;int index1=0;int[] gcd1;
//		System.out.print("두 수의 최대공약수 : ");
//		if(num3>num4) {
//			gcd1 = new int[num3];
//			for(int i=1;i<=num3;i++) {
//				if(num3%i==0) {
//					i3=i;
//				}else {
//					i3=-1;
//				}
//				if(num4%i==0) {
//					i4=i;
//				}else {
//					i4=-2;
//				}
//				if(i3==i4) {
//					gcd1[index1]=i;
//					index++;
//				}
//			}
//		}else {
//			gcd1 = new int[num4];
//			for(int i=1;i<=num4;i++) {
//				if(num3%i==0) {
//					i3=i;
//				}else {
//					i3=-1;
//				}
//				if(num4%i==0) {
//					i4=i;
//				}else {
//					i4=-2;
//				}
//				if(i3==i4) {
//					gcd1[index1]=i;
//					index1++;
//				}
//			}
//		}
//		System.out.print(gcd1[index1-1]);
//		System.out.println();
//		
//		System.out.println("5-------------------------------");
//		int sum1=0;
//		while(sum1<=100) {
//			System.out.print("더할 숫자 입력: ");
//			int n = Integer.parseInt(scanner.nextLine());
//			sum1+=n;
//			if(sum1>100){
//				System.out.println(sum1);
//			}
//		}
//		
//		System.out.println("6-------------------------------");
//		int countO=0;int countX=0; int sumO=0;
//		while(true) {
//			System.out.print("숫자 입력(1~10): ");
//			int n1 = Integer.parseInt(scanner.nextLine());
//			if(n1>0 && n1<=10) {
//				countO++;
//				sumO+=n1;
//			}else {
//				countX++;
//			}
//			if(countO==3) {
//				break;
//			}
//		}
//		System.out.printf("잘못입력한횟수 : %d%n맞게입력한횟수 : %d 합 : %d%n",countX,countO,sumO);
//		
//		System.out.println("7-------------------------------");
//		System.out.print("숫자1 입력: ");
//		int num5 = Integer.parseInt(scanner.nextLine());
//		System.out.print("숫자2 입력: ");
//		int num6 = Integer.parseInt(scanner.nextLine());
//		int numL;int lcm=0;int[] gcd2;
//		int i5=-1;int i6=-2;int index2=0;
//		if(num5>num6) {
//			numL=num5;
//		}else {
//			numL=num6;
//		}
//		gcd2=new int[numL];
//		for(int i=1;i<=numL;i++) {
//			if(num5%i==0) {
//				i5=i;
//			}else {
//				i5=-1;
//			}
//			if(num6%i==0) {
//				i6=i;
//			}else {
//				i6=-2;
//			}
//			if(i5==i6) {
//				gcd2[index2]=i;
//				index2++;
//			}
//		}
//		lcm=((num5*num6)/gcd2[index2-1]);
//		System.out.println("최소공배수 : "+lcm);
//
//		System.out.println("8-------------------------------");
//		System.out.print("숫자1 입력: ");
//		int numA = Integer.parseInt(scanner.nextLine());
//		System.out.print("숫자2 입력: ");
//		int numB = Integer.parseInt(scanner.nextLine());
//		System.out.print("숫자3 입력: ");
//		int numC = Integer.parseInt(scanner.nextLine());
//		int lar=numA;int sm=numA;
//		if(lar<numA) {
//			lar=numA;
//		}if(lar<numB) {
//			lar=numB;
//		}if(lar<numC){
//			lar=numC;
//		}
//		if(sm>numA) {
//			sm=numA;
//		}if(sm>numB) {
//			sm=numB;
//		}if(sm>numC){
//			sm=numC;
//		}
//		System.out.printf("가장 큰 수 : %d, 가장 작은 수 : %d%n",lar,sm);
//		
//		System.out.println("9-------------------------------");
//		int fail=0;
//		for(int i=1;i<6;i++) {
//			System.out.print("점수 입력: ");
//			int score1 = Integer.parseInt(scanner.nextLine());
//			if (score1<=60) {
//				fail++;
//			}
//		}
//		System.out.println(fail+"명 탈락");
//		
//		System.out.println("10-------------------------------");
//		int ind=0;
//		int sum2=0;
//		for(;;) {
//			ind++;
//			sum2+=ind;
//			System.out.printf("%d : %d%n",ind,sum2);
//			if (sum2>100) {
//				break;
//			}
//		}
//		
//		System.out.println("11-------------------------------");
//		System.out.print("문자열 입력: ");
//		String text1 = scanner.nextLine();
//		System.out.print("반복횟수 입력: ");
//		int t = Integer.parseInt(scanner.nextLine());		
//		for(int i=0;i<t;i++) {
//			System.out.println(text1);
//		}
//		
//		System.out.println("12-------------------------------");
//		System.out.print("숫자1 입력: ");
//		int numa = Integer.parseInt(scanner.nextLine());
//		System.out.print("숫자2 입력: ");
//		int numb = Integer.parseInt(scanner.nextLine());
//		int NUMa;int NUMb;int sumA=0;
//		if(numa>numb) {
//			NUMa=numa;
//			NUMb=numb;
//		}else {
//			NUMa=numb;
//			NUMb=numa;
//		}
//		for(int i=NUMb;i<=NUMa;i++) {
//			sumA+=i;
//		}
//		System.out.println(sumA);
//		
//		System.out.println("13-------------------------------");
//		System.out.print("소수 판별할 수 입력: ");
//		int A = Integer.parseInt(scanner.nextLine());
//		boolean isNUM=true;
//		for(int i=2;i<A;i++) {
//			if(A%i==0) {
//				isNUM=false;
//			}
//		}
//		if(isNUM==true) {
//			System.out.println("소수이다");
//		}else {
//			System.out.println("소수가 아니다");
//		}
//		
//		System.out.println("14-------------------------------");
//		System.out.print("시작할 숫자 입력: ");
//		int numStart = Integer.parseInt(scanner.nextLine());
//		System.out.print("이후 몇개까지 출력할것인지 입력 : ");
//		int numS = Integer.parseInt(scanner.nextLine());
//		for(int i=numStart;i<=(numStart+numS);i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("15-------------------------------");
//		System.out.print("출력할 단 입력: ");
//		int dan = Integer.parseInt(scanner.nextLine());
//		System.out.println(dan+"단");
//		for(int i=1;i<=9;i++) {
//			System.out.printf("%d x %d = %d%n",dan,i,dan*i);
//		}
//		
//		System.out.println("16-------------------------------");
//		System.out.print("숫자 입력: ");
//		int nn = Integer.parseInt(scanner.nextLine());
//		int cnt=0;
//		for(int i=1;i<=1000;i++) {
//			if(i%nn==0) {
//				cnt++;
//			}
//		}
//		System.out.println("1~1000사이에 "+cnt+"개의 배수 존재");
//		
//		System.out.println("17-------------------------------");
//		System.out.print("행 입력: ");
//		int col = Integer.parseInt(scanner.nextLine());
//		System.out.print("열 입력 : ");
//		int row = Integer.parseInt(scanner.nextLine());
//		int cntnum=1;
//		for (int i=0;i<col;i++) {
//			for(int j=0;j<row;j++) {
//				System.out.print(cntnum+" ");
//				cntnum++;
//			}
//			System.out.println();
//		}
//		
		System.out.println("18-------------------------------");
		int cntnum1=1;
		int cntnum2=10;
		int cntnum3=21;
		for(int j=0;j<5;j++) {
			System.out.print(cntnum1+"\t");
			cntnum1++;
		}
		System.out.println();
		for(int j=0;j<5;j++) {
			System.out.print(cntnum2+"\t");
			cntnum2--;
		}
		System.out.println();
		cntnum2=10;
		for(int j=0;j<5;j++) {
			System.out.print(cntnum2+1+"\t");
			cntnum2++;
		}
		System.out.println();
		for(int j=0;j<5;j++) {
			System.out.print(cntnum3+"\t");
			cntnum3++;
		}
		System.out.println();

		
		
		
		
		
		
		
		
		
	}

}
