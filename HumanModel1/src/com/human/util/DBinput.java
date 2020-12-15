package com.human.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DBinput {
	static Scanner sc = new Scanner(System.in);
	
	public static int inputInt() {
		int num=0;
		System.out.print("정수 입력  : ");
		try {
			num = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}finally {
			
		}
		return num;
	}
	
	public static Double inputDouble() {
		Double num=null;
		System.out.print("실수 입력  : ");
		try {
			num = Double.parseDouble(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return num;
	}

	public static String inputString() {
		String str=null;
		System.out.print("문자열 입력  : ");
		str = sc.nextLine();
		return str;
	}
	
	public static Date inputDate() {
		Date d=null;
		System.out.println("날짜 입력(yyyy-mm-dd hh24:mi:ss : ");
		SimpleDateFormat transFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String input = sc.nextLine();
		try {
			d=transFormat.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public static String dateToString(Date d) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return df.format(d);
	}
}
