package verify.exam20;

public class Account {
	
	private String accountNumber;
	private String accountName;
	private int balace;
	
	public Account(String accountNumber, String accountName, int balace) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balace = balace;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalace() {
		return balace;
	}
	public void setBalace(int balace) {
		this.balace = balace;
	}
	
	
	
	
}
