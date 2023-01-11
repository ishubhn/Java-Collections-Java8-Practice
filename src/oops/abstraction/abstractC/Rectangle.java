package oops.abstraction.abstractC;

public class Rectangle extends Shape {
	int a, b;

	@Override
	public void getArea() {
		System.out.println("Area: " + a * b);
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter: " + 2 * (a + b));
	}
}
