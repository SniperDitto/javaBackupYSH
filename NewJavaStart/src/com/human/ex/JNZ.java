package com.human.ex;

interface JonNum {
	public void zamsoo();
	public void ssipgi();
	public void onlyMyOpinion();

}

class Zet implements JonNum{

	@Override
	public void zamsoo() {
		System.out.println("잠수하는 잿");
	}

	@Override
	public void ssipgi() {
		System.out.println("씹는 잿");
	}

	@Override
	public void onlyMyOpinion() {
		System.out.println("지할말만 하는 잿");
	}
	
	public void ddongZet(int num) {
		System.out.println("잿이 "+num+"번 똥잿했습니다.");
	}
	
	
}

public class JNZ {
	public static void main(String[] args) {
		JonNum Z = new Zet();
		Z.zamsoo();
		Z.ssipgi();
		Z.onlyMyOpinion();
		
		

	}
	
}