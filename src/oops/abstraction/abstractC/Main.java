package oops.abstraction.abstractC;

public class Main {
	public static void main(String[] args) {
		System.out.println("Triangle");
		Triangle tg = new Triangle();
		tg.length = 2;
		tg.height = 1;
		tg.getArea();
		tg.getPerimeter();
		tg.getParentClassName();

		System.out.println("Rectangle");
		Rectangle re = new Rectangle();
		re.b = 12;
		re.a = 10;
		re.getArea();
		re.getPerimeter();
		re.getParentClassName();
	}
}
