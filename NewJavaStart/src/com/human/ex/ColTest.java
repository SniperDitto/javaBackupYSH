package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ColTest {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>(); 
		arrList.add(40);
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
		
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("-----------------");//해당index제거
		arrList.remove(1);
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("-----------------");//해당값제거
		arrList.remove((Integer)(10));
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("-----------------");//데이터정렬
		Collections.sort(arrList);
		Iterator<Integer> it = arrList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");//박싱,언박싱
		int index=arrList.indexOf((Integer)20);//찾는 데이터의 위치 리턴
		System.out.println(index);
		index=arrList.indexOf(20);
		System.out.println(index);
		System.out.println("-----------------");//값 존재 확인
		System.out.println(arrList.contains(20));
		
		
		
	}

}
