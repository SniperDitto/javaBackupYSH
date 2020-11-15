package com.human.dto;

public class BankAccount {
	public String name="";//문제에서 말하는 id=사용자명
	public String pw="";
	public int id=0;//문제에서 말하는 id와 다른값
	public int balance=0;
	
	
	public BankAccount() {
		
	}
	public BankAccount(String name, String pw, int id,int balance) {
		super();
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.balance = balance;
	}
	//toString
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", pw=" + pw + ", id=" + id + ", balance=" + balance+"]";
	}

//	public @Override
//	public boolean equals(Object obj) {
//		
//		return super.equals(obj);
//	} 
	
	
	
}
