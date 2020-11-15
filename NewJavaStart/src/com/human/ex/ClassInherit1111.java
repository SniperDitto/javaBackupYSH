package com.human.ex;

import com.human.dto.Circle;
import com.human.dto.ColoredCircle;

public class ClassInherit1111 {

	public static void main(String[] args) {
		System.out.println("1번======================");
		Circle c = new Circle(5);
		Circle colorC = new ColoredCircle(10,"빨간색");
		c.show();
		colorC.show();
		
		System.out.println("2번======================");
		
		
	}

}
