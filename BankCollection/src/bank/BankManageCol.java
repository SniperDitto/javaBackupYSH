package bank;

import java.util.ArrayList;

public class BankManageCol {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	public String bankNow="";
	public boolean isBankAdmin=false;
	public boolean isBankExit=false;
	public boolean isBankUser=true;
	public ArrayList<BankCol> banks=new ArrayList<BankCol>();
	
	public BankManageCol() {}
	
	public int searchBankIndex(String name) {
		int index=-1;//bankName기본값과 bankNow기본값이 같아서("")
		for(int i=0;i<banks.size();i++) {
			if(banks.get(i).bankName.equals(name)) {
				index=i;
				break;
			}else {
				index=-1;//없는 이름
			}
		}
		return index;
	}
	public boolean isExistBank(int index) {
		if(index==-1) {
			System.out.println("존재하지 않는 은행입니다");
			return false;
		}else {
			return true;
		}
	}
	public void addBankData(BankCol newdata) {
		for(BankCol b:banks) {
			if(b.bankName.equals(newdata.bankName)){
				System.out.println("이미 존재하는 은행이름입니다");
				break;
			}
		}
		banks.add(newdata);
	}
	public void addBank() {
		System.out.println("<<은행 추가>>");
		System.out.print("이름 : ");
		String newName=scanner.nextLine();
		addBankData(new BankCol(newName));
		System.out.println("추가됨");
	}
	public void delBank() {
		System.out.println("<<은행 삭제>>");
		System.out.print("삭제할 이름 : ");
		String delName=scanner.nextLine();
		int index=searchBankIndex(delName);
		if(isExistBank(index)) {
			banks.remove(index);
			System.out.println(delName+" 삭제됨");
		}
	}
	public void displayBank() {
		for(int i=0;i<banks.size();i++) {
			System.out.println(banks.get(i).toString());
		}
	}
	
	public void bankAdmin() {
		System.out.println("관리자 메뉴");
		System.out.print("1.은행추가 2.은행삭제 3.은행정보 4.이전 메뉴로\n>>");
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
			System.out.println("잘못된 입력");
			break;
		}
	}
	public void bankLogin() {
		System.out.print("원하는 은행을 입력하세요(exit로 종료) : ");
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
				banks.get(index).runBank();
				banks.get(index).isExit=false;
				return;
			}else {
				System.out.println("은행을 추가하겠습니까?");
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
		System.out.println("은행관리종료");
	}
}
