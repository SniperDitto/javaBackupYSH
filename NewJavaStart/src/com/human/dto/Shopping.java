package com.human.dto;

public class Shopping {
	public String orderNO="";
	public String orderID="";
	public String orderDate="";
	public String name="";
	public String productNO="";
	public String address="";
	public static Shopping instance=new Shopping();
	
	private Shopping() {}
	public static Shopping getInstance() {
		return instance;
	}
	@Override
	public String toString() {
		return "주문번호=" + orderNO + "\n주문자 아이디=" + orderID + "\n주문날짜=" + orderDate + "\n주문자 이름=" + name
				+ "\n주문 상품 번호=" + productNO + "\n배송 주소=" + address;
	}
	
}
