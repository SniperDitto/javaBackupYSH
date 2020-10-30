package blackjack;

import java.util.Random;
import java.util.Scanner;

class BJ{
	public Scanner scanner = new Scanner(System.in);
	public Random rand=new Random();
	public int deck[]=new int[52];
	public String cardShape[]={"스페이드","클로버","다이아","하트"};;
	public String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};//13칸
	public int cardValue[];
	public int deckindex=0;//덱에서 다음 나눠줄 카드 위치
	public int p1Deck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	public int p2Deck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	public int p1Index=0;//각 플레이어에 카드 추가시 받을자리
	public int p2Index=0;
	public int p1Value=0;//카드 값의 합(21넘으면 패배)
	public int p2Value=0;
	public boolean p1Flag=true;
	public boolean p2Flag=true;
	public String playState="";
	
	public BJ() {
		init();
	}
	
	public void init() {//생성시 자동호출
		for(int i=0;i<deck.length;i++){//덱 만들기
			deck[i]=i;
		}
		
		for(int i=0;i<cardNumber.length;i++) {//각 카드가 가지는 값
			switch (i%13) {
			case 0:
				cardValue[i]=1;
				break;
			case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
				cardValue[i]=i+1;
				break;
			case 10:case 11:case 12:
				cardValue[i]=10;
				break;
			default:
				break;
			}
		}
	}//init
	public void shuffleDeck() {
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
	}
	public void giveCard() {
		if(p1Flag==false && p2Flag ==false) {
			result();
		}
		if(p1Flag==true) {
		System.out.print("플레이어1 카드 받기(0:받지 않음/1:받음) : ");
		int giveCardP1=Integer.parseInt(scanner.nextLine());
			if (giveCardP1 == 1) {
				p1Deck[p1Index] = deck[deckindex];
				deckindex++;
			}else if(giveCardP1==0){
				p1Flag=false;
			}
		}else {
			System.out.println("플레이어1은 이번 게임에서 카드를 더이상 받지 않음 ");
		}
		if(p2Flag==true) {
		System.out.print("플레이어2 카드 받기(0:받지 않음/1:받음) : ");
		int giveCardP2=Integer.parseInt(scanner.nextLine());
			if (giveCardP2 == 1) {
				p2Deck[p2Index] = deck[deckindex];
				deckindex++;
			}else if(giveCardP2==0) {
				p2Flag=false;
			}
		}else {
			System.out.println("플레이어2는 이번 게임에서 카드를 더이상 받지 않음 ");
		}

	}
	public void gameState() {
		System.out.println("현재상황");
		System.out.print("P1 : ");
		for(int i=0;i<p1Index;i++) {
			System.out.print(p1Deck[i]);//덱내용
		}
		System.out.print("\t총합 : ");
		calcValue();
		System.out.println(p1Value);
		
		System.out.print("P2 : ");
		for(int i=0;i<p2Index;i++) {
			System.out.print(p2Deck[i]);
		}
		System.out.print("\t총합 : ");
		calcValue();
		System.out.println(p2Value);
	}
	private void calcValue() {
		
		
	}

	public void result() {
		
	}
	public void playBlackJack() {
		shuffleDeck();
		
	}

}//class BJ


public class BlackJack {

	public static void main(String[] args) {
		
		System.out.println("프로그램 종료");
	}//main

}//파일 끝
