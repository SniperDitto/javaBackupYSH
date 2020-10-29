package com.human.ex;

public class JavaStart002 {//은행 + 메소드 + 배열

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("사용자의 수 입력 : ");
		int userNum=Integer.parseInt(scanner.nextLine());
		int account[]=new int[userNum];
		int menu=123;
		for(;;) {
			System.out.println("1.입금 2.출금 3.조회 4.종료");
			menu=Integer.parseInt(scanner.nextLine());
			if(menu==4) {
				break;
			}
			System.out.printf("사용자 번호 입력(1~%d) : ",userNum);
			int user=Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				deposit(account,user);
				break;
			case 2:
				withdrawl(account,user);
				break;
			case 3:
				showAccount(account,user);
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		System.out.println("종료");
	}


	private static void showAccount(int[] account, int user) {
		System.out.printf("%d번 사용자의 잔액 : %d원%n",user,account[user-1]);
	}


	private static void withdrawl(int[] account, int user) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.printf("%d번 사용자에서 출금할 금액 입력 : ",user);
		int withd=Integer.parseInt(scanner.nextLine());
		account[user-1]-=withd;
	
	}


	private static void deposit(int[] account, int user) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.printf("%d번 사용자에게 입금할 금액 입력 : ",user);
		int add=Integer.parseInt(scanner.nextLine());
		account[user-1]+=add;
	}

}
