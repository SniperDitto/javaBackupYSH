package character;

import java.util.Scanner;

public class Pika implements Character {
	Scanner scanner = new Scanner(System.in);
	public int exp=0;
	public int energy=0;
	public int level=0;
	public int levelExp=50;
	public int fullLevel=10;

	@Override
	public void eat() {
		energy+=10;
		exp+=5;
	}

	@Override
	public void sleep() {
		energy+=20;
		exp+=5;
	}

	@Override
	public void play() {
		if((energy-30)<0) {
			System.out.println("에너지가 0 이하가 됩니다.계속합니까?(1.계속 2.그만)");
			System.out.print(">>");
			int input=Integer.parseInt(scanner.nextLine());
			if(input==1) {
			}else if (input==2) {
				return;
			}else {
				System.out.println("잘못된 입력");
				return;
			}
		}
		energy-=30;
		exp+=30;

	}

	@Override
	public void train() {
		if((energy-20)<0) {
			System.out.println("에너지가 0 이하가 됩니다.계속합니까?(1.계속 2.그만)");
			System.out.print(">>");
			int input=Integer.parseInt(scanner.nextLine());
			if(input==1) {
			}else if (input==2) {
				return;
			}else {
				System.out.println("잘못된 입력");
				return;
			}
		}
		energy-=20;
		exp+=20;
	}

	@Override
	public void levelup() {
		if(exp>levelExp) {
			levelExp+=10;
			level++;
			exp=0;
			System.out.printf("레벨 %d 달성%n",level);
		}
	}

	@Override
	public boolean isGameEnd() {
		boolean isEnd=false;
		if(level>=fullLevel) {
			System.out.println("완전히 성장하였습니다!");
			isEnd=true;
		}
		else if (energy<0){
			System.out.println("Game Over(에너지가 다 떨어졌습니다)");
			isEnd=true;
			exp=0;
			energy=0;
			level=0;
			levelExp=50;
		}
		
		return isEnd;
	}

	@Override
	public void printInfo() {
		System.out.println("===================");
		System.out.println("name : pika");
		System.out.printf("exp : %d%n",exp);
		System.out.printf("LV : %d%n",level);
		System.out.printf("energy : %d%n",energy);
		System.out.println("===================");

	}

}
