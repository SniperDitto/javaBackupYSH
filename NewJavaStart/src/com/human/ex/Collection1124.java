package com.human.ex;

import java.util.ArrayList;

import com.human.dto.Rectangle;

public class Collection1124 {

	public static void main(String[] args) {
		ArrayList<Rectangle> aList=new ArrayList<Rectangle>();
		aList.add(new Rectangle(11,11));
		aList.add(new Rectangle(12,12));
		aList.add(new Rectangle(13,14));
		aList.add(new Rectangle(15,16));
		
		for(int i=0;i<aList.size();i++) {
			System.out.println(aList.get(i));
		}
		aList.remove();
		for(Rectangle r:aList) {
			System.out.println(r);
		}
		
		Rectangle rec = new Rectangle(15,15);
		aList.add(rec);
		for(Rectangle r:aList) {
			System.out.println(r);
		}
		
	}

}
