package com.human.ex;

import com.human.dto.Box;
import com.human.dto.House;
import com.human.dto.Movie;

public class ClassPractice1 {

	public static void main(String[] args) {
		Box boxA=new Box();
		boxA.name="A";
		boxA.color="green";
		boxA.weight=30;
		boxA.height=10;
		boxA.width=5;
		boxA.length=8;
		Box boxB=new Box();
		boxB.name="B";
		boxB.color="yellow";
		boxB.weight=40;
		boxB.height=20;
		boxB.width=15;
		boxB.length=5;
		House houseA=new House();
		houseA.owner="Steve";
		houseA.address="Cheonan";
		houseA.floor=14;
		houseA.price=1000000;
		Movie movieA=new Movie();
		movieA.name="asdf";
		movieA.director="John";
		movieA.mainActor="Nick";
		movieA.runningTime=120;
		
		
		System.out.printf("Box1%nName:%s Color:%s Weight:%d ",boxA.name,boxA.color,boxA.weight);
		System.out.printf("Height:%d Width:%d Length:%d%n",boxA.height,boxA.width,boxA.length);
		System.out.printf("Box2%nName:%s Color:%s Weight:%d ",boxB.name,boxB.color,boxB.weight);
		System.out.printf("Height:%d Width:%d Length:%d%n",boxB.height,boxB.width,boxB.length);
		System.out.printf("House%nOwner:%s Address:%s Floor:%d Price:%d%n",houseA.owner,houseA.address,houseA.floor,houseA.price);
		System.out.printf("Movie%nName:%s Director:%s Mainactor:%s Runningtime:%d%n",movieA.name,movieA.director,movieA.mainActor,movieA.runningTime);
		
	}

}
