package userdefinedexception;

public class Bank {
	private String accname;
	private int balance;
	private int Withdraw;
	
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void Withdraw(int Withdraw) {
		try {
			if (Withdraw <1000) {
				throw new LessWithdrawAmountException("withdrawal amount should be more then 1000");
				
			}
			else {
				this.setWithdraw(Withdraw);
			}
		} catch (LessWithdrawAmountException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public int getWithdraw() {
		return Withdraw;
	}
	@Override
	public String toString() {
		return "Bank [accname=" + accname + ", balance=" + balance + ", Withdraw=" + Withdraw + "]";
	}
	public void setWithdraw(int withdraw) {
		Withdraw = withdraw;
	}
	
}
