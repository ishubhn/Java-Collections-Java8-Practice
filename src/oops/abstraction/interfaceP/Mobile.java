package oops.abstraction.interfaceP;

public class Mobile implements Callable {
	@Override
	public void getCall() {
		System.out.println("Play ringtone");
	}

	@Override
	public void getDeviceName() {
		System.out.println("It's Mobile");
	}
}
