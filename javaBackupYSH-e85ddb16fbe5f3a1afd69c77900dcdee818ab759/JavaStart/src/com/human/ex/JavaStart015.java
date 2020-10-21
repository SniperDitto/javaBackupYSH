package com.human.ex;

public class JavaStart015 {

	public static void main(String[] args) {
		System.out.println("1.");
        for(int i=0;i<7;i++){
            for(int j=-1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2.");
        for(int i=7;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("3.");
        for(int i=7;i>0;i--){
            for(int j=i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=7-i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("4.");
        for(int i=1;i<=7;i=i+2){
           for (int j=7;j>=i;j=j-2){
              System.out.print(" ");
           }
           for(int l=1;l<=i;l++){
              System.out.print("*");
           }
           System.out.println();
        }
        for(int i=1;i<=7-2;i=i+2){   
           for (int j=1;j<=i;j=j+2){
               System.out.print(" ");
           }
           System.out.print(" ");
           for(int l=7-2;l>=i;l--){
               System.out.print("*");
           }
           System.out.println();
        }
        System.out.println("5.");
        for (int a=0;a<7;a++) {
        	System.out.print("*");
        }
        System.out.println();
        for (int i=3;i>=1;i--) {
        	for(int j=0;j<i;j++) {
        		System.out.print("*");
        	}
        	for(int j=2*i-1;j<=5;j++) {
        		System.out.print(" ");
        	}
        	for(int j=0;j<i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int i=2;i<=3;i++) {
        	for(int j=0;j<i;j++) {
        		System.out.print("*");
        	}
        	for(int k=7-2*i;k>0;k--) {
        		System.out.print(" ");
        	}
        	for(int j=0;j<i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for (int a=0;a<7;a++) {
        	System.out.print("*");
        }
        System.out.println();
         
        System.out.println("6.");
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
