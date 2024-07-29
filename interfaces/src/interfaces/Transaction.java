package interfaces;

public interface Transaction extends Bank{
	Account ac = new Account();
	
	
	public static void Deposit(Account acc,int amount) {
		int newbalance = ac.getBalance() + amount;
		ac.setBalance(newbalance);
		System.out.println("deposit"+newbalance);
	}

}
