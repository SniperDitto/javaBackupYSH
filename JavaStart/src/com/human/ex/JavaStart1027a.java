package com.human.ex;

public class JavaStart1027a {

	public static void main(String[] args) {
		System.out.println("별 출력");
		System.out.println("1-------------");
		for(int i=1;i<=9;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2-------------");
		for(int i=8;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(9-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3-------------");
		for(int i=8;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4-------------");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(10-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("5-------------");
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("6-------------");
		for(int i=4;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(5-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(5-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("7-------------");
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<(5-i);j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<(5-i);j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("8-------------");
		for(int i=1;i<5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=(5-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<(6-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("9-------------");
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<(5-i);j++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<(5-i);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("10-------------");
		for(int i=8;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(9-i);j++) {
				System.out.print("*");
			}
			for(int j=1;j<(9-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("11-------------");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(10-i);j++) {
				System.out.print("*");
			}
			for(int j=1;j<(10-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("12-------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(6-i);j++) {
				System.out.print("*");
			}
			for(int j=1;j<(6-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(5-i);j++) {
				System.out.print("*");
			}
			for(int j=1;j<(5-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("13-------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("*****");
			System.out.println();
		}
		for(int i=3;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("*****");
			System.out.println();
		}
		
		System.out.println("14-------------");
		for(int i=8;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=2;j<(9-i);j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<(9-i);j++) {
				System.out.print(" ");
			}
			if(i!=8) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("*******************");
		System.out.println();
		
		System.out.println("15-------------");
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=0;j<(5-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<(5-i);j++) {
				System.out.print(" ");
			}
			if(i!=5) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=4;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=0;j<=(4-i);j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
