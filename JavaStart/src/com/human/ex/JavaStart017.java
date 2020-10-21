package com.human.ex;

public class JavaStart017 {

	public static void main(String[] args) {
		int i=1;
		if(i>0) {
			System.out.println("i는 양수");
		}else if(i<0) {
			System.out.println("i는 음수");
		}else if(i==0) {
			System.out.println("i는 0");
		}else {
			System.out.println("i는 양수, 음수, 0이 아님");
		}
		
		if(i==5) {
			System.out.println("최우수");
		}else if(i==4) {
			System.out.println("우수");
		}else if(i==3) {
			System.out.println("보통");
		}else if(i==2||i==1||i==0){
			System.out.println("불합격");
		}else {
			System.out.println("0~5까지의 정수 입력");
		}
		
		switch (i) {
		case 5:
			System.out.println("최우수");			
			break;
		case 4:
			System.out.println("우수");
			break;
		case 3:
			System.out.println("보통");		
			break;
		case 2:case 1:case 0:
			System.out.println("불합격");
			break;
		default:
			System.out.println("미응시");
			break;
		}
//------------------------------------------------------
		boolean isFlag1=true,isFlag2=true;
		if(isFlag1==true) {
			if(isFlag2==true) {
				System.out.println("1:isFlag1, 2 모두 true");
			}else {
				System.out.println("2:isFlag1은 true, 2는 false");
			}
		}else {
			if(isFlag2==true) {
				System.out.println("3:isFlag1은 false, 2는 true");
			}else {
				System.out.println("4:isFlag1, 2 모두 false");
			}
		}
		
		if(isFlag1 && isFlag2) {
			System.out.println("1:isFlag1, 2 모두 true");
		}else {
			System.out.println(" ");
		}
		
		if(isFlag1 && !isFlag2) {
			System.out.println("2:isFlag1은 true, 2는 false");
		}else {
			System.out.println(" ");
		}
		
		if(!isFlag1 && isFlag2) {
			System.out.println("3:isFlag1은 false, 2는 true");
		}else {
			System.out.println(" ");
		}
			
		if(!isFlag1 && !isFlag2) {
			System.out.println("4:isFlag1, 2 모두 false");
		}else {
			System.out.println(" ");
		}	
			
		if(isFlag1 || isFlag2) {
			
		}
		
		System.out.println("6보다 큰 수");
		System.out.println("a>6");
		
		System.out.println("두 수 모두 100이 넘는 경우");
		System.out.println("a>100 && b>100");
			
		System.out.println("세 수 중 하나만 100이 넘는 경우");
		System.out.println("a>100 || b>100 || c>100");
		
		System.out.println("부모 동의가 있거나 20살이 넘은 경우");
		System.out.println("부모동의==true || age>20");
		
		System.out.println("부모 동의가 있거나 20살이 넘은 경우");
		System.out.println("부모동의==true || age>20");
		
		System.out.println("세 수 중 하나라도 음수가 있는 경우");
		System.out.println("a<0 || b<0 ||c<0");
		
		System.out.println("30에서 40 사이의 숫자");
		System.out.println("a>30 && a<40");
		
		System.out.println("30에서 40 사이를 제외한 모든 숫자");
		System.out.println("a<30 && a>40");
		
		System.out.println("60보다 작거나 100보다 큰 숫자");
		System.out.println("a<60 || a>100");
		
		System.out.println("대전이나 천안에 살면서 나이가 20대인 사람");
		System.out.println("(거주지==대전 || 거주지==천안) && (age>=20 && age<30)");
	
	}

}
