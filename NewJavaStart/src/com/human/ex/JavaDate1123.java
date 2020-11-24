package com.human.ex;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class JavaDate1123 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime localDateTime1 = localDateTime.plusMonths(2);
		System.out.println(localDateTime1);
		LocalDateTime localDateTime2 = localDateTime.minusDays(3);
		System.out.println(localDateTime2);
		LocalDateTime localDateTime3 = LocalDateTime.of(2020,3,4,0,0);
		System.out.println(localDateTime3);
		
		
		Duration duration = Duration.between(localDateTime1, localDateTime3);
		System.out.println(duration.getSeconds());
		
		System.out.println(date.getTime());
		Date date1=new Date(date.getTime()-(1*24*60*60*1000));
		System.out.println(date1);
		long dateDifference=date1.getTime()-date.getTime();
		System.out.println(dateDifference);
		Date date2=new Date(1000);
		dateDifference=date2.getTime()-date.getTime();
		
		
		
		
		
		
		
	}

}
