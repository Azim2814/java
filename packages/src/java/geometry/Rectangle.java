package java.geometry;

public class Rectangle {
	private int area,perimeter;

	public Rectangle(int area, int perimeter) {
		super();
		this.area = area;
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Rectangle [area=" + area + ", perimeter=" + perimeter + "]";
	}

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
	
}
