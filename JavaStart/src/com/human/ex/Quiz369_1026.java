package com.human.ex;


public class Quiz369_1026 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("1--------------------------------------------");
		int dig1000;int dig100;int dig10;int dig1;
		for(int i=1;i<=1000;i++) {
			dig1000=i/1000;
			dig100=(i%1000)/100;
			dig10=(i%100)/10;
			dig1=(i%10)/1;
			int num369=0;
			if(dig1000==3 || dig1000==6 || dig1000==9) {
				System.out.print("짝");
				num369++;
			}if(dig100==3 || dig100==6 || dig100==9) {
				System.out.print("짝");
				num369++;
			}if(dig10==3 || dig10==6 || dig10==9) {
				System.out.print("짝");
				num369++;
			}if(dig1==3 || dig1==6 || dig1==9) {
				System.out.print("짝");
				num369++;
			}if(num369==0){
				System.out.print(i);
			}else {
				System.out.print("("+i+")");
			}
			System.out.print("/");
			if(i%10==0) {//10마다 다음줄로
				System.out.println();
			}
		}
		System.out.println("2--------------------------------------------");
		for(int lv=1;lv<=4;lv++) {
			if(lv==1) {
				int randomA=(int) (Math.random()*99+1);
				int randomB=(int) (Math.random()*99+1);
				System.out.printf("%d단계%n%d+%d=",lv,randomA,randomB);
				int a=Integer.parseInt(scanner.nextLine());
				if(a==(randomA+randomB)) {
					System.out.println("정답\n다음단계로 넘어갑니다");
				}else{
					System.out.println("오답(종료)");
					break;
				}
			}else if(lv==2) {
				int randomA=(int) (Math.random()*99+1);
				int randomB=(int) (Math.random()*99+1);
				int randomC=(int) (Math.random()*99+1);
				System.out.printf("%d단계%n%d+%d-%d=",lv,randomA,randomB,randomC);
				int a=Integer.parseInt(scanner.nextLine());
				if(a==(randomA+randomB-randomC)) {
					System.out.println("정답\n다음단계로 넘어갑니다");
				}else{
					System.out.println("오답(종료)");
					break;
				}
			}else if(lv==3) {
				int randomA=(int) (Math.random()*99+1);
				int randomB=(int) (Math.random()*99+1);
				int randomC=(int) (Math.random()*99+1);
				int randomD=(int) (Math.random()*99+1);
				System.out.printf("%d단계%n%d+%d-%d*%d=",lv,randomA,randomB,randomC,randomD);
				int a=Integer.parseInt(scanner.nextLine());
				if(a==(randomA+randomB-randomC*randomD)) {
					System.out.println("정답\n다음단계로 넘어갑니다");
				}else{
					System.out.println("오답(종료)");
					break;
				}
			}else if(lv==4) {
				int randomA=(int) (Math.random()*99+1);
				int randomB=(int) (Math.random()*99+1);
				int randomC=(int) (Math.random()*99+1);
				int randomD=(int) (Math.random()*99+1);
				int randomE=(int) (Math.random()*99+1);
				System.out.printf("%d단계(소수점 이하는 버림)%n%d+%d-%d*%d/%d=",4,randomA,randomB,randomC,randomD,randomE);
				int ans=(int)(randomA+randomB-randomC*randomD/randomE);
				//System.out.println(ans);
				int a=Integer.parseInt(scanner.nextLine());
				if(a==ans) {
					System.out.println("정답(끝)");
				}else{
					System.out.println("오답(종료)");
					break;
				}
			}
			
		}
		
		System.out.println("3--------------------------------------------");
		int a1=0;int a2=0;int a3=10;
		age : while(a1!=4) {
			System.out.println("1:대인/2:청소년/3:소인,경로/4:종료 ");
			System.out.print("연령대 입력 : ");
			a1=Integer.parseInt(scanner.nextLine());
			if(a1==4) {
				System.out.println("종료");
				break;
			}
			time : while(a2!=6) {
				System.out.println("1:주간/2:오후/3:야간/4:2일/5:연령 다시 선택/6:종료 ");
				System.out.print("시간대 입력 : ");
				a2=Integer.parseInt(scanner.nextLine());
				int a4=a2*a3+a1;
				if(a2==5) {
					System.out.println("연령 다시 선택");
					break time;
				}else if(a2==6) {
					System.out.println("종료");
					break age;
				}else {
					switch (a4) {
					case 11:
						System.out.println("46000원");
						break time;
					case 12:
						System.out.println("39000원");
						break time;
					case 13:
						System.out.println("36000원");
						break time;
					case 21:
						System.out.println("38000원");
						break time;
					case 22:
						System.out.println("32000원");
						break time;
					case 23:
						System.out.println("29000원");
						break time;
					case 31:
						System.out.println("20000원");
						break time;
					case 32:
						System.out.println("17000원");
						break time;
					case 33:
						System.out.println("16000원");
						break time;
					case 41:
						System.out.println("74000원");
						break time;
					case 42:
						System.out.println("62000원");
						break time;
					case 43:
						System.out.println("58000원");
						break time;
					default:
						System.out.println("잘못된 입력, 다시 입력하기");
						break time;
					}
				}	
			}			
		}
		
		System.out.println("4--------------------------------------------");
		int ranNum=(int) (Math.random()*99+1);
		System.out.print("숫자 입력(1~100) : ");
		int numGuess=Integer.parseInt(scanner.nextLine());
		int guess=1;
		while(ranNum!=numGuess) {
			System.out.println("오답");
			if(ranNum>numGuess) {
				System.out.println("입력된 값은 정답보다 작다");
				guess++;
			}else {
				System.out.println("입력된 값은 정답보다 크다");
				guess++;
			}
			System.out.print("숫자 입력(1~100) : ");
			numGuess=Integer.parseInt(scanner.nextLine());
		}
		System.out.printf("정답 (%d번 도전)%n",guess);
		
		System.out.println("5-1-------------------------------------------");
		String quit = "종료";
		System.out.println("종료하려면 '종료'입력");
		boolean stop1 = quit.equals(scanner.nextLine());
		while(stop1==false) {
			System.out.println("종료하려면 '종료'입력");
			stop1 = quit.equals(scanner.nextLine());
			
		}
		System.out.println("종료됨");
		System.out.println("5-2-------------------------------------------");
		for(;;) {
			System.out.println("종료하려면 '종료'입력");
			String stop2 = scanner.nextLine();
			if(stop2.equals(quit)) {
				break;
			}
		}
		System.out.println("종료됨");
		System.out.println("5-3-------------------------------------------");
		System.out.println("종료하려면 '종료'입력");
		boolean stop3 = quit.equals(scanner.nextLine());
		switch (String.valueOf(stop3)) {
		case "true":
			break;
		default:
			System.out.println("종료하려면 '종료'입력");
			stop3 = quit.equals(scanner.nextLine());
		}
		System.out.println("종료됨");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
