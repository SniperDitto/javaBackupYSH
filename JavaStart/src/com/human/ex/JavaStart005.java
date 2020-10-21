package com.human.ex;

public class JavaStart005 {//교환

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		System.out.println("1번--------------------------------");
		System.out.print("a 입력 : ");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.print("b 입력 : ");
		int b=Integer.parseInt(scanner.nextLine());
		int i;
		i=a;
		a=b;
		b=i;
		System.out.printf("a=%d b=%d %n",a,b);
		
		
		System.out.println("2번--------------------------------");
		System.out.print("숫자1 입력 : ");
		int n1=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력 : ");
		int n2=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자3 입력 : ");
		int n3=Integer.parseInt(scanner.nextLine());
		int x,y,z;
		x=n1; y=n2; z=n3;
		if(n1>n2) {
			if(n1>n3) {
				if(n2>n3) {
					x=n1;y=n2;z=n3;
				}else {
					x=n1;y=n3;z=n2;
				}
			}else {
			x=n3;y=n1;z=n2;
			}
		}else {
			if(n2>n3) {
				if(n1>n3) {
					x=n2;y=n1;z=n3;
				}else {
					x=n2;y=n3;z=n1;
				}
			}else {
			x=n3;y=n2;z=n1;
			}
		}
		System.out.printf("%d, %d, %d%n",x,y,z);
		
	}

}
