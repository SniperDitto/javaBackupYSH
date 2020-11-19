package bank;

public class Bank {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	public int numOfUser=0;
	public BankAccount account[] = new BankAccount[numOfUser];
	public String bankName="";
	public String nameLoggedin="";
	public int id=0;//�궗�슜�옄留덈?�� ?����뿬�릺�?�� ?�좎??踰덊?��
	private String adminID="admin";
	private String adminPW="1111";
	private String exitName="exit";
	public boolean isAdmin=false;
	public boolean isExit=false;
	
	public Bank() {}
	
	public Bank(String bankName) {
		this.bankName = bankName;
		this.numOfUser = 0;
	}
	
	@Override
	public String toString() {
		return "���뻾�씠?���? : "+bankName+", �쉶�썝�닔 : "+numOfUser;
	}

	public int searchIndex(String searchName) {
		int index=0;
		for(int i=0;i<account.length;i++) {
			if(searchName.equals(account[i].getName())) {
				index=i;
				break;
			}else {
				index=-1;//�뾾�뒗 ?�꾩?��
			}
		}
		return index;
	}
	public boolean isExist(int index) {
		if(index==-1) {
			System.out.println("議댁?���븯吏� �븡�뒗 �씠?��꾩엯�땲�떎");
			return false;
		}else {
			return true;
		}
	}
	public void addAccountData(BankAccount newdata) {
		numOfUser++;
		BankAccount tempArr[]=new BankAccount[numOfUser];
		for(int i=0;i<account.length;i++) {
			tempArr[i]=account[i];
		}
		for(int i=0;i<id;i++) {//�궗�슜�옄紐낃?�� id �꽌濡� �떎?��멸컪�엫, id(?�좎??踰덊?��)以묐?��寃��궗
			if(i==newdata.getId()) {
				System.out.println("id媛� 以묐?���릺��?�뒿�땲�떎\n�떎?���? id?���? ?����뿬�빐二?���?�슂");
				break;
			}	
		}
		tempArr[numOfUser-1]=newdata;
		account=tempArr;
	}
	public void addAccount() {
		System.out.println("<<?�꾩?�� ?��붽�>>");
		System.out.print("�씠?���? : ");
		String newName=scanner.nextLine();
		System.out.print("?��꾨�踰덊?�� : ");
		String newPw=scanner.nextLine();
		addAccountData(new BankAccount(newName,newPw,id,0));
		id++;
		System.out.println("?��붽��맖");
	}
	public void delAccount() {
		numOfUser--;
		BankAccount tempArr[]=new BankAccount[numOfUser];
		System.out.println("<<?�꾩?�� �궘�젣>>");
		System.out.print("�궘�젣�븷 �씠?���? : ");
		String delName=scanner.nextLine();
		int index=searchIndex(delName);
		if(isExist(index)) {
			for (int i = 0; i < index; i++) {//寃��깋�맂 index �젣�쇅�븳 �굹?��몄�媛�?�쓣 �깉 �엫�떆諛곗뿴��? ���옣
				tempArr[i] = account[i];
			}
			for (int i = index; i < numOfUser; i++) {
				tempArr[i] = account[i + 1];
			}
			account = tempArr;
			System.out.println("�궘�젣�맖");
		}
		
	}
	public void displayBal(String name) {
		System.out.printf("%s�쓽 �옍�븸 : %d�썝%n",name,account[searchIndex(name)].getBalance());
	}
	public void displayAll() {
		for(int i=0;i<account.length;i++) {
			System.out.println(account[i].toString());
			System.out.println("-------------------");
		}
	}
	public void deposit(String name) {
		System.out.println("<<�엯湲�>>");
		System.out.print("�엯湲덊�? 湲덉�? �엯�젰 : ");
		int dep = Integer.parseInt(scanner.nextLine());
		int index=searchIndex(name);
		if(isExist(index)) {
			account[index].setBalance(account[index].getBalance()+dep);
		}
	}
	public void withdraw(String name) {
		System.out.println("<<?��?��?��>>");
		System.out.print("?��?��?���븷 湲덉�? �엯�젰 : ");
		int wd = Integer.parseInt(scanner.nextLine());
		int index=searchIndex(name);
		if(isExist(index)) {
			if((account[index].getBalance()-wd)>0) {
			account[index].setBalance(account[index].getBalance()-wd);
			}else {
				System.out.println("�옍�븸�씠 ?����?�깊�?�땲�떎");
			}
		}
	}
	
	public void startMenu() {
		System.out.printf("濡쒓?���씤:1, �쉶�썝媛��엯:2%n�엯�젰 : ");
		int loginInput = Integer.parseInt(scanner.nextLine());
		switch (loginInput) {
		case 1:
			System.out.println("<<濡쒓?���씤>>");
			login();
			break;
		case 2:
			System.out.println("<<�쉶�썝媛��엯>>");
			addAccount();
			break;
		default:
			System.out.println("�옒紐삳�? �엯�젰");
			break;
		}
	}
	public void adminLogin() {
		System.out.print("?��꾨�踰덊?�� �엯�젰 : ");
		String inputPassword = scanner.nextLine();
		if (inputPassword.equals(adminPW)) {
			System.out.println("?���由?�옄 濡쒓?���씤");
			isAdmin=true;
			return;
		} else {
			System.out.println("�옒紐삳�? ?��꾨�踰덊?���엯�땲�떎");
			return;
		}
		
	}
	public void login() {
		System.out.print("�궗�슜�옄紐� (exit濡� ?��?���?): ");
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
			System.out.print("?��꾨�踰덊?�� �엯�젰 : ");
			String inputPassword = scanner.nextLine();
			if(inputPassword.equals(account[index].getPw())) {
				System.out.printf("%s�떂�쑝濡� 濡쒓?���씤%n", account[index].getName());
				nameLoggedin = account[index].getName();
				return;
			}else {
				System.out.println("�옒紐삳�? ?��꾨�踰덊?��");
				return;
			}
		}
	}
	public void mainMenu() {
		System.out.println("1.�엯湲� 2.?��?��?�� 3.議고?�� 4.濡쒓?���븘�썐");
		System.out.print("�썝�븯�뒗 硫붾?�� �엯�젰 : ");
		int menuInput = Integer.parseInt(scanner.nextLine());
		switch (menuInput) {
		case 1:
			deposit(nameLoggedin);
			break;
		case 2:
			withdraw(nameLoggedin);
			break;
		case 3:
			System.out.println("<<議고?��>>");
			displayBal(nameLoggedin);
			break;
		case 4:
			System.out.printf("%s 濡쒓?���븘�썐%n",nameLoggedin);
			nameLoggedin="";
			return;
		default:
			System.out.println("�옒紐삳�? �엯�젰");
			break;
		}
	}
	public void adminMenu() {
		System.out.println("1.?�꾩?��?��붽� 2.?�꾩?���궘�젣 3.紐⑤뱺�궗�?���옄�젙蹂� 4.�씠?��꾩쑝濡� �젙蹂� 寃��깋 5.?��?���?");
		System.out.print("�썝�븯�뒗 硫붾?�� �엯�젰 : ");
		int menuInput = Integer.parseInt(scanner.nextLine());
		switch (menuInput) {
		case 1:
			addAccount();
			break;
		case 2:
			delAccount();
			break;
		case 3:
			System.out.println("<<�쟾泥� �젙蹂�>>");
			displayAll();
			break;
		case 4:
			System.out.println("<<�씠?��꾩쑝濡� �젙蹂� 寃��깋>>");
			System.out.print("寃��깋�븷 �씠?���? �엯�젰 : ");
			String searchName=scanner.nextLine();
			int index=searchIndex(searchName);
			if(isExist(index)) {
				System.out.println(account[index].toString());
			}
			break;
		case 5:
			System.out.println("<<?���由?�옄 濡쒓?���븘�썐>>");
			isAdmin = false;
			return;
		default:
			System.out.println("�옒紐삳�? �엯�젰");
			break;
		}
	}
	
	public void runBank() {
		System.out.printf("%s���뻾 �엯�땲�떎%n",bankName);
		while(isExit==false) {
			startMenu();
			while(isAdmin) {
				adminMenu();
			}
			while(nameLoggedin!="") {
				mainMenu();
			}
		}
		System.out.printf("%s���뻾�쓣 �씠�슜�빐 二쇱?���? 媛먯궗��?�땲�떎%n",bankName);

		
	}
	
	
}
