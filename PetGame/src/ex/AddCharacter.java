package ex;

import java.util.Scanner;

import character.Character;
import character.Pika;
import character.Slime;

public class AddCharacter {
	Scanner scanner = new Scanner(System.in);
	
	public Character select() {
		Character returnC=null;
		System.out.print("플레이할 캐릭터 입력(1.pika 2.slime) : ");
		int inputChar=Integer.parseInt(scanner.nextLine());
		switch (inputChar) {
		case 1:
			returnC=new Pika();
			break;
		case 2:
			returnC=new Slime();
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
			
		return returnC;
	}
	
	
}
