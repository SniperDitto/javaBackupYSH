package com.human.ex;

class Rectangle{
	public static double unit=100;//static 메서드는 static 변수만 사용가능
	private double height = 20;
	private double width = 40;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {//높이에 -들어가는것을 막기 위해 한번 걸러줌
		if(height<0) {
			height=Math.abs(height);
		}
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width<0) {
			width=Math.abs(width);
		}
		this.width = width;
	}
	
	public static double area(double height,double width) {//객체생성없이 호출가능(static) 대신 this 사용불가
		unit=100;
		return height*width;
	}
	public double perimeter() {
		return 2*height+2*width;
	}
	
	public Rectangle() {}
	public Rectangle(double height,double width) {
		super();
		this.height=height;
		this.width=width;
	}
		public Rectangle(double width) {//정사각형
		this(width,width);
		//super();
		//this.width = width;
		//this.height= width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]" + " 넓이 :" + this.area(getHeight(),getWidth());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		// temp = Double.doubleToLongBits(area());
		// result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		//if (this.area() != other.area()) {
			
		//}
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
		
	
}
class Triangle{
	public double tHeight=10;
	public double tWidth=5;
	
	public double area() {
		return 0.5*tHeight*tWidth;
	}
	public double perimeter() {
		return 3*tWidth;
	}
	public Triangle() {}
	public Triangle(double tHeight,double tWidth) {
		super();
		this.tHeight=tHeight;
		this.tWidth=tWidth;
	}
		public Triangle(double tWidth) {//정사각형
		this(tWidth,tWidth);
		//super();
		//this.width = width;
		//this.height= width;
	}
}
class Circle{
	public double radius=7;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
	public Circle() {}
	public Circle(double radius) {
		super();
		this.radius=radius;
	}
}

public class Method1103 {
	
	public static void main(String[] args) {
		Rectangle rct = new Rectangle();
		Rectangle rct2 = new Rectangle();
		Triangle tri = new Triangle();
		Circle cir = new Circle();
		System.out.println(rct.toString());
		System.out.println("사각형 넓이 : "+rct.area(10,-20));
		System.out.println("사각형 둘레 : "+rct.perimeter());
		System.out.println("사각형 넓이2 : "+rct2.area(-10,10));
		System.out.println("사각형 둘레2 : "+rct2.perimeter());
		System.out.println("삼각형 넓이 : "+tri.area());
		System.out.println("삼각형 둘레 : "+tri.perimeter());
		System.out.println("원 넓이 : "+cir.area());
		System.out.println("원 둘레 : "+cir.circumference());
	}

}
