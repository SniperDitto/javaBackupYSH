package com.human.ex;

import java.util.Arrays;

import com.human.dto.Dog;
import com.human.dto.Fruit;
import com.human.dto.Human;

public class JavaStart1023 {

	public static void main(String[] args) {
		java.util.Scanner scanner =new java.util.Scanner(System.in);
//		Human array5[] = new Human[3];
//		array5[0]=new Human();
//		array5[0].name="hgd";
//		array5[0].age=15;
//		array5[0].height=175.1;
//		
//		array5[1]=new Human();
//		array5[1].name="asd";
//		array5[1].age=16;
//		array5[1].height=170.1;
//		
//		array5[2]=new Human();
//		array5[2].name="qwe";
//		array5[2].age=17;
//		array5[2].height=165.1;
//		
//		System.out.println(Arrays.toString(array5));
//		System.out.println(array5[0].equals(array5[1]));
//		
//		array5[0] = new Human("asdf",14,145.4);
		
		double a1[]= {2.23, 5.23, 12.23};
		String a2[]= {"사과, 배, 바나나"};
		
		
		Fruit a3[]=new Fruit[3];
		for(int i=0;i<3;i++) {
			a3[i]=new Fruit();
			System.out.printf("과일%d 이름 : ",i+1);
			a3[i].name=scanner.nextLine();
		}
		System.out.println(Arrays.toString(a3));
		
		Dog a4[]=new Dog[1];
		a4[0]=new Dog();
		a4[0].name="누렁이";
		a4[0].color="yellow";
		a4[0].age=3;
		System.out.println(a4[0]);
		
		int a5[]=new int[10];
		int index=0;
		for(int i=1;i<=3*10;i++) {
			if(i%3==0) {
				a5[index]=i;
				index++;
			}
		}
		System.out.println(Arrays.toString(a5));
		
	}

}
