package inheritance;

public class Square extends Rectangle{
	public static void main(String[] args) {
		Square s = new Square();
		s.setLenght(5);
		s.setBreadth(5);
		public int Square() {
			int area = s.getBreadth() * s.getLenght();
			return area;
		}
		System.out.println("area of rectangle"+s.Rectangle());
		//System.out.println("area of square"+s.);
		
		
	}
}
