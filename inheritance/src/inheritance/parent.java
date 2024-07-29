package inheritance;

public class parent {
	private int amt;

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "parent [amt=" + amt + "]";
	}
	
}
