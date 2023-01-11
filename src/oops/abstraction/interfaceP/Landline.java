package oops.abstraction.interfaceP;

public class Landline implements Callable {
	@Override
	public void getCall() {
		System.out.println("Tring Tring!");
	}

	@Override
	public void getDeviceName() {
		System.out.println("It's LandLine!");
	}
}
