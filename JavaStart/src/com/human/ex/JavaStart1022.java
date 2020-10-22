package com.human.ex;

import com.human.dto.*;
import com.human.dto.Car.Wheel;


public class JavaStart1022 {

	public static void main(String[] args) {
		java.util.Scanner scanner =new java.util.Scanner(System.in);
		Car car = new Car();
		Car.Wheel wheelA = car.new Wheel();

		for(int i=1;i<=3;i++) {
			System.out.printf("차%d의 정보 입력%n",i);
			System.out.print("색깔 : ");
			car.color = scanner.nextLine();
			System.out.print("바퀴 종류: ");
			car.wheel = scanner.nextLine();
			System.out.print("바퀴 제조사 : ");
			wheelA.companyWheel = scanner.nextLine();
			System.out.print("바퀴 가격: ");
			wheelA.cost = Integer.parseInt(scanner.nextLine());
			System.out.print("바퀴 주행거리: ");
			wheelA.distance = Integer.parseInt(scanner.nextLine());
			System.out.print("차 제조사 : ");
			car.companyCar = scanner.nextLine();
			System.out.print("최고속도 : ");
			car.maxSpeed = Integer.parseInt(scanner.nextLine());
			System.out.print("차종 : ");
			car.carType = scanner.nextLine();
			
			System.out.printf("차 %s%n색깔 %s%n바퀴종류 %s%n바퀴제조사 %s%n가격 %d%n주행거리 %d%n차제조사 %s%n최고속도 %d%n차종 %s%n"
					,i,car.color,car.wheel,wheelA.companyWheel,wheelA.cost,wheelA.distance
					,car.companyCar,car.maxSpeed,car.carType);

		}

	}

}
