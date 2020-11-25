package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.human.dto.Rectangle;

//익명클래스 사용하지 않으려면 따로 클래스를 만들어줘야한다
class RectangleWidth implements Comparator<Rectangle>{
	@Override
	public int compare(Rectangle arg0, Rectangle arg1) {
		int val=0;
		if(arg0.getWidth()>arg1.getWidth()) {//값이 큰 순서대로 정렬
			val=-1;
		}else if(arg0.getWidth()<arg1.getWidth()) {
			val=1;
		}
		return val;
	}
	
}


public class Collection1124 {
	//collection 사용 위해서는 equals와 hashcode 재정의 필요

	public static void main(String[] args) {
		ArrayList<Rectangle> aList=new ArrayList<Rectangle>();
		aList.add(new Rectangle(11,11));
		aList.add(new Rectangle(12,12));
		aList.add(new Rectangle(13,14));
		aList.add(new Rectangle(15,16));
		aList.add(new Rectangle(12,16));
		aList.add(new Rectangle(14,14));
		aList.add(new Rectangle(16,15));
		aList.add(new Rectangle(12,14));
		
		for(int i=0;i<aList.size();i++) {
			System.out.println(aList.get(i));
		}
		
		aList.remove(1);
		System.out.println("-------------2번째위치 삭제");
		Iterator<Rectangle> iterator=aList.iterator();//iterator이용 출력
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		Rectangle rec = new Rectangle(15,15);
		aList.add(rec);
		System.out.println("-------------15,15추가");
		for(Rectangle r:aList) {
			System.out.println(r);
		}
		
//		compareTo : Comparable 인터페이스 (매개변수 1개와 자신 비교)
//		compare : Comparator 인터페이스 (매개변수 2개끼리 비교)
		Collections.sort(aList);//rectangle클래스 내에서 compareTo를 넓이로 비교하도록 함
		System.out.println("--------------넓이로정렬");
		for(Rectangle r:aList) {
			System.out.println(r);
		}
		
		
		//1,2 같은내용
		//------------------------------------------------------1
		Collections.sort(//width작은순으로 정렬
				aList,new Comparator<Rectangle>(){//익명 클래스

				@Override
				public int compare(Rectangle arg0, Rectangle arg1) {
					int val=0;
					if(arg0.getWidth()>arg1.getWidth()) {
						val=1;
					}else if(arg0.getWidth()<arg1.getWidth()) {
						val=-1;
					}
					return val;
				}
			
			}
		);
		//------------------------------------------------------2
//		Comparator<Rectangle> comparator = new Comparator<Rectangle>() {
//
//			@Override
//			public int compare(Rectangle o1, Rectangle o2) {
//				
//				return 0;
//			}
//			
//		};
//		Collections.sort(aList,comparator);
		System.out.println("--------------width로정렬(작은것부터)");
		for(Rectangle r:aList) {
			System.out.println(r);
		}
		
		//익명클래스없이 따로 만들어서 써보기
		Collections.sort(aList,new RectangleWidth());
		System.out.println("--------------width로정렬(큰것부터)");
		for(Rectangle r:aList) {
			System.out.println(r);
		}
		
		//람다식(높이순정렬)
		Collections.sort(aList,(a,b)->{
			int val=0;
			if(((Rectangle)a).getHeight()<((Rectangle)b).getHeight()){
				val=1;
			}else if(((Rectangle)a).getHeight()>((Rectangle)b).getHeight()) {
				val=-1;
			}
			return val;
		});
		
		System.out.println("--------------height로정렬(큰것부터)");
		for(Rectangle r:aList) {
			System.out.println(r);
		}
		
		
		
	}

}
