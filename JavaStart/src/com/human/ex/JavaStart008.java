package com.human.ex;

public class JavaStart008 {

	public static void main(String[] args) {//은행
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		int account=0;
		// System.out.println("1:입금/2:출금/3:조회/4:종료 ");
		// System.out.print("원하는 메뉴 입력 : ");
		int a=0;

		while(a!=4){
			System.out.println("1:입금/2:출금/3:조회/4:종료 ");
			System.out.print("원하는 메뉴 입력 : ");
			a=Integer.parseInt(scanner.nextLine());
			switch (a) {
				case 1:
					System.out.println("입금할 금액 입력 : ");
					int dep = Integer.parseInt(scanner.nextLine());
					if ((account + dep) > 1000) {
						System.out.println("잔액이 1000원 이상이 되도록 입금할 수 없습니다");
					} else {
						account = account + dep;
						System.out.printf("%d(원) 입금됨%n", dep);
					}
					break;
				case 2:
					System.out.println("출금할 금액 입력 : ");
					int wit = Integer.parseInt(scanner.nextLine());
					if ((account - wit) < 0) {
						System.out.println("잔액이 부족하여 출금할 수 없습니다");
					} else {
						account = account - wit;
						System.out.printf("%d(원) 출금됨%n", wit);
					}
					break;
				case 3:
					System.out.printf("계좌 잔액은 %d(원) 입니다%n", account);
					break;
				case 4:
					break;
				default:
					System.out.println("---1-4 사이의 정수만 입력---");
					
			}
		}
		System.out.println("종료");
		// while(a!=4) {
		// 	if(a==1) {
		// 		System.out.println("입금할 금액 입력 : ");
		// 		int dep=Integer.parseInt(scanner.nextLine());
		// 		if((account+dep)>1000){
		// 			System.out.println("잔액이 1000원 이상이 되도록 입금할 수 없습니다");
		// 		}else{
		// 			account=account+dep;
		// 			System.out.printf("%d(원) 입금됨%n",dep);
		// 		}
		// 	}else if(a==2) {
		// 		System.out.println("출금할 금액 입력 : ");
		// 		int wit=Integer.parseInt(scanner.nextLine());
		// 		if((account-wit)<0){
		// 			System.out.println("잔액이 부족하여 출금할 수 없습니다");
		// 		}else{
		// 			account=account-wit;
		// 			System.out.printf("%d(원) 출금됨%n",wit);
		// 		}
		// 	}else if(a==3) {
		// 		System.out.printf("계좌 잔액은 %d(원) 입니다%n",account);
		// 	}else {
		// 		System.out.println("잘못된 메뉴입니다");
		// 	}
		// 	System.out.println("1:입금/2:출금/3:조회/4:종료 ");
		// 	System.out.print("원하는 메뉴 입력 : ");
		// 	a=Integer.parseInt(scanner.nextLine());
		// }
		// System.out.println("종료");

		
		
		
		
	}

}
