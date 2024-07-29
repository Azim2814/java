package java.geometry;

public class Circle {
	private int area,perimeter;

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Circle [area=" + area + ", perimeter=" + perimeter + "]";
	}

	public Circle(int area, int perimeter) {
		
		this.area = area;
		this.perimeter = perimeter;
		//int result = (area*perimeter);
		
		//System.out.println("result is",+result);
	}
	

}
