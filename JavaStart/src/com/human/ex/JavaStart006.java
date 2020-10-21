package com.human.ex;

public class JavaStart006 {

	public static void main(String[] args) {//어플리케이션테스트문제
		System.out.println("1-1)----------------------------");
		System.out.println("11");
		int a=1;
		int b=1;
		int c=1;
		if(a==1) {
			System.out.println("12");
			if(b==1) {
				System.out.println("03");
			}else {
				System.out.println("02");
			}
			System.out.println("04");
			if(c==1) {
				System.out.println("06");
			}else {
				System.out.println("05");
			}
			System.out.println("07");
		}else {
			System.out.println("13");
			System.out.println("05");
		}
		System.out.println("14");
		
		System.out.println("1-2-1)----------------------------");
		if(a==1) {
			System.out.println("11");
			System.out.println("13");
			while(a!=1) {
				System.out.println("14");
			}
			System.out.println("15");
		}else {
			System.out.println("12");
			System.out.println("16");
		}
		System.out.println("17");
		
		System.out.println("1-2-2-1)----------------------------");
		System.out.println("01");
		if(a==1) {
			System.out.println("02");
			while(a!=1) {
				System.out.println("04");
			}
			System.out.println("06");
		}else {
			System.out.println("03");
		}
		System.out.println("07");
		
		System.out.println("1-2-2-2)----------------------------");
		System.out.println("01");
		while(a!=1) {
			System.out.println("06");
			if(a==1) {
				System.out.println("07");
			}
			System.out.println("02");
		}
		System.out.println("06");
		
		System.out.println("1-3-1)----------------------------");
		System.out.println("01");
		if(a==1) {
			System.out.println("03");
			if(b==1) {
				System.out.println("06");
			}else {
				System.out.println("07");
				while(b!=1) {
					System.out.println("13");
					if(c==1) {
						System.out.println("07");
					}else {
						System.out.println("12");
					}
					System.out.println("11");
				}
				System.out.println("12");
			}
			System.out.println("09");
		}else {
			System.out.println("02");
			while(a!=1) {
				System.out.println("04");
			}
			System.out.println("05");
			System.out.println("08");
		}
		System.out.println("10");
		
		System.out.println("2-2-1)----------------------------");
		System.out.println("01");
		while(a!=1) {
			System.out.println("07");
			while(b!=1) {
				System.out.println("08");
			}
			System.out.println("06");
			while(c!=1) {
				System.out.println("05");
			}
			System.out.println("02");
		}
		System.out.println("09");
		
		System.out.println("2-2-2)----------------------------");
		System.out.println("01");
		while(a!=1) {
			System.out.println("04");
			while(b!=1) {
				System.out.println("06");
				while(c!=1) {
					System.out.println("07");
				}
				System.out.println("03");
			}
			System.out.println("02");
		}
		System.out.println("05");
		
		System.out.println("2-3-1)----------------------------");
		System.out.print("1");
		for(int i=0;i>22;i++) {
			System.out.print("*");
		}
		System.out.println("1");
		
		System.out.println("2-3-2)----------------------------");
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.print("1");
		}
		System.out.println();
		
		System.out.println("2-3-3)----------------------------");
		for(int i=0;i<4;i++) {
			System.out.print("2");
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.println("2-3-4)----------------------------");
		System.out.print("2");
		System.out.print("1");
		for(int j=0;j<22;j++) {
			System.out.print("*");
		}
		System.out.println("1");
		
		System.out.println("2-3-5)----------------------------");
		for(int i=0;i<4;i++) {
			System.out.print("1");
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.print("2");
		}
		System.out.println();
		
		System.out.println("2-3-6)----------------------------");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("1");
			}
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.print("2");
		}
		System.out.println();
		
		System.out.println("2-3-7)----------------------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("1");
			}
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			for(int j=0;j<4;j++) {
				System.out.print("2");
			}
		}
		System.out.println();
		
		System.out.println("2-3-8)----------------------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("1");
			}
			for(int j=0;j<4;j++) {
				System.out.print("2");
			}
			for(int j=0;j<4;j++) {
				System.out.print("3");
			}
			for(int j=0;j<4;j++) {
				System.out.print("4");
			}
		}
		System.out.println();
		
		
	}

}
