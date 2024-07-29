import java.util.ArrayList;

public class demogenerics {

	public static void main(String[] args) {
		Generics1<Integer,String> gc = new Generics1<Integer, String>();
//		Generics1<Double,Integer> gc1 = new Generics1<Double, Integer>();
//		gc.setData(10);
//		gc.setData1("hello");
//		gc1.setData(100.20);
//		gc1.setData1(500);
//		System.out.println(gc);
//		System.out.println(gc1);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(121);
		System.out.println();
	}

}
