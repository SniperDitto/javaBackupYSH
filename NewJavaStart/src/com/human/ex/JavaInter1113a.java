package com.human.ex;

interface GamePlayer{
	public void attack();
	public void defend();
	public void heal();
	public void eat();
}

class Warrior implements GamePlayer{

	@Override
	public void attack() {
		System.out.println("검으로 공격한다");
		
	}

	@Override
	public void defend() {
		System.out.println("방패로 방어한다");
		
	}

	@Override
	public void heal() {
		System.out.println("명상으로 체력을 회복한다");
		
	}

	@Override
	public void eat() {
		System.out.println("음식을 먹는다");
		
	}
	
}

class Wizard implements GamePlayer{

	@Override
	public void attack() {
		System.out.println("공격 마법을 사용한다");
		
	}

	@Override
	public void defend() {
		System.out.println("방어 마법을 사용한다");
		
	}

	@Override
	public void heal() {
		System.out.println("회복 마법을 사용한다");
		
	}

	@Override
	public void eat() {
		System.out.println("포션을 마신다");
		
	}
	
}


public class JavaInter1113a {

	public static void main(String[] args) {
		GamePlayer A = new Warrior();
		GamePlayer B = new Wizard();

		GamePlayer party[] = {A,B};
		
		for (int i=0;i<party.length;i++) {
			party[i].attack();
			party[i].defend();
			party[i].heal();
			party[i].eat();
			
			System.out.println();
		}

		
	}

}
