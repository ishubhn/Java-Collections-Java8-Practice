package java8.defaultmethod;

@FunctionalInterface
public interface Foo {
	public void getFoo();

	public default void printFoo() {
		System.out.println("Hello World!");
	}
}
