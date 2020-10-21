package com.human.ex;

public class JavaStart009 {

	public static void main(String[] args) {//거스름돈, 자판기
		java.util.Scanner scanner =new java.util.Scanner(System.in);
		// System.out.println("금액 입력(10원 단위까지) : ");
		// int money=Integer.parseInt(scanner.nextLine());
		// while(money%10!=0) {
		// 	System.out.println("잘못된 입력입니다");
		// 	System.out.println("금액 입력(10원 단위까지) : ");
		// 	money=Integer.parseInt(scanner.nextLine());
		// }
		// int change1000=money/1000;
		// int change500=(money%1000)/500;
		// int change100=(money%500)/100;
		// int change50=(money%100)/50;
		// int change10=(money%50)/10;
		// System.out.printf("천원짜리 %d개, 500원짜리 %d개, 100원짜리 %d개%n50원짜리 %d개, 10원짜리 %d개%n",change1000,change500,change100,change50,change10);
		
		int moneyTotal=0;
		System.out.printf("현재 잔액 : %d원%n1:사이다(700)/2:콜라(500)/3:환타(350)/4:투입/5:반환%n원하는 메뉴를 입력하세요 : ",moneyTotal);
		int inputString=Integer.parseInt(scanner.nextLine());
		while(inputString!=5) {
			if(inputString==1) {
				if ((moneyTotal-700)<0){
					System.out.println("잔액이 부족합니다");
				}else{
					moneyTotal=moneyTotal-700;
				}
			}else if(inputString==2) {
				if ((moneyTotal-500)<0){
					System.out.println("잔액이 부족합니다");
				}else{
					moneyTotal=moneyTotal-500;
				}
			}else if(inputString==3) {
				if ((moneyTotal-350)<0){
					System.out.println("잔액이 부족합니다");
				}else{
					moneyTotal=moneyTotal-350;
				}
			}else if(inputString==4) {
				System.out.println("금액 넣기(10원 단위까지) : ");
				int moneyInput=Integer.parseInt(scanner.nextLine());
				moneyTotal=moneyTotal+moneyInput;
			}else {
				System.out.println("잘못된 메뉴입니다");
			}
			System.out.printf("%n현재 잔액 : %d원%n1:사이다(700)/2:콜라(500)/3:환타(350)/4:투입/5:반환%n원하는 메뉴를 입력하세요 : ",moneyTotal);
			inputString=Integer.parseInt(scanner.nextLine());
		}
		int Change1000=moneyTotal/1000;
		int Change500=(moneyTotal%1000)/500;
		int Change100=(moneyTotal%500)/100;
		int Change50=(moneyTotal%100)/50;
		int Change10=(moneyTotal%50)/10;
		System.out.printf("천원짜리 %d개, 500원짜리 %d개, 100원짜리 %d개%n50원짜리 %d개, 10원짜리 %d개 반환%n",Change1000,Change500,Change100,Change50,Change10);
		
		
		
	}

}
