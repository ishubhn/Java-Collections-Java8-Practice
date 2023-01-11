package oops.abstraction.interfaceP;

import javax.management.monitor.Monitor;

public class Main {
	public static void main(String[] args) {
		System.out.println("Mobile");
		Callable mb = new Mobile();
		mb.getCall();
		mb.getDeviceName();

		System.out.println();
		System.out.println("Landline device");
		Callable ld = new Landline();       // if parent class is interface (Callable at left side)
											// doesnt affect implementation
		ld.getCall();
		ld.getDeviceName();
	}
}
