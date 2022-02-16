package Chapter8;

public class Rectangle {
	private double length = 1;
	private double width = 1;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (length < 0.0 || length >= 20.0) {
			throw new IllegalArgumentException(
			"length was out of range");
		}
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width < 0.0 || width >= 20.0) {
			throw new IllegalArgumentException(
			"width was out of range");
		}
		this.width = width;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}

}
