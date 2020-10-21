package com.human.ex;

import java.text.DecimalFormat;

public class JavaStart1019 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("1-----------------------------------");
		System.out.print("숫자 입력 : ");
		int in=Integer.parseInt(scanner.nextLine());
		int a=11;
		int b=14;
		if(in==0) {
			a=5;
		}else {
			b=a+3;
		}
		System.out.println("a, b :"+a+", "+b);
		
		System.out.println("2-----------------------------------");
        System.out.print("양수 5 or 음수 -5 입력 : ");
		int n=Integer.parseInt(scanner.nextLine());
		System.out.println(Math.abs(n));
		
		System.out.println("3-----------------------------------");
		System.out.print("숫자 입력 : ");
		int n3=Integer.parseInt(scanner.nextLine());
		if(n3%126==0) {
			System.out.println("126의 약수이다");
		}else {
			System.out.println("126의 약수가 아니다");
		}
		
		System.out.println("4-----------------------------------");
		System.out.print("국어점수 입력 : ");
		int score1=Integer.parseInt(scanner.nextLine());
		System.out.print("영어점수 입력 : ");
		int score2=Integer.parseInt(scanner.nextLine());
		System.out.print("수학점수 입력 : ");
		int score3=Integer.parseInt(scanner.nextLine());
		int avgScore=(score1+score2+score3)/3;
		if(avgScore>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("5-----------------------------------");
		System.out.print("숫자 입력 : ");
		int n4=Integer.parseInt(scanner.nextLine());
		if(n4>=5) {
			System.out.println(n4+15);
		}else {
			System.out.println(n4+5);
		}
		System.out.println("6-----------------------------------");
		boolean b1= 5!=3;//true
		boolean b2= 5==3;//false
		if(b1) {
			if(b2) {
				System.out.println("1번");
			}else {
				System.out.println("2번");
			}
		}else {
			System.out.println("3번");
			System.out.println("4번");
		}
		System.out.println("===========================================");
		System.out.println("1-----------------------------------");
		System.out.println("x>14 / x<=12 && x>22 / x>5 && x<=9");
		
		System.out.println("2-----------------------------------");
		System.out.println("x<=14 / x>12 && x<=22 / x<=5 && x>9");
		
		System.out.println("3-----------------------------------");
		System.out.print("숫자 입력 : ");
		int n5=Integer.parseInt(scanner.nextLine());
		if(n5 % 3 == 0 || n5 % 7==0) {
			System.out.println("3 또는 7의 배수");
		}if(n5%2==0||n5%5==0) {
			System.out.println("2 또는 5의 배수");
		}
		
		System.out.println("4-----------------------------------");
		System.out.print("x 입력 : ");
		int x1=Integer.parseInt(scanner.nextLine());
		System.out.print("y 입력 : ");
		int y1=Integer.parseInt(scanner.nextLine());
		if(x1==0 && y1==0) {
			System.out.println("원점에 있음");
		}else if(x1==0) {
			System.out.println("y축 위에 있음");
		}else if(y1==0) {
			System.out.println("x축 위에 있음");
		}else if(x1>0 && y1>0) {
			System.out.println("2번영역 위에 있음");
		}else if(x1>0 && y1<0){
			System.out.println("3번영역 위에 있음");
		}else if(x1<0 && y1>0){
			System.out.println("1번영역 위에 있음");
		}else if(x1<0 && y1<0){
			System.out.println("4번영역 위에 있음");
		}
		
		System.out.println("2-----------------------------------");
		System.out.print("나이 입력 : ");
		int age=Integer.parseInt(scanner.nextLine());
		System.out.print("카드인가?(true/false) : ");
		boolean isCard =Boolean.parseBoolean(scanner.nextLine());
		if(age<=15 && isCard==true) {
			System.out.println("1200원");
		}else if(age<=15 && isCard==false){
			System.out.println("1300원");
		}else if(age>15 && isCard==true) {
			System.out.println("1500원");
		}else {
			System.out.println("1600원");
		}
		System.out.println("===========================================");
		System.out.println("1-----------------------------------");
		System.out.print("숫자 입력 : ");
		int n1=Integer.parseInt(scanner.nextLine());
		int a3=5;int b3=7;
		if(n1==0) {
			a=a+2;
		}else if(n1==1){
			b=b+4;
		}else if(n1==2) {
			a=a+b;
		}else {
			b=b+5;
		}
		System.out.printf("a, b : %d, %d",a,b);
		
		System.out.println("2-----------------------------------");
		System.out.print("1. ");
		boolean breakfastRice=true;
		if(breakfastRice==true) {
			System.out.println("밥을 먹었음");
		}
		System.out.print("2. ");
		boolean breakfastBread=false;
		if(breakfastBread==true) {
			System.out.println("빵을 먹었음");
		}else {
			System.out.println("밥을 먹었음");
		}
		System.out.print("3. ");
		if(breakfastRice==true) {
			System.out.println("밥을 먹었음");
		}else {
			System.out.println("빵을 먹었음");
		}
		System.out.print("4. ");
		if(breakfastRice==true) {
			System.out.println("밥을 먹었음");
		}else {
			System.out.println("아무것도 먹지 않음");
		}
		System.out.print("5. ");
		boolean breakfastSoup=false;
		boolean breakfastMilk=false;
		if(breakfastRice==true) {
			System.out.println("밥을 먹었음");
		}else if(breakfastBread==true) {
			System.out.println("빵을 먹었음");
		}else if(breakfastSoup==true) {
			System.out.println("국을 먹었음");
		}else {
			System.out.println("우유를 먹었음");
		}
		System.out.print("6. ");
		boolean isRice=true;boolean isBread=false;
		boolean isSoup=true;boolean isIce=false;boolean isMilk=false;boolean isCoffee=false;
		if(isRice==true) {
			if(isSoup==true) {
				System.out.println("밥+국");
			}else {
				System.out.println("밥+아이스크림");
			}
		}else if(isBread==true) {
			if(isMilk==true) {
				System.out.println("빵+우유");
			}else {
				System.out.println("빵+커피");
			}
		}else {
			System.out.println("안먹음");
		}
		System.out.print("7. ");
		if(breakfastRice==true) {
			System.out.println("밥을 먹었음");
			System.err.println("국을 먹었음");
		}else {
			System.out.println("빵을 먹었음");
			System.out.println("우유를 먹었음");
		}
		System.out.print("8. ");
		boolean isSun=true;boolean isCloud=true;boolean isMoon=false;boolean isStar=false;
		if(isSun==true) {
			System.out.print("-해");
			if(isCloud==true) {
				System.out.println(", 구름");
			}else {
				System.out.println();
			}
		}else if(isCloud==true){
			System.out.println("-구름");
		}else if(isMoon==true) {
			System.out.print("-달");
			if(isStar==true) {
				System.out.println(", 별");
			}else {
				System.out.println();
			}
		}else if(isStar==true) {
			System.out.println("-별");
		}
		
		System.out.println("===========================================");
		System.out.print("3. ");
		int day1=(new java.util.Date()).getDay();
		switch (day1) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		default:
			break;
		}
		System.out.print("4. ");
		System.out.print("달 입력 : ");
		int month1=Integer.parseInt(scanner.nextLine());
		switch (month1) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("31일까지");
			break;
		case 2:
			System.out.println("28일까지");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("잘못된 달 입력");
			break;
		}
		System.out.print("5. ");
		System.out.print("사이즈 입력 : ");
		int size1=Integer.parseInt(scanner.nextLine());
		if(size1>=90 && size1<95) {
			System.out.println("S");
		}else if(size1>=95 && size1<100) {
			System.out.println("M");
		}else if(size1>=100 && size1<105) {
			System.out.println("L");
		}else if(size1>=105 && size1<120) {
			System.out.println("XL");
		}else if(size1>=120) {
			System.out.println("XXL");
		}else {
			System.out.println("잘못된 입력");		
		}
		System.out.print("6. ");
		System.out.print("java점수 입력 : ");
		int score4=Integer.parseInt(scanner.nextLine());
		System.out.print("html점수 입력 : ");
		int score5=Integer.parseInt(scanner.nextLine());
		System.out.print("db점수 입력 : ");
		int score6=Integer.parseInt(scanner.nextLine());
		int avg=(score4+score5+score6)/3;
		if(score4<=40) {
			System.out.printf("java 점수가 %d점이므로 과락%n",score4);
		}if(score5<=40) {
			System.out.printf("html 점수가 %d점이므로 과락%n",score5);
		}if(score6<=40) {
			System.out.printf("db 점수가 %d점이므로 과락%n",score6);
		}
		if(avg>=60) {
			System.out.println("합격(평균60점이상)");
		}else {
			System.out.println("불합격(평균60점미만)");
		}
		
		System.out.print("7. ");
		System.out.print("키 입력(cm) : ");
		double height=Double.parseDouble(scanner.nextLine());
		System.out.print("체중 입력(kg) : ");
		double weight=Double.parseDouble(scanner.nextLine());
		System.out.print("나이 입력 : ");
		int age1=Integer.parseInt(scanner.nextLine());
		double bmi=weight*100/((height-100)*0.9);
		
		switch (age1) {
		case 0:case 1:case 2:case 3:
		case 4:case 5:case 6:case 7:
			System.out.println("나이가 너무 어립니다(8살이상)");
			break;
		case 8:case 9:case 10:case 11:
		case 12:case 13:case 14:case 15:
		case 16:case 17:case 18:case 19:
			if(bmi<95) {//초 중 고등학생
				System.out.println("체중 미달");
			}else if(bmi>=95 && bmi<120) {
				System.out.println("정상");
			}else if(bmi>=120 && bmi<130) {
				System.out.println("경도비만");
			}else if(bmi>=130 && bmi<150) {
				System.out.println("중도비만");
			}else{
				System.out.println("고도비만");
			}
			break;
		default:
			if(bmi<100) {//성인
				System.out.println("체중 미달");
			}else if(bmi>=100 && bmi<110) {
				System.out.println("정상");
			}else if(bmi>=110 && bmi<120) {
				System.out.println("과체중");
			}else if(bmi>=120 && bmi<150) {
				System.out.println("비만");
			}else{			
				System.out.println("고도비만");
			}
			break;
		}
		
		System.out.println("===========================================");
		System.out.print("2. ");
		int a2=0;
		while(a2!=5){
			System.out.println("1:목/2:가슴/3:팔/4:허리/5:종료");
			System.out.print("알고 있는 사이즈 입력 : ");
			a2=Integer.parseInt(scanner.nextLine());
			switch (a2) {
				case 1:
					System.out.print("목둘레 입력(cm) : ");
					int s1=Integer.parseInt(scanner.nextLine());
					if (s1>=33 && s1<35) {
						System.out.println("S / 90~95");
					}else if(s1>=35 && s1<37) {
						System.out.println("M / 95~100");
					}else if(s1>=37 && s1<39) {
						System.out.println("L / 100~105");
					}else if(s1>=39 && s1<42) {
						System.out.println("XL / 105~110");
					}else if(s1>=42 && s1<45) {
						System.out.println("XXL / 110~");
					}else {
						System.out.println("잘못된 입력값");
					}
					break;
				case 2:
					System.out.print("가슴둘레 입력(cm) : ");
					int s2=Integer.parseInt(scanner.nextLine());
					if (s2>=86 && s2<91) {
						System.out.println("S / 90~95");
					}else if(s2>=91 && s2<102) {
						System.out.println("M / 95~100");
					}else if(s2>=102 && s2<112) {
						System.out.println("L / 100~105");
					}else if(s2>=112 && s2<122) {
						System.out.println("XL / 105~110");
					}else if(s2>=122 && s2<132) {
						System.out.println("XXL / 110~");
					}else {
						System.out.println("잘못된 입력값");
					}
					break;
				case 3:
					System.out.print("팔길이 입력(cm) : ");
					int s3=Integer.parseInt(scanner.nextLine());
					if (s3>=78 && s3<81) {
						System.out.println("S / 90~95");
					}else if(s3>=81 && s3<84) {
						System.out.println("M / 95~100");
					}else if(s3>=84 && s3<86) {
						System.out.println("L / 100~105");
					}else if(s3>=86 && s3<89) {
						System.out.println("XL / 105~110");
					}else if(s3>=89 && s3<91) {
						System.out.println("XXL / 110~");
					}else {
						System.out.println("잘못된 입력값");
					}
					break;
				case 4:
					System.out.print("허리둘레 입력(inch) : ");
					int s4=Integer.parseInt(scanner.nextLine());
					if (s4>=28 && s4<29) {
						System.out.println("S / 90~95");
					}else if(s4>=29 && s4<31) {
						System.out.println("M / 95~100");
					}else if(s4>=31 && s4<34) {
						System.out.println("L / 100~105");
					}else if(s4>=34 && s4<37) {
						System.out.println("XL / 105~110");
					}else if(s4>=37 && s4<40) {
						System.out.println("XXL / 110~");
					}else {
						System.out.println("잘못된 입력값");
					}
					break;
				case 5:
					break;
				default:
					System.out.println("---1-5 사이의 정수만 입력---");
					
			}
		}
		System.out.println("종료");
		
		System.out.println("===========================================");
		System.out.println("1-------------------------------------");
		int a4=0;
		while(a4!=5){
			System.out.print("첫번째 수 입력 : ");
			int num1=Integer.parseInt(scanner.nextLine());
			System.out.println("연산자 선택");
			System.out.println("1:+ 2:- 3:* 4:/ 5:종료");
			System.out.print("원하는 연산 입력 : ");
			a4=Integer.parseInt(scanner.nextLine());
			System.out.print("두번째 수 입력 : ");
			int num2=Integer.parseInt(scanner.nextLine());
			switch (a4) {
				case 1:
					System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
					break;
				case 2:
					System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
					break;
				case 3:
					System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
					break;
				case 4:
					System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
					break;
				case 5:
					break;
				default:
					System.out.println("잘못된 연산자 입력");
					
			}
		}
		System.out.println("종료");
		
		System.out.println("2-------------------------------------");
		int abc=(int) (Math.random()*3+1);
		int a5=0;
		System.out.println("1:주먹 2:가위 3:보자기 4:종료");
		System.out.print("무엇을 내시겠습니까? : ");
		a5=Integer.parseInt(scanner.nextLine());
		switch (a5) {
			case 1://주먹
				if(abc==1) {
					System.out.println("비겼습니다");
				}else if(abc==2) {
					System.out.printf("이겼습니다%n나-주먹,상대-가위%n");
				}else {
					System.out.printf("졌습니다%n나-주먹,상대-보자기%n");
				}
				break;
			case 2://가위
				if(abc==1) {
					System.out.printf("졌습니다%n나-가위,상대-주먹%n");
				}else if(abc==2) {
					System.out.println("비겼습니다");
				}else {
					System.out.printf("이겼습니다%n나-가위,상대-보자기%n");
				}
				break;
			case 3://보자기
				if(abc==1) {
					System.out.printf("이겼습니다%n나-보자기,상대-주먹%n");
				}else if(abc==2) {
					System.out.printf("졌습니다%n나-보자기,상대-가위%n");
				}else {
					System.out.println("비겼습니다");
				}
				break;
			case 4:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못된 숫자 입력");
				break;
		}
		
		
		System.out.println("3-------------------------------------");
		DecimalFormat three = new DecimalFormat("###,###");
		System.out.print("번 돈 입력(단위:원) : ");
		int money=Integer.parseInt(scanner.nextLine());
		int tax=0;
		if (money<=12000000) {
			tax+=money*0.06;
		}else if(money>12000000 && money<=46000000) {
			tax+=money*0.15+1080000;
		}else if(money>46000000 && money<=88000000) {
			tax+=money*0.24+5220000;
		}else if(money>88000000 && money<=150000000) {
			tax+=money*0.35+14900000;
		}else if(money>150000000 && money<=300000000) {
			tax+=money*0.38+19400000;
		}else if(money>300000000 && money<=500000000) {
			tax+=money*0.4+25400000;
		}else if(money>500000000) {
			tax+=money*0.42+35400000;
		}else {
			System.out.println("잘못된 입력입니다");
		}
		System.out.println("세금 = "+three.format(tax)+"원");
		
		
		
	}

}
