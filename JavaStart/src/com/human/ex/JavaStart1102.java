package com.human.ex;

public class JavaStart1102 {
	public int deck[]=new int[52];
	public static String cardShape[]={"스페이드","클로버","다이아","하트"};;
	public static String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static void asd(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				String card=cardShape[i].concat(cardNumber[j]);
				System.out.println(card);
			}
		}
	}
	public static void main(String[] args) {
		asd();

		
		
	}

}
