package java8.defaultmethod;

public class FooImpl implements Foo {

	@Override
	public void getFoo() {
		System.out.println("hi");
	}

	@Override
	public void printFoo() {
		System.out.println("Hello New");
	}

	public static void main(String[] args) {
		Foo foo = new FooImpl();
		foo.getFoo();
		foo.printFoo();
	}
}
