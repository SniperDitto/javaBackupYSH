package com.human.ex;

import com.human.dto.Man;
import com.human.dto.Shopping;


public class Single1110 {

	public static void main(String[] args) {
		System.out.println("1---------------------------");
		Man man=Man.getInstance();
		man.setAge(40);
		man.setName("James");
		man.setMarried(true);
		man.setChildren(3);
		System.out.println(man.toString());
		
		System.out.println("2---------------------------");
		Shopping shopping=Shopping.getInstance();
		shopping.orderNO="201803120001";
		shopping.orderID="abc123";
		shopping.orderDate="2018년 3월 12일";
		shopping.name="홍길순";
		shopping.productNO="PD0345-12";
		shopping.address="서울시 영등포구 여의도동 20번지";
		System.out.println(shopping.toString());
	}

}
