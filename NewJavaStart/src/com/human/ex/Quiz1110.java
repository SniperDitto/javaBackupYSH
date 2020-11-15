package com.human.ex;

import com.human.dto.Cat;
import com.human.dto.Dog;
import com.human.dto.Vaccination;

public class Quiz1110 {

	public static void main(String[] args) {
		Cat c = new Cat(10,"cat1",false);
		Dog d = new Dog(10,"dog1",false);
		System.out.println(d.toString());
	
		d.addage(5);
		System.out.println(d.age);
	
		Vaccination v = Vaccination.getInstance(10);
		v.vaccination(d);
		v.vaccination(d);
		v.vaccination(new Dog(3,"dog2",false));
		
		Vaccination v2 = Vaccination.getInstance();
		v2.vaccination(c);
	
	}

}
