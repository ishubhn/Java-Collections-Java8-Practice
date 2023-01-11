package oops.abstraction.abstractC;

public class Triangle extends Shape {
	int length, height;

	@Override
	public void getArea() {
		System.out.println("Area: " + 0.5 * length * height);
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter: " + 0);
	}
}
