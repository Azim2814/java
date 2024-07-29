package inheritance;

public class Rectangle {
	private int lenght,breadth;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", breadth=" + breadth + "]";
	}
	public int Rectangle() {
		int area = lenght * breadth;
		//return area;
		return area;
	}
}
