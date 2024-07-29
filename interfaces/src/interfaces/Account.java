package interfaces;

public class Account {
	private int Balance;
	private String Acc_name,email;
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public String getAcc_name() {
		return Acc_name;
	}
	public void setAcc_name(String acc_name) {
		Acc_name = acc_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Account [Balance=" + Balance + ", Acc_name=" + Acc_name + ", email=" + email + "]";
	}
	
}
