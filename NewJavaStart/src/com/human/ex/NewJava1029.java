package com.human.ex;
import java.util.Arrays;

public class NewJava1029 {
static class Human {
		public String name="";
		public int age=0;
		public double height=0;
		
		public Human() {//기본 생성자 : 사용자가 생성자를 따로 만들었을 때는 없어지므로 따로 써줘야함
			
		}
		public Human(String name, int age, double height) {//생성자 만들기
			super();//부모 클래스
			this.name = name;
			this.age = age;
			this.height = height;
		}
		//toString
		@Override
		public String toString() {
			return "Human [name=" + name + ", age=" + age + ", height=" + height + "]\n";
		}

	}
	public static void main(String[] args) {
//		int sum=0;
//		int a[]= {1,2,3,4};
//		for (int i:a) {//for(하나의 데이터:[배열])
//			sum+=i;
//		}
//		System.out.println(sum);
//		for(int i:a) {//읽기만 가능(배열 내 데이터 변경 불가)
//			i=0;
//		}
//		System.out.println(sum);
//		
		//객체도 읽기 가능한가
		Human aH[]= {
				new Human("홍1",1,1),
				new Human("홍2",12,12),
				new Human("홍3",13,13)
		};
		for (Human h:aH) {
			aH[0].age=100;//데이터 변경
			h=new Human("홍1",99,100);//데이터 변경x
		}
		System.out.println(Arrays.toString(aH));
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
