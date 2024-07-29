package interfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
	
		a.setAcc_name("azim");
		a.setEmail("az");
		a.setBalance(1000);
		
		Transaction.Deposit(a,2000);
		
		
		

	}

	@Override
	public String toString() {
		return "Test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
