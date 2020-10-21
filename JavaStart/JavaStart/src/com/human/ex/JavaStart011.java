package com.human.ex;

import java.util.Arrays;

public class JavaStart011 {
    public static void main(String args[]) {//이중반복문
        java.util.Scanner scanner =new java.util.Scanner(System.in);
        System.out.println("문제1-------------------------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("(%d,%d)%n",i+3,j+6);
            }
        }
        System.out.println("2---------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("(%d,%d)%n",i+1,2*(j+2));
            }
        }
        System.out.println("3---------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("(%d,%d)%n",(i+1)*2,(j+1));
            }
        }

        System.out.println("문제2-------------------------------");
        System.out.print("구구단 n 입력 : ");
        int n=Integer.parseInt(scanner.nextLine());
        for(int j=n;j<10;j++){
            System.out.printf("%d단%n",j);
            for(int i=0;i<9;i++){
                System.out.printf("%d x %d = %d%n",j,i+1,n*(i+1));
            }
        }

        System.out.println("문제3-------------------------------");
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
        
        System.out.println("배열정렬-------------------------------");
		int[] a={6,5,1,8,7,4,2,3};
        int a1;
        System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]<a[j]){
					a1=a[i];
					a[i]=a[j];
					a[j]=a1;
				}else{
				}
			}
		}
		System.out.println(Arrays.toString(a));
        






    }
}
