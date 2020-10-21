package com.human.ex;

public class JavaStart016 {

	public static void main(String[] args) {
		for (int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=4-(i*2);k>0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			for(int k=6-(i*2);k>0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
