package userdefinedexception;

public class LessWithdrawAmountException extends Exception {
	public LessWithdrawAmountException () {
		System.out.println("withdrawal amount should be more then 1000");
	}
	public LessWithdrawAmountException(String msg) {
		System.out.println(msg);
	}
}
