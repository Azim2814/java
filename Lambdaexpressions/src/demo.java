
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculate c = () -> System.out.println(2+14);
//		c.getsum();
		
		Bank b = (int bal,String name) -> {
			System.out.println("hii "+name);
			int k = bal+2000;
			System.out.println("your balance is "+k);
			return k;
		};
		int r = b.getdeposit(3000,"Azim");
	}

}
