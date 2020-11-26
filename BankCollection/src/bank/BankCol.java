package bank;

import java.util.ArrayList;

public class BankCol {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	public ArrayList<BankAccountCol> account = new ArrayList<BankAccountCol>();
	public String bankName="";
	public String nameLoggedin="";
	public int id=0;//사용자마다 부여되는 고유번호
	private String adminID="admin";
	private String adminPW="1111";
	private String exitName="exit";
	public boolean isAdmin=false;
	public boolean isExit=false;
	
	public BankCol() {}
	
	public BankCol(String bankName) {
		this.bankName = bankName;
	}
	
	@Override
	public String toString() {
		return "은행이름 : "+bankName+", 회원수 : "+account.size();
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
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
		BankCol other = (BankCol) obj;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		return true;
	}

	public int searchIndex(String searchName) {
		int index=0;
		for(int i=0;i<account.size();i++) {
			if(searchName.equals(account.get(i).getName())) {
				index=i;
				break;
			}else {
				index=-1;//없는 계정
			}
		}
		return index;
	}
	public boolean isExist(int index) {
		if(index==-1) {
			System.out.println("존재하지 않는 이름입니다");
			return false;
		}else {
			return true;
		}
	}
	public void addAccountData(BankAccountCol newdata) {
		for(int i=0;i<id;i++) {//사용자명과 id 서로 다른값임, id(고유번호)중복검사
			if(i==newdata.getId()) {
				System.out.println("id가 중복되었습니다\n다른 id를 부여해주세요");
				return;
			}
			if(newdata.getName().equals(account.get(i).getName())) {
				System.out.println("중복된 이름입니다\n다른 이름을 입력해주세요");
				return;
			}
		}
		id++;
		account.add(newdata);
	}
	public void addAccount() {
		System.out.println("<<계정 추가>>");
		System.out.print("이름 : ");
		String newName=scanner.nextLine();
		System.out.print("비밀번호 : ");
		String newPw=scanner.nextLine();
		addAccountData(new BankAccountCol(newName,newPw,id,0));
		System.out.println("추가됨");
	}
	public void delAccount() {
		System.out.println("<<계정 삭제>>");
		System.out.print("삭제할 이름 : ");
		String delName=scanner.nextLine();
		int index=searchIndex(delName);
		if(isExist(index)) {
			account.remove(index);
			System.out.println(delName+" 삭제됨");
		}else {
			System.out.println("삭제할 이름과 일치하는 계정이 없습니다");
		}
		
	}
	public void displayBal(String name) {
		System.out.printf("%s의 잔액 : %d원%n",name,account.get(searchIndex(name)).getBalance());
	}
	public void displayAll() {
		for(int i=0;i<account.size();i++) {
			System.out.println(account.get(i));
			System.out.println("-------------------");
		}
	}
	public void deposit(String name) {
		System.out.println("<<입금>>");
		System.out.print("입금할 금액 입력 : ");
		int dep = Integer.parseInt(scanner.nextLine());
		int index=searchIndex(name);
		if(isExist(index)) {
			account.get(index).setBalance(account.get(index).getBalance()+dep);
		}
	}
	public void withdraw(String name) {
		System.out.println("<<출금>>");
		System.out.print("출금할 금액 입력 : ");
		int wd = Integer.parseInt(scanner.nextLine());
		int index=searchIndex(name);
		if(isExist(index)) {
			if((account.get(index).getBalance()-wd)>0) {
				account.get(index).setBalance(account.get(index).getBalance()-wd);
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}
	}
	
	public void startMenu() {
		System.out.printf("로그인:1, 회원가입:2%n입력 : ");
		int loginInput = Integer.parseInt(scanner.nextLine());
		switch (loginInput) {
		case 1:
			System.out.println("<<로그인>>");
			login();
			break;
		case 2:
			System.out.println("<<회원가입>>");
			addAccount();
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	public void adminLogin() {
		System.out.print("비밀번호 입력 : ");
		String inputPassword = scanner.nextLine();
		if (inputPassword.equals(adminPW)) {
			System.out.println("관리자 로그인");
			isAdmin=true;
			return;
		} else {
			System.out.println("잘못된 비밀번호입니다");
			return;
		}
		
	}
	public void login() {
		System.out.print("사용자명 (exit로 종료): ");
		String inputUsername = scanner.nextLine();
		if(inputUsername.equals(adminID)) {
			adminLogin();
			return;
		}
		if(inputUsername.equals(exitName)) {
			isExit=true;
			return;
		}
		int index=searchIndex(inputUsername);
		if(isExist(index)) {
			System.out.print("비밀번호 입력 : ");
			String inputPassword = scanner.nextLine();
			if(inputPassword.equals(account.get(index).getPw())) {
				System.out.printf("%s님으로 로그인%n", account.get(index).getName());
				nameLoggedin = account.get(index).getName();
				return;
			}else {
				System.out.println("잘못된 비밀번호");
				return;
			}
		}
	}
	public void mainMenu() {
		System.out.println("1.입금 2.출금 3.조회 4.로그아웃");
		System.out.print("원하는 메뉴 입력 : ");
		int menuInput = Integer.parseInt(scanner.nextLine());
		switch (menuInput) {
		case 1:
			deposit(nameLoggedin);
			break;
		case 2:
			withdraw(nameLoggedin);
			break;
		case 3:
			System.out.println("<<조회>>");
			displayBal(nameLoggedin);
			break;
		case 4:
			System.out.printf("%s 로그아웃%n",nameLoggedin);
			nameLoggedin="";
			return;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	public void adminMenu() {
		System.out.println("1.계정추가 2.계정삭제 3.모든사용자정보 4.이름으로 정보 검색 5.종료");
		System.out.print("원하는 메뉴 입력 : ");
		int menuInput = Integer.parseInt(scanner.nextLine());
		switch (menuInput) {
		case 1:
			addAccount();
			break;
		case 2:
			delAccount();
			break;
		case 3:
			System.out.println("<<전체 정보>>");
			displayAll();
			break;
		case 4:
			System.out.println("<<이름으로 정보 검색>>");
			System.out.print("검색할 이름 입력 : ");
			String searchName=scanner.nextLine();
			int index=searchIndex(searchName);
			if(isExist(index)) {
				System.out.println(account.get(index));
			}
			break;
		case 5:
			System.out.println("<<관리자 로그아웃>>");
			isAdmin = false;
			return;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	
	public void runBank() {
		System.out.printf("%s은행 입니다%n",bankName);
		while(isExit==false) {
			
				startMenu();
			
			while(isAdmin==true) {
				adminMenu();
			}
			while(nameLoggedin!="") {
				mainMenu();
			}
				
			
		}
		System.out.printf("%s은행을 이용해 주셔서 감사합니다%n",bankName);

		
	}
}
