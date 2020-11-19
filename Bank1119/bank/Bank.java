package bank;

public class Bank {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	public int numOfUser=0;
	public BankAccount account[] = new BankAccount[numOfUser];
	public String bankName="";
	public String nameLoggedin="";
	public int id=0;//ï¿½ê¶—ï¿½ìŠœï¿½ì˜„ï§ëˆ?– ?ºï¿½ï¿½ë¿¬ï¿½ë¦ºï¿½?’— ?¨ì¢??è¸°ëŠ?ƒ‡
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
		return "ï¿½ï¿½ï¿½ë»¾ï¿½ì” ?”±ï¿? : "+bankName+", ï¿½ì‰¶ï¿½ìï¿½ë‹” : "+numOfUser;
	}

	public int searchIndex(String searchName) {
		int index=0;
		for(int i=0;i<account.length;i++) {
			if(searchName.equals(account[i].getName())) {
				index=i;
				break;
			}else {
				index=-1;//ï¿½ë¾¾ï¿½ë’— ?¨ê¾©? ™
			}
		}
		return index;
	}
	public boolean isExist(int index) {
		if(index==-1) {
			System.out.println("è­°ëŒ?˜±ï¿½ë¸¯ï§ï¿½ ï¿½ë¸¡ï¿½ë’— ï¿½ì” ?”±ê¾©ì—¯ï¿½ë•²ï¿½ë–");
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
		for(int i=0;i<id;i++) {//ï¿½ê¶—ï¿½ìŠœï¿½ì˜„ï§ë‚ƒ?‚µ id ï¿½ê½Œæ¿¡ï¿½ ï¿½ë–?‘œë©¸ì»ªï¿½ì—«, id(?¨ì¢??è¸°ëŠ?ƒ‡)ä»¥ë¬?‚¬å¯ƒï¿½ï¿½ê¶—
			if(i==newdata.getId()) {
				System.out.println("idåª›ï¿½ ä»¥ë¬?‚¬ï¿½ë¦ºï¿½ë?ï¿½ë’¿ï¿½ë•²ï¿½ë–\nï¿½ë–?‘œï¿? id?‘œï¿? ?ºï¿½ï¿½ë¿¬ï¿½ë¹äºŒ?‡±ê½?ï¿½ìŠ‚");
				break;
			}	
		}
		tempArr[numOfUser-1]=newdata;
		account=tempArr;
	}
	public void addAccount() {
		System.out.println("<<?¨ê¾©? ™ ?•°ë¶½ï¿½>>");
		System.out.print("ï¿½ì” ?”±ï¿? : ");
		String newName=scanner.nextLine();
		System.out.print("?®ê¾¨ï¿½è¸°ëŠ?ƒ‡ : ");
		String newPw=scanner.nextLine();
		addAccountData(new BankAccount(newName,newPw,id,0));
		id++;
		System.out.println("?•°ë¶½ï¿½ï¿½ë§–");
	}
	public void delAccount() {
		numOfUser--;
		BankAccount tempArr[]=new BankAccount[numOfUser];
		System.out.println("<<?¨ê¾©? ™ ï¿½ê¶˜ï¿½ì £>>");
		System.out.print("ï¿½ê¶˜ï¿½ì £ï¿½ë¸· ï¿½ì” ?”±ï¿? : ");
		String delName=scanner.nextLine();
		int index=searchIndex(delName);
		if(isExist(index)) {
			for (int i = 0; i < index; i++) {//å¯ƒï¿½ï¿½ê¹‹ï¿½ë§‚ index ï¿½ì £ï¿½ì‡…ï¿½ë¸³ ï¿½êµ¹?™’ëª„ï¿½åª›ë?ªì“£ ï¿½ê¹‰ ï¿½ì—«ï¿½ë–†è«›ê³—ë¿´ï¿½ë¿? ï¿½ï¿½ï¿½ì˜£
				tempArr[i] = account[i];
			}
			for (int i = index; i < numOfUser; i++) {
				tempArr[i] = account[i + 1];
			}
			account = tempArr;
			System.out.println("ï¿½ê¶˜ï¿½ì £ï¿½ë§–");
		}
		
	}
	public void displayBal(String name) {
		System.out.printf("%sï¿½ì“½ ï¿½ì˜ï¿½ë¸¸ : %dï¿½ì%n",name,account[searchIndex(name)].getBalance());
	}
	public void displayAll() {
		for(int i=0;i<account.length;i++) {
			System.out.println(account[i].toString());
			System.out.println("-------------------");
		}
	}
	public void deposit(String name) {
		System.out.println("<<ï¿½ì—¯æ¹²ï¿½>>");
		System.out.print("ï¿½ì—¯æ¹²ëŠë¸? æ¹²ë‰ë¸? ï¿½ì—¯ï¿½ì ° : ");
		int dep = Integer.parseInt(scanner.nextLine());
		int index=searchIndex(name);
		if(isExist(index)) {
			account[index].setBalance(account[index].getBalance()+dep);
		}
	}
	public void withdraw(String name) {
		System.out.println("<<?•°?’“?ˆ‘>>");
		System.out.print("?•°?’“?ˆ‘ï¿½ë¸· æ¹²ë‰ë¸? ï¿½ì—¯ï¿½ì ° : ");
		int wd = Integer.parseInt(scanner.nextLine());
		int index=searchIndex(name);
		if(isExist(index)) {
			if((account[index].getBalance()-wd)>0) {
			account[index].setBalance(account[index].getBalance()-wd);
			}else {
				System.out.println("ï¿½ì˜ï¿½ë¸¸ï¿½ì”  ?ºï¿½è?°ê¹Šë¹?ï¿½ë•²ï¿½ë–");
			}
		}
	}
	
	public void startMenu() {
		System.out.printf("æ¿¡ì’“? ‡ï¿½ì”¤:1, ï¿½ì‰¶ï¿½ìåª›ï¿½ï¿½ì—¯:2%nï¿½ì—¯ï¿½ì ° : ");
		int loginInput = Integer.parseInt(scanner.nextLine());
		switch (loginInput) {
		case 1:
			System.out.println("<<æ¿¡ì’“? ‡ï¿½ì”¤>>");
			login();
			break;
		case 2:
			System.out.println("<<ï¿½ì‰¶ï¿½ìåª›ï¿½ï¿½ì—¯>>");
			addAccount();
			break;
		default:
			System.out.println("ï¿½ì˜’ï§ì‚³ë§? ï¿½ì—¯ï¿½ì °");
			break;
		}
	}
	public void adminLogin() {
		System.out.print("?®ê¾¨ï¿½è¸°ëŠ?ƒ‡ ï¿½ì—¯ï¿½ì ° : ");
		String inputPassword = scanner.nextLine();
		if (inputPassword.equals(adminPW)) {
			System.out.println("?„¿ï¿½ç”±?Šì˜„ æ¿¡ì’“? ‡ï¿½ì”¤");
			isAdmin=true;
			return;
		} else {
			System.out.println("ï¿½ì˜’ï§ì‚³ë§? ?®ê¾¨ï¿½è¸°ëŠ?ƒ‡ï¿½ì—¯ï¿½ë•²ï¿½ë–");
			return;
		}
		
	}
	public void login() {
		System.out.print("ï¿½ê¶—ï¿½ìŠœï¿½ì˜„ï§ï¿½ (exitæ¿¡ï¿½ ?†«?‚…ì¦?): ");
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
			System.out.print("?®ê¾¨ï¿½è¸°ëŠ?ƒ‡ ï¿½ì—¯ï¿½ì ° : ");
			String inputPassword = scanner.nextLine();
			if(inputPassword.equals(account[index].getPw())) {
				System.out.printf("%sï¿½ë–‚ï¿½ì‘æ¿¡ï¿½ æ¿¡ì’“? ‡ï¿½ì”¤%n", account[index].getName());
				nameLoggedin = account[index].getName();
				return;
			}else {
				System.out.println("ï¿½ì˜’ï§ì‚³ë§? ?®ê¾¨ï¿½è¸°ëŠ?ƒ‡");
				return;
			}
		}
	}
	public void mainMenu() {
		System.out.println("1.ï¿½ì—¯æ¹²ï¿½ 2.?•°?’“?ˆ‘ 3.è­°ê³ ?‰¶ 4.æ¿¡ì’“? ‡ï¿½ë¸˜ï¿½ì");
		System.out.print("ï¿½ìï¿½ë¸¯ï¿½ë’— ï§ë¶¾?± ï¿½ì—¯ï¿½ì ° : ");
		int menuInput = Integer.parseInt(scanner.nextLine());
		switch (menuInput) {
		case 1:
			deposit(nameLoggedin);
			break;
		case 2:
			withdraw(nameLoggedin);
			break;
		case 3:
			System.out.println("<<è­°ê³ ?‰¶>>");
			displayBal(nameLoggedin);
			break;
		case 4:
			System.out.printf("%s æ¿¡ì’“? ‡ï¿½ë¸˜ï¿½ì%n",nameLoggedin);
			nameLoggedin="";
			return;
		default:
			System.out.println("ï¿½ì˜’ï§ì‚³ë§? ï¿½ì—¯ï¿½ì °");
			break;
		}
	}
	public void adminMenu() {
		System.out.println("1.?¨ê¾©? ™?•°ë¶½ï¿½ 2.?¨ê¾©? ™ï¿½ê¶˜ï¿½ì £ 3.ï§â‘¤ë±ºï¿½ê¶—ï¿½?Šœï¿½ì˜„ï¿½ì ™è¹‚ï¿½ 4.ï¿½ì” ?”±ê¾©ì‘æ¿¡ï¿½ ï¿½ì ™è¹‚ï¿½ å¯ƒï¿½ï¿½ê¹‹ 5.?†«?‚…ì¦?");
		System.out.print("ï¿½ìï¿½ë¸¯ï¿½ë’— ï§ë¶¾?± ï¿½ì—¯ï¿½ì ° : ");
		int menuInput = Integer.parseInt(scanner.nextLine());
		switch (menuInput) {
		case 1:
			addAccount();
			break;
		case 2:
			delAccount();
			break;
		case 3:
			System.out.println("<<ï¿½ìŸ¾ï§£ï¿½ ï¿½ì ™è¹‚ï¿½>>");
			displayAll();
			break;
		case 4:
			System.out.println("<<ï¿½ì” ?”±ê¾©ì‘æ¿¡ï¿½ ï¿½ì ™è¹‚ï¿½ å¯ƒï¿½ï¿½ê¹‹>>");
			System.out.print("å¯ƒï¿½ï¿½ê¹‹ï¿½ë¸· ï¿½ì” ?”±ï¿? ï¿½ì—¯ï¿½ì ° : ");
			String searchName=scanner.nextLine();
			int index=searchIndex(searchName);
			if(isExist(index)) {
				System.out.println(account[index].toString());
			}
			break;
		case 5:
			System.out.println("<<?„¿ï¿½ç”±?Šì˜„ æ¿¡ì’“? ‡ï¿½ë¸˜ï¿½ì>>");
			isAdmin = false;
			return;
		default:
			System.out.println("ï¿½ì˜’ï§ì‚³ë§? ï¿½ì—¯ï¿½ì °");
			break;
		}
	}
	
	public void runBank() {
		System.out.printf("%sï¿½ï¿½ï¿½ë»¾ ï¿½ì—¯ï¿½ë•²ï¿½ë–%n",bankName);
		while(isExit==false) {
			startMenu();
			while(isAdmin) {
				adminMenu();
			}
			while(nameLoggedin!="") {
				mainMenu();
			}
		}
		System.out.printf("%sï¿½ï¿½ï¿½ë»¾ï¿½ì“£ ï¿½ì” ï¿½ìŠœï¿½ë¹ äºŒì‡±?›ï¿½ê½? åª›ë¨¯ê¶—ï¿½ë¹?ï¿½ë•²ï¿½ë–%n",bankName);

		
	}
	
	
}
