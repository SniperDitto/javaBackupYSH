package ex;

import java.util.Scanner;
import character.Character;

public class PlayGame {
	Scanner scanner = new Scanner(System.in);
	private Character c;
	private boolean isEnd=false;
	public void playG(Character character) {
		c=character;
		while(isEnd==false) {
			c.printInfo();
			System.out.println("1.밥 2.잠 3.놀기 4.훈련 5.게임종료");
			System.out.print("행동 선택 : ");
			int inputMenu=Integer.parseInt(scanner.nextLine());
			switch (inputMenu) {
			case 1:
				c.eat();
				break;
			case 2:
				c.sleep();
				break;
			case 3:
				c.play();
				break;
			case 4:
				c.train();
				break;
			case 5:
				isEnd=true;
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
			c.levelup();
			if(isEnd==false)isEnd=c.isGameEnd();
		}
	}
		



}
