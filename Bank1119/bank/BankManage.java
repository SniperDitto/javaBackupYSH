package bank;

import bank.Bank;

public class BankManage {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	public int numOfBank=0;
	public String bankNow="";
	public boolean isBankAdmin=false;
	public boolean isBankExit=false;
	public boolean isBankUser=true;
	public Bank banks[] = new Bank[numOfBank];
	
	public BankManage() {}
	
	public int searchBankIndex(String name) {
		int index=-1;//bankNameê¸°ë³¸ê°’ê³¼ bankNowê¸°ë³¸ê°’ì´ ê°™ì•„?„œ
		for(int i=0;i<banks.length;i++) {
			if(name.equals(banks[i].bankName)) {
				index=i;
				break;
			}else {
				index=-1;//?—†?Š” ?´ë¦?
			}
		}
		return index;
	}
	public boolean isExistBank(int index) {
		if(index==-1) {
			System.out.println("ì¡´ì¬?•˜ì§? ?•Š?Š” ???–‰?…?‹ˆ?‹¤");
			return false;
		}else {
			return true;
		}
	}
	public void addBankData(Bank newdata) {
		numOfBank++;
		Bank tempArr[]=new Bank[numOfBank];
		for(int i=0;i<banks.length;i++) {
			tempArr[i]=banks[i];
		}
		tempArr[numOfBank-1]=newdata;
		banks=tempArr;
	}
	public void addBank() {
		System.out.println("<<???–‰ ì¶”ê?>>");
		System.out.print("?´ë¦? : ");
		String newName=scanner.nextLine();
		addBankData(new Bank(newName));
		System.out.println("ì¶”ê??¨");
	}
	public void delBank() {
		numOfBank--;
		Bank tempArr[]=new Bank[numOfBank];
		System.out.println("<<???–‰ ?‚­? œ>>");
		System.out.print("?‚­? œ?•  ?´ë¦? : ");
		String delName=scanner.nextLine();
		int index=searchBankIndex(delName);
		if(isExistBank(index)) {
			for (int i = 0; i < index; i++) {//ê²??ƒ‰?œ index ? œ?™¸?•œ ?‚˜ë¨¸ì?ê°’ì„ ?ƒˆ ?„?‹œë°°ì—´?— ???¥
				tempArr[i] = banks[i];
			}
			for (int i = index; i < numOfBank; i++) {
				tempArr[i] = banks[i + 1];
			}
			banks = tempArr;
		System.out.println("?‚­? œ?¨");
		}
	}
	public void displayBank() {
		for(int i=0;i<numOfBank;i++) {
			System.out.println(banks[i].toString());
		}
	}
	
	public void bankAdmin() {
		System.out.println("ê´?ë¦¬ì ë©”ë‰´");
		System.out.print("1.???–‰ì¶”ê? 2.???–‰?‚­? œ 3.???–‰? •ë³? 4.?´? „ ë©”ë‰´ë¡?\n>>");
		int inputMenu=Integer.parseInt(scanner.nextLine());
		switch (inputMenu) {
		case 1:
			addBank();
			break;
		case 2:
			delBank();
			break;
		case 3:
			displayBank();
			break;
		case 4:
			isBankAdmin=false;
			return;
		default:
			System.out.println("?˜ëª»ëœ ?…? ¥");
			break;
		}
	}
	public void bankLogin() {
		System.out.print("?›?•˜?Š” ???–‰?„ ?…? ¥?•˜?„¸?š”(exitë¡? ì¢…ë£Œ) : ");
			String inputBankName=scanner.nextLine();
			if(inputBankName.equals("exit")) {
				isBankExit=true;
				return;
			}
			if(inputBankName.equals("admin")) {
				isBankAdmin=true;
				return;
			}
			int index = searchBankIndex(inputBankName);
			if(isExistBank(index)) {
				bankNow=inputBankName;
				banks[index].runBank();
				banks[index].isExit=false;
				return;
			}else {
				System.out.println("???–‰?„ ì¶”ê??•˜ê² ìŠµ?‹ˆê¹??");
				System.out.print("1: yes 2: no >>");
				int inputLogin=Integer.parseInt(scanner.nextLine());
				if(inputLogin==1) {
					addBank();
				}else {
					return;
				}
			}
			
	}
	
	public void runBankManage() {
		while(isBankExit==false) {
			bankLogin();
			while(isBankAdmin) {
				bankAdmin();
			}
		}
		System.out.println("???–‰ê´?ë¦¬ì¢…ë£?");
	}
	
	
}
