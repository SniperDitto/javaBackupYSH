package com.human.ex;

import com.human.dto.Animal;
import com.human.dto.Eagle;
import com.human.dto.Human1;
import com.human.dto.RPillar;
import com.human.dto.Rectangle1111;
import com.human.dto.Tiger;

public class JavaStart1111 {

	public static void main(String[] args) {
		Rectangle1111 rec = new Rectangle1111(10,30);
		System.out.println(rec.area());
		System.out.println(rec.round());
		
		RPillar rp = new RPillar();
		rp.height=10;
		rp.width=30;
		System.out.println(rp.area());
		System.out.println(rp.round());
		
		RPillar rp1 = new RPillar(10,20,30);
		System.out.println(rp1.area());
		System.out.println(rp1.round());
		System.out.println(rp1.volume());
		
		Animal a = new Animal("cat1");
		a.getname();
		a.move();
		a.eat();
		
		Human1 h = new Human1("홍길동");
		h.getname();
		h.move();
		h.eat();
		h.read();
		
		Animal a0=new Animal("a0");
		Animal a1=new Human1("a1");
		Animal a2=new Tiger("a2");
		Animal a3=new Eagle("a3");
		Animal arr[] = new Animal[4];
		arr[0]=a0;
		arr[1]=a1;
		arr[2]=a2;
		arr[3]=a3;
		for(Animal animal:arr) {
			animal.move();
		}
		Animal.displayName(a0);
		Animal.displayName(a1);
		Animal.displayName(a2);
		Animal.displayName(a3);
		//오버로드 - 메서드 이름은 같지만 매개변수가 다름
		//오버라이드 - 상속 시 재정의된 메서드
		//기본적으로는 부모클래스의 메서드에 접근하지만 오버라이드된경우 자식 메서드로 접근
		//자식클래스를 형변환시켜 부모클래스로 바꾸면 자식클래스의 메서드 실행가능
		
	}

}
