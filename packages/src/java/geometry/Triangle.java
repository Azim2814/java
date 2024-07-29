package java.geometry;

public class Triangle {
	private int area,perimeter;

	public Triangle(int area, int perimeter) {
		super();
		this.area = area;
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Triangle [area=" + area + ", perimeter=" + perimeter + "]";
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
