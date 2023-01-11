package pattern.design.singleton;

public class SingletonClass {
	private static SingletonClass thisInstance = null;

	String s;

	private SingletonClass() {
		s = "Hello World";
		System.out.println(s);
	}

	public static SingletonClass getInstance() {
		if (thisInstance == null) {
			thisInstance = new SingletonClass();
		}
		return thisInstance;
	}
}