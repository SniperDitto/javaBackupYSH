package com.human.dto;

public class Rectangle implements Comparable<Rectangle>{
	private double width=100;
	private double height=100;
//	private static Rectangle instance=new Rectangle();
	
	public double area() {
		return width*height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		if (this.width<0)this.width=0;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		if (this.height<0)this.height=0;
		
	}
	public Rectangle() {}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		if (this.width<0)this.width=0;
		if (this.height<0)this.height=0;
	}
//	public static Rectangle getInstance() {
//		return instance;
//	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
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
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
//		if(this.width*this.height==other.width*other.height) {
//			return true;
//		}else {
//			return false;
//		}
		return true;
	}

//	compareTo : Comparable 인터페이스 (매개변수 1개와 자신 비교)
//	compare : Comparator 인터페이스 (매개변수 2개끼리 비교)

	@Override
	public int compareTo(Rectangle other) {//넓이로 비교
		//-1:매개변수가 더 큼 , 0:같음, 1:자신이 더 큼
		int val = 0;
		if(this.area()==other.area()) {
			val=0;
		}else if(this.area()>other.area()) {
			val=1;
		}else if(this.area()<other.area()) {
			val=-1;
		}
			
		return val;
	}
	
	
	
}
