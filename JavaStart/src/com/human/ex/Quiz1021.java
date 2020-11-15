package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1021 {

	public static void main(String[] args) {
		java.util.Scanner scanner =new java.util.Scanner(System.in);
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
		System.out.println("1-------------------------------");
		int a=2;
		int b=1;
		b++;
		System.out.printf("1: a, b = %d, %d%n",a,b);
		while(b<15) {
			a++;
			b=b+a;
		}
		System.out.printf("while : a, b = %d, %d%n",a,b);
		int a1=2;
		int b1=1;
		b1++;
		for(;;) {
			if(b1>=15) {
				break;
			}
			a1++;
			b1=b1+a1;
		}
		System.out.printf("for : a, b = %d, %d%n",a1,b1);
		
		System.out.println("2-------------------------------");
		System.out.print("100의 약수 : ");
		for(int i=1;i<=100;i++) {
			if(100%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
				
		System.out.println("3-------------------------------");
		System.out.print("숫자1 입력: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력: ");
		int num2 = Integer.parseInt(scanner.nextLine());
		int i1=-1;int i2=-2;int index=0;int[] gcd;
		System.out.print("두 수의 공약수 : ");
		if(num1>num2) {
			gcd = new int[num1];
			for(int i=1;i<=num1;i++) {
				if(num1%i==0) {
					//System.out.print(i+" ");
					i1=i;
				}else {
					i1=-1;
				}
				if(num2%i==0) {
					//System.out.print(i+" ");
					i2=i;
				}else {
					i1=-2;
				}
				if(i1==i2) {
					System.out.print(i+" ");
					gcd[index]=i;
					index++;
				}
			}
		}else {
			gcd = new int[num2];
			for(int i=1;i<=num2;i++) {
				if(num1%i==0) {
					//System.out.print(i+" ");
					i1=i;
				}else {
					i1=-1;
				}
				if(num2%i==0) {
					//System.out.print(i+" ");
					i2=i;
				}else {
					i1=-2;
				}
				if(i1==i2) {
					System.out.print(i+" ");
					gcd[index]=i;
					index++;
				}
			}
		}
		System.out.println();
		
		System.out.println("4-------------------------------");
		System.out.print("숫자1 입력: ");
		int num3 = Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력: ");
		int num4 = Integer.parseInt(scanner.nextLine());
		int i3=-1;int i4=-2;int index1=0;int[] gcd1;
		System.out.print("두 수의 최대공약수 : ");
		if(num3>num4) {
			gcd1 = new int[num3];
			for(int i=1;i<=num3;i++) {
				if(num3%i==0) {
					i3=i;
				}else {
					i3=-1;
				}
				if(num4%i==0) {
					i4=i;
				}else {
					i4=-2;
				}
				if(i3==i4) {
					gcd1[index1]=i;
					index1++;
				}
			}
		}else {
			gcd1 = new int[num4];
			for(int i=1;i<=num4;i++) {
				if(num3%i==0) {
					i3=i;
				}else {
					i3=-1;
				}
				if(num4%i==0) {
					i4=i;
				}else {
					i4=-2;
				}
				if(i3==i4) {
					gcd1[index1]=i;
					index1++;
				}
			}
		}
		System.out.print(gcd1[index1-1]);
		System.out.println();
		
		System.out.println("5-------------------------------");
		int sum1=0;
		while(sum1<=100) {
			System.out.print("더할 숫자 입력: ");
			int n = Integer.parseInt(scanner.nextLine());
			sum1+=n;
			if(sum1>100){
				System.out.println(sum1);
			}
		}
		
		System.out.println("6-------------------------------");
		int countO=0;int countX=0; int sumO=0;
		while(true) {
			System.out.print("숫자 입력(1~10): ");
			int n1 = Integer.parseInt(scanner.nextLine());
			if(n1>0 && n1<=10) {
				countO++;
				sumO+=n1;
			}else {
				countX++;
			}
			if(countO==3) {
				break;
			}
		}
		System.out.printf("잘못입력한횟수 : %d%n맞게입력한횟수 : %d%n합 : %d%n",countX,countO,sumO);
		
		System.out.println("7-------------------------------");
		System.out.print("숫자1 입력: ");
		int num5 = Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력: ");
		int num6 = Integer.parseInt(scanner.nextLine());
		int numL;int lcm=0;int[] gcd2;
		int i5=-1;int i6=-2;int index2=0;
		if(num5>num6) {
			numL=num5;
		}else {
			numL=num6;
		}
		gcd2=new int[numL];
		for(int i=1;i<=numL;i++) {
			if(num5%i==0) {
				i5=i;
			}else {
				i5=-1;
			}
			if(num6%i==0) {
				i6=i;
			}else {
				i6=-2;
			}
			if(i5==i6) {
				gcd2[index2]=i;
				index2++;
			}
		}
		lcm=((num5*num6)/gcd2[index2-1]);
		System.out.println("최소공배수 : "+lcm);

		System.out.println("8-------------------------------");
		System.out.print("숫자1 입력: ");
		int numA = Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력: ");
		int numB = Integer.parseInt(scanner.nextLine());
		System.out.print("숫자3 입력: ");
		int numC = Integer.parseInt(scanner.nextLine());
		int lar=numA;int sm=numA;
		if(lar<numA) {
			lar=numA;
		}if(lar<numB) {
			lar=numB;
		}if(lar<numC){
			lar=numC;
		}
		if(sm>numA) {
			sm=numA;
		}if(sm>numB) {
			sm=numB;
		}if(sm>numC){
			sm=numC;
		}
		System.out.printf("가장 큰 수 : %d, 가장 작은 수 : %d%n",lar,sm);
		
		System.out.println("9-------------------------------");
		int fail=0;
		for(int i=1;i<6;i++) {
			System.out.print("점수 입력: ");
			int score1 = Integer.parseInt(scanner.nextLine());
			if (score1<=60 && score1>=0) {
				fail++;
			}else if(score1>100 || score1<0){
				System.out.println("잘못된 점수");
			}
		}
		System.out.println(fail+"명 탈락");
		
		System.out.println("10-------------------------------");
		int ind=0;
		int sum2=0;
		for(;;) {
			ind++;
			sum2+=ind;
			System.out.printf("%d : %d%n",ind,sum2);
			if (sum2>100) {
				break;
			}
		}
		
		System.out.println("11-------------------------------");
		System.out.print("문자열 입력: ");
		String text1 = scanner.nextLine();
		System.out.print("반복횟수 입력: ");
		int t = Integer.parseInt(scanner.nextLine());		
		for(int i=0;i<t;i++) {
			System.out.println(text1);
		}
		
		System.out.println("12-------------------------------");
		System.out.print("숫자1 입력: ");
		int numa = Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력: ");
		int numb = Integer.parseInt(scanner.nextLine());
		int NUMa;int NUMb;int sumA=0;
		if(numa>numb) {
			NUMa=numa;
			NUMb=numb;
		}else {
			NUMa=numb;
			NUMb=numa;
		}
		for(int i=NUMb+1;i<NUMa;i++) {
			sumA+=i;
		}
		System.out.println(sumA);
		
		System.out.println("13-------------------------------");
		System.out.print("소수 판별할 수 입력: ");
		int A = Integer.parseInt(scanner.nextLine());
		boolean isNUM=true;
		for(int i=2;i<A;i++) {
			if(A%i==0) {
				isNUM=false;
			}
		}
		if(isNUM==true) {
			System.out.println("소수이다");
		}else {
			System.out.println("소수가 아니다");
		}
		
		System.out.println("14-------------------------------");
		System.out.print("시작할 숫자 입력: ");
		int numStart = Integer.parseInt(scanner.nextLine());
		System.out.print("이후 몇개까지 출력할것인지 입력 : ");
		int numS = Integer.parseInt(scanner.nextLine());
		for(int i=numStart;i<=(numStart+numS);i++) {
			System.out.println(i);
		}
		
		System.out.println("15-------------------------------");
		System.out.print("출력할 단 입력: ");
		int dan = Integer.parseInt(scanner.nextLine());
		System.out.println(dan+"단");
		for(int i=1;i<=9;i++) {
			System.out.printf("%d x %d = %d%n",dan,i,dan*i);
		}
		
		System.out.println("16-------------------------------");
		System.out.print("숫자 입력: ");
		int nn = Integer.parseInt(scanner.nextLine());
		int cnt=0;
		for(int i=1;i<=1000;i++) {
			if(i%nn==0) {
				cnt++;
			}
		}
		System.out.println("1~1000사이에 "+cnt+"개의 배수 존재");
		
		System.out.println("17-------------------------------");
		System.out.print("행 입력: ");
		int col = Integer.parseInt(scanner.nextLine());
		System.out.print("열 입력 : ");
		int row = Integer.parseInt(scanner.nextLine());
		int cntnum=1;
		for (int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if (cntnum<=100) {
					System.out.print(cntnum + "\t");
					cntnum++;
				}else {
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("18-------------------------------");
		int lineC=0;
		int numOut=1;
		int temp=0;
		while(numOut<=25) {
			if(lineC%2==0) {
				for(int j=0;j<5;j++) {
					System.out.print(numOut+"\t");
					numOut++;
				}
				temp=numOut-1;
			}else {
				for(int j=5;j>0;j--) {
					System.out.print(temp+j+"\t");
					numOut++;
				}
			}
			lineC++;
			System.out.println();
		}


		System.out.println("19-------------------------------");
		System.out.print("시작 요일 입력(0~6까지 각 일~토요일): ");
		int dayStart = Integer.parseInt(scanner.nextLine());
		System.out.print("일수 입력 : ");
		int days = Integer.parseInt(scanner.nextLine());
		int weeks;int date=1;
		if (dayStart>=5 && days>=30) {//몇주까지있는가
			weeks=6;
		}else {
			weeks=5;
		}
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		for(int i=0;i<weeks;i++) {
			if(i==0) {//첫째줄
				for(int j=0;j<7;j++) {
					if(j>=dayStart) {
						System.out.print(date+"\t");
						date++;
					}else {
						System.out.print(" \t");
					}
				}
				System.out.println();
			}else {//둘째줄이하
				for(int j=0;j<7;j++) {
					if(date>days) {
						break;
					}
					System.out.print(date+"\t");
					date++;
				}
				System.out.println();
			}
		}

		System.out.println("20-------------------------------");
		int numCorrect=0;
		for (int i=0; i<5; i++) {
			int flipCoin = (int) (Math.random() * 2 + 1);
			System.out.println("1:앞면 2:뒷면");
			System.out.print("무엇을 내시겠습니까? : ");
			int guess = Integer.parseInt(scanner.nextLine());
			boolean isCorrect = flipCoin == guess;
			if (isCorrect == true) {
				System.out.println("맞았습니다");
				numCorrect++;
			} else {
				System.out.println("틀렸습니다");
			} 
		}
		System.out.println("맞은 횟수 : "+numCorrect);
		
		System.out.println("21-------------------------------");
		int numCorrect2=0;
		for (int i=0; i<5; i++) {
			int dice = (int) (Math.random() * 6 + 1);
			System.out.println("주사위 눈을 맞춰보세요");
			System.out.print("무엇을 내시겠습니까?(1~6) : ");
			int guess1 = Integer.parseInt(scanner.nextLine());
			boolean isCorrect2 = dice == guess1;
			if (isCorrect2 == true) {
				System.out.println("맞았습니다");
				numCorrect2++;
			} else {
				System.out.println("틀렸습니다");
			} 
		}
		System.out.println("맞은 횟수 : "+numCorrect2);
		
		
		
		
		
	}

}
