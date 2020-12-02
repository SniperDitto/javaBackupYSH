package bank;

public class BankAccountCol {
	private String name="";
	private String pw="";
	private int id=0;
	private int balance=0;
	
	public BankAccountCol() {}
	public BankAccountCol(String name, String pw, int id,int balance) {
		super();//부모 클래스
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
		return "이름 : " + name + "\n비밀번호 : " + pw + "\nid : " + id + "\n잔액 : " + balance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {//이름으로 중복확인
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccountCol other = (BankAccountCol) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
