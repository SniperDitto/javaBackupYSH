package bank;


public class BankAccount {
	private String name="";
	private String pw="";
	private int id=0;
	private int balance=0;
	
	public BankAccount() {}
	public BankAccount(String name, String pw, int id,int balance) {
		super();//Î∂?Î™? ?Å¥?ûò?ä§
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.balance = balance;
		if(balance<0)balance=0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		if(balance<0)balance=0;
	}
	@Override
	public String toString() {
		return "?ù¥Î¶? : " + name + "\nÎπÑÎ?Î≤àÌò∏ : " + pw + "\nid : " + id + "\n?ûî?ï° : " + balance;
	}

}
