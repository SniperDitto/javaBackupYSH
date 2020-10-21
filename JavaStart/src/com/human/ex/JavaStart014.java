package com.human.ex;

public class JavaStart014 {
    public static void main(String[] args){
        System.out.println("1번----------------------------");
        int num=7;
        int sum1=0;
        while (num<=21){//while
            sum1=sum1+num;
            num++;
        }
        System.out.println(sum1);
        int sum2=0;
        for (int i=7;i<22;i++){//for
            sum2=sum2+i;
        }
        System.out.println(sum2);

        System.out.println("2번----------------------------");
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.print("숫자1 입력 : ");
		int n1=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력 : ");
		int n2=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자3 입력 : ");
		int n3=Integer.parseInt(scanner.nextLine());
		int x,y,z;
		x=n1; y=n2; z=n3;
		if(n1>n2) {//첫번째 두번째 비교 -> 첫번째가큼 (?,?,?),n1>n2
			if(n1>n3) {//첫번째 세번째 비교 -> 첫번째가 가장큼 (n1,?,?)
				if(n2>n3) {//두번째 세번째 비교 -> 두번째가 큼 (n1,n2,n3)
					x=n1;y=n2;z=n3;
				}else {//두번째 세번째 비교 -> 세번째가 큼 (n1,n3,n2)
					x=n1;y=n3;z=n2;
				}
			}else {//첫번째 세번째 비교 -> 세번째가 가장 큼  (n3,n1,n2)
				x=n3;y=n1;z=n2;
			}
		}else {//첫번째 두번째 비교 -> 두번째가큼 (?,?,?),n2>n1
			if(n2>n3) {//두번째 세번째 비교 -> 두번째가 가장 큼 (n2,?,?)
				if(n1>n3) {//첫번째 세번째 비교 -> 첫번째가 큼 (n2,n1,n3)
					x=n2;y=n1;z=n3;
				}else {//첫번째 세번째 비교 -> 세번째가 큼 (n2,n3,n1)
					x=n2;y=n3;z=n1;
				}
			}else {//두번째 세번째 비교 -> 세번째가 가장 큼 (n3,n2,n1)
			x=n3;y=n2;z=n1;
			}
		}
		System.out.printf("%d, %d, %d%n",z,y,x);//가장 작은 수부터 출력
        
        System.out.println("3번----------------------------");
        for(int i=4;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=4-i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("4번----------------------------");
        int a=1;
        int b=6;
        for(int i=1;i<=3;i++) {
        	a=a+2;
        	System.out.printf("(%d,%d)",a,b);
        	b=b+2;
        }
        System.out.println();
        
        System.out.println("5번----------------------------");
        int[] arr= new int[10];
        
        for(int i=0;i<arr.length;i++) {
        	arr[i]=3*(i+1);
        }
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]%2==0) {
        		System.out.println(arr[i]);
        	}
        }
    }
}
