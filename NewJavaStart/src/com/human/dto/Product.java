package com.human.dto;

public class Product {
	public String name="";
	public int stock=0;
	public static int prodID =0;//추가되는 상품마다 부여되는 고유번호
	
	public Product() {
		Product.prodID++;
	}

	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	public Product(String name) {
		this.name = name;
		this.stock = 0;
	}
	
	public void addStock(int stock) {
		this.stock+=stock;
	}
	public void delStock(int stock) {
		this.stock-=stock;
	}

	@Override
	public String toString() {
		return "상품명 = " + name + ", 재고량 = " + stock + "개";
	}
	public void showState() {
		System.out.println(toString());
	}
	
	
}
