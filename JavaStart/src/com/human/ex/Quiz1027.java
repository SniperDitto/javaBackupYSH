package com.human.ex;



public class Quiz1027 {

	public static int count369(String s) {//문자열에서 3,6,9갯수 세는 함수
		int num=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='3') {
				num++;
			}
			if(s.charAt(i)=='6') {
				num++;
			}
			if(s.charAt(i)=='9') {
				num++;
			}
		}
		return num;
	}
	
	public static int makeQ(int lv) {//문제만들기, 정답시1 오답시0
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int returnV=0;
		if(lv==1) {
			int randomA=(int) (Math.random()*99+1);
			int randomB=(int) (Math.random()*99+1);
			System.out.printf("%d단계%n%d+%d=",lv,randomA,randomB);
			int ans=(int)(randomA+randomB);
			//System.out.println(ans);
			int a=Integer.parseInt(scanner.nextLine());
			if(a==ans) {
				returnV=1;
			}else {
				returnV=0;
			}
		}else if(lv==2) {
			int randomA=(int) (Math.random()*99+1);
			int randomB=(int) (Math.random()*99+1);
			int randomC=(int) (Math.random()*99+1);
			System.out.printf("%d단계%n%d+%d-%d=",lv,randomA,randomB,randomC);
			int ans=(int)(randomA+randomB-randomC);
			//System.out.println(ans);
			int a=Integer.parseInt(scanner.nextLine());
			if(a==ans) {
				returnV=1;
			}else {
				returnV=0;
			}
		}else if(lv==3) {
			int randomA=(int) (Math.random()*99+1);
			int randomB=(int) (Math.random()*99+1);
			int randomC=(int) (Math.random()*99+1);
			int randomD=(int) (Math.random()*99+1);
			System.out.printf("%d단계%n%d+%d-%d*%d=",lv,randomA,randomB,randomC,randomD);
			int ans=(int)(randomA+randomB-randomC*randomD);
			//System.out.println(ans);
			int a=Integer.parseInt(scanner.nextLine());
			if(a==ans) {
				returnV=1;
			}else {
				returnV=0;
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
				returnV=1;
			}else {
				returnV=0;
			}
		}else {
			System.out.println("잘못된 입력값");
		}
		return returnV;
	}

	public static int setLevel(int s)	{//레벨설정
		int lv=1;
		if(s<5) {
			lv=1;
		}else if(s>=5 && s<10) {
			lv=2;
		}else if(s>=10 && s<15) {
			lv=3;
		}else {
			lv=4;
		}
		return lv;
	}
	
	public static int displayResult(int s,int lv) {//결과화면, 계속/그만하기
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.printf("점수 : %d, 현재레벨 : %d%n계속하기(1), 그만하기(2) : ",s,lv);
		int con=Integer.parseInt(scanner.nextLine());
		return con;
	}
	
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("1-----------------------------------");
		for (int i=1;i<=1000;i++) {
			int count=count369(Integer.toString(i));
			if(count==0) {
				System.out.printf("%d\t",i);
			}else {
				for(int j=0;j<count;j++) {
					System.out.print("짝");
				}
				//System.out.printf("(%d)\t",i);//가려진 숫자 표시
				System.out.print("\t");//숫자표시x
			}
			
			if(i%10==0) {
				System.out.println();
			}
		}
		
		System.out.println("2-----------------------------------");
		int score=0;int lv=1;
		for(;;) {
			int correct=makeQ(lv);
			if(correct==1) {
				System.out.println("정답");
				score++;
			}else {
				System.out.println("오답");
			}
			lv=setLevel(score);
			int continueOX=displayResult(score, lv);
			if(continueOX==1) {
				
			}else if(continueOX==2) {
				System.out.println("종료합니다");
				break;
			}	
		}
		

	}

}
