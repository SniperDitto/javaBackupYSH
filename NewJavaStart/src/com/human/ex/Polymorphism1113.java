package com.human.ex;

//제품 종류로 TV와 컴퓨터가 있는데 제품마다 5% 10% 할인을 해주고 있다.
//TV에는 인치,컴퓨터에는 RAM 크기와 같은 특별한 속성이고
//최종가격을 리턴하는 getPrice메소드가 있다.
class Product {
	public String id = "";
	public double price = 0;
	public double discountRate = 0;

	public Product(String id, double price, double discountRate) {
		super();
		this.id = id;
		this.price = price;
		this.discountRate = discountRate;
	}

	public double getPrice() {
		return price - price * (discountRate / 100);
	}
}

class TV extends Product {
	public double inch = 0;// inch가 10이상이면 추가배송 만원 추가

	public TV(String id, double price, double discountRate, double inch) {
		super(id, price, discountRate);
		this.inch = inch;
	}

	@Override
	public double getPrice() {
		return inch > 10 ? super.getPrice() + 10000 : super.getPrice();
	}
}

class Computer extends Product {
	public Computer(String id, double price, double discountRate, double ram) {
		super(id, price, discountRate);
		Ram = ram;
	}

	public double Ram = 0;// ram 1기가 당 2만원 추가

	@Override
	public double getPrice() {
		return super.getPrice() + Ram * 2;
	}
}

//고객은 VIP고객과 일반고객이 있는데 VIP고객은 구매 요금 2%,
//일반 고객은 구매 요금 1%를 포인트 적립해 주고
//VIP 고객만 특별히 제품 가격을 5%할인 해 준다.
//포인트는 모든 물건 할인후 최종 결제 금액으로 포인트에 추가해 준다
//포인트 적립, toString
class Customer {
	public String id = "";
	public int point = 0;
	public double pointRate = 0;

	public void setPoint(Product p) {
//제품 p에 대한 point 적립
		this.point = (int) (p.getPrice() * (pointRate / 100));
	}

	public Customer(String id, int point, double pointRate) {
		super();
		this.id = id;
		this.point = point;
		this.pointRate = pointRate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", point=" + point + ", pointRate=" + pointRate + "]";
	}
}

class VIPCustomer extends Customer {
	public double priceRate = 0;

	public VIPCustomer(String id, int point, double pointRate, double priceRate) {
		super(id, point, pointRate);
		this.priceRate = priceRate;
	}

	public void setPoint(Product p) {
//제품 p에 대한 point 적립
		double resultPrice = p.getPrice() - (p.getPrice() * (priceRate / 100));
		this.point = (int) (resultPrice * (pointRate / 100));
	}

	@Override
	public String toString() {
		return "VIPCustomer [priceRate=" + priceRate + ", id=" + id + ", point=" + point + ", pointRate=" + pointRate
				+ "]";
	}

}

public class Polymorphism1113 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
//(id,price,discountRate,inch)
		Product p1 = new TV("LG0015", 100000, 10, 40);
//(id,price,discountRate,ram)
		Product p2 = new Computer("AMD0051", 100000, 20, 16);
//(id,point,pointRate)
		Customer c1 = new Customer("hong", 0, 1);
//(id,point,pointRate,priceRate)
		Customer c2 = new VIPCustomer("kim", 0, 2, 5);

		c1.setPoint(p1);
		c2.setPoint(p2);

		System.out.println(c1);
		System.out.println(c2);

	}

}
