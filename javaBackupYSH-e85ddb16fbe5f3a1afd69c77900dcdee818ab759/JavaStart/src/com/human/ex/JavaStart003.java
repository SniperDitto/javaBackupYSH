package com.human.ex;

import java.util.Scanner;

public class JavaStart003 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int account=0;
		int input=123;
		while(input!=4){
			System.out.println("현재금액 : "+account);
			System.out.println("1.입금 2.출금 3.조회 4.종료");
			input=Integer.parseInt(scanner.nextLine());
			if(input==1){
				System.out.print("입금할 금액 : ");
				int newaccount=account+Integer.parseInt(scanner.nextLine());
				if(newaccount>1000){
					System.out.println("더이상 입금할 수 없습니다");
				}else{
					account=newaccount;
				}
			}else{
				if(input==2){
					System.out.print("출금할 금액 : ");
					int newaccount=account-Integer.parseInt(scanner.nextLine());
					if(newaccount<0){
						System.out.println("더이상 출금할 수 없습니다");
					}else{
						account=newaccount;
					}
				}else{
					if(input==3){
						System.out.println("현재금액 : "+account);
					}else{

					}
				}
			}
		


		}
		
		System.out.println("프로그램 종료");

	}

}
