package dto;

public class AccountDTO {
	private long accID;
	private String name;
	private String pw;
	private int balance=0;
	
	public AccountDTO() {}
	public AccountDTO(long accID, String name, String pw, int balance) {
		super();
		this.accID = accID;
		this.name = name;
		this.pw = pw;
		if(balance<0)balance=0;
		this.balance = balance;
	}
	public long getAccID() {
		return accID;
	}
	public void setAccID(long accID) {
		this.accID = accID;
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<0)balance=0;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountDTO [accID=" + accID + ", name=" + name + ", pw=" + pw + ", balance=" + balance + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accID ^ (accID >>> 32));
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
		AccountDTO other = (AccountDTO) obj;
		if (accID != other.accID)
			return false;
		return true;
	}
	
	
	
	
	
}
