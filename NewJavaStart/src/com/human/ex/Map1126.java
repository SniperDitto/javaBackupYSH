package com.human.ex;

import java.util.HashMap;
import java.util.Iterator;

public class Map1126 {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("삼십",30);//키+값
		hashmap.put("십",10);
		hashmap.put("사십",40);
		hashmap.put("오십",50);
		
		System.out.println(hashmap.keySet());//키값들의 배열
		for(String key:hashmap.keySet()) {
			System.out.println(key);
			
		}
		
		hashmap.remove("사십");
		System.out.println("----------------------사십 삭제");
		for(String key:hashmap.keySet()) {
			System.out.println(key);
		}
		
		Iterator<String> keys = hashmap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("key:%s value:%d", key,hashmap.get(key)));
		}
		
		hashmap.replace("이십", 200);
		System.out.println("----------------------이십 값20->200");
		for(String key:hashmap.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("크기 : "+hashmap.size());

		
	}
	
}
