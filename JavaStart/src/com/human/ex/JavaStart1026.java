package com.human.ex;

public class JavaStart1026 {

	public static void main(String[] args) {
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
		java.util.Scanner scanner=new java.util.Scanner(System.in);
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
		
		
		
		
		
	}

}
