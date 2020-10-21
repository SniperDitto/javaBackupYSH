package com.human.ex;


import java.util.Arrays;
import java.util.Random;

public class JavaStart001 {

	public static void main(String[] args) {//블랙잭
		int[] deck=new int[52];
		Random rand=new Random();
		for(int i=0;i<52;i++){//덱 만들기
			deck[i]=i;
		}
		System.out.println(Arrays.toString(deck));
		for(int i=0;i<52;i++){//덱 섞기
			int temp=deck[0];
			int a=rand.nextInt(52);
			deck[0]=deck[a];
			deck[a]=temp;
			for(int j=0;j<i;j++){//중복된 수 다시 섞기
				if(deck[i]==deck[j]){
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(deck));
		
	}

}
