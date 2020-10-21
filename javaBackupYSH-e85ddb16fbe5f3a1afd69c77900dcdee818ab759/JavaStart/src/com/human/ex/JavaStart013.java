package com.human.ex;

public class JavaStart013 {

	public static void main(String[] args) {//입력받기
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("int 문제1-------------------------------");
		System.out.print("이름 입력 : ");
        String n1=scanner.nextLine();
		System.out.print("나이 입력 : ");
		int n2=Integer.parseInt(scanner.nextLine());
		System.out.print("키 입력 : ");
        double n3=Double.parseDouble(scanner.nextLine());
		System.out.printf("당신의 이름은 %s입니다.%n당신의 나이는 %d입니다.%n당신의 키는 %.2f입니다.%n",n1,n2,n3);

		System.out.println("문제2-------------------------------");
		System.out.print("숫자1 입력 : ");
		double n4=Double.parseDouble(scanner.nextLine());
		System.out.print("숫자2 입력 : ");
		double n5=Double.parseDouble(scanner.nextLine());
		System.out.println(n4-n5);
		
		System.out.println("문제3-------------------------------");
		System.out.print("국어점수 입력 : ");
		double KrScore=Double.parseDouble(scanner.nextLine());
		System.out.print("영어점수 입력 : ");
		double EnScore=Double.parseDouble(scanner.nextLine());
		System.out.print("수학점수 입력 : ");
		double MtScore=Double.parseDouble(scanner.nextLine());
		double avg=(KrScore+EnScore+MtScore)/3;
		System.out.printf("국어:%.1f 영어:%.1f 수학:%.1f 평균:%.2f%n",KrScore,EnScore,MtScore,avg);

		System.out.println("문제4-------------------------------");
		System.out.print("키(m) 입력 : ");
		double heightM=Double.parseDouble(scanner.nextLine());
		double heightCM=heightM*100;
		System.out.println(heightCM+"cm");

		System.out.println("문제5-------------------------------");
		System.out.print("가로 입력 : ");
		double n6=Double.parseDouble(scanner.nextLine());
		System.out.print("세로 입력 : ");
		double n7=Double.parseDouble(scanner.nextLine());
		System.out.print("높이 입력 : ");
		double n8=Double.parseDouble(scanner.nextLine());
		double Vol=n6*n7*n8;
		System.out.println("부피 : "+Vol);

		System.out.println("문제6-------------------------------");
		System.out.print("박스 수 입력 : ");
		double box=Double.parseDouble(scanner.nextLine());
		System.out.print("연필낱개수 입력 : ");
		double pencil=Double.parseDouble(scanner.nextLine());
		System.out.printf("%.1f박스, %.1f개 -> %.1f원%n",box,pencil,12000*box+1000*pencil);

		System.out.println("string 문제1-------------------------------");
		System.out.print("숫자1 입력 : ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력 : ");
		int num2=Integer.parseInt(scanner.nextLine());
		System.out.printf("몫은 %d이고 나머지는 %d이다.%n",num1/num2,num1%num2);

		System.out.println("문제2-------------------------------");
		System.out.print("x 입력 : ");
		int x=Integer.parseInt(scanner.nextLine());
		System.out.println(x*x*x+2*x*x+5);

		System.out.println("문제3-------------------------------");
		System.out.print("3자리 정수 입력 : ");
		int num3=Integer.parseInt(scanner.nextLine());
		System.out.printf("백의 자리 : %d, 십의 자리 : %d, 일의 자리 : %d%n",num3/100,(num3%100)/10,num3%10);

		System.out.println("문제4-------------------------------");
		System.out.print("첫번째 점의 x좌표 입력(x,y) : ");
		int point1x=Integer.parseInt(scanner.nextLine());
		System.out.print("첫번째 점의 y좌표 입력(x,y) : ");
		int point1y=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 점의 x좌표 입력(x,y) : ");
		int point2x=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 점의 y좌표 입력(x,y) : ");
		int point2y=Integer.parseInt(scanner.nextLine());
		System.out.println("거리 : "+Math.sqrt((point1x-point2x)^2+(point1y-point2y)^2));





		
	}

}
