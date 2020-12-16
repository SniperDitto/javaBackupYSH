package dto;

public class BankDTO {
	private long bankID;
	private String bankName;
	private long accID;
	
	public BankDTO() {}

	public BankDTO(long bankID, String bankName, long accID) {
		super();
		this.bankID = bankID;
		this.bankName = bankName;
		this.accID = accID;
	}

	public long getBankID() {
		return bankID;
	}

	public void setBankID(long bankID) {
		this.bankID = bankID;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccID() {
		return accID;
	}

	public void setAccID(long accID) {
		this.accID = accID;
	}

	@Override
	public String toString() {
		return "BankDTO [bankID=" + bankID + ", bankName=" + bankName + ", accID=" + accID + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accID ^ (accID >>> 32));
		result = prime * result + (int) (bankID ^ (bankID >>> 32));
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
		BankDTO other = (BankDTO) obj;
		if (accID != other.accID)
			return false;
		if (bankID != other.bankID)
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		return true;
	}
	
	
	
}
