package com.human.dto;

public class Vaccination {
	public String name="";
	public int age=0;
	public boolean isVac=false;
	public int countV=0;
	private static Vaccination instance=new Vaccination();
	Cat cat=new Cat();
	Dog dog=new Dog();
	private int callCountCat=0;
	private int callCountDog=0;
	
	private Vaccination() {}
	public static Vaccination getInstance() {
		instance.countV++;
		return instance;
	}

	public static Vaccination getInstance(int i) {
		instance.countV=i;
		return instance;
	}
	
	public void vaccination(Cat cat) {
		if(callCountCat==0 && cat.isVaccination()==true) {
			System.out.printf("%s에게 %d번째로 예방접종을 했습니다.%n",cat.name,countV);
			callCountCat++;
		}else if(callCountCat>0 && cat.isVaccination()==true) {
			System.out.printf("%s에게 이미 예방접종을 했습니다.%n",cat.name);
		}else if(cat.isVaccination()==false) {
			System.out.printf("%s은(는) 대상자가 아닙니다.%n",cat.name);
		}
	}
	public void vaccination(Dog dog) {
		if(callCountDog==0 && dog.isVaccination()==true) {
			System.out.printf("%s에게 %d번째로 예방접종을 했습니다.%n",dog.name,countV);
			callCountDog++;
		}else if(callCountDog>0 && dog.isVaccination()==true) {
			System.out.printf("%s에게 이미 예방접종을 했습니다.%n",dog.name);
		}else if(dog.isVaccination()==false) {
			System.out.printf("%s은(는) 대상자가 아닙니다.%n",dog.name);
		}
	}
}
