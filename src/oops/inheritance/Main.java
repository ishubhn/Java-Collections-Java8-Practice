package oops.inheritance;

public class Main {
	/*
				Vehicle
				 /     \
	            /       \
		TwoWheeler      Electric
							\
							Tiago
   */

	public static void main(String[] args) {
//		TwoWheeler ve = new TwoWheeler();
//		System.out.println("Two Wheeler");
////		((TwoWheeler) ve).getWheels();
//		ve.blowHorn();
//		ve.getWheels();
//		ve.fillFuel();

		System.out.println();
		System.out.println("Electric Vehicle");
		ElectricVehicle ev = new ElectricVehicle();
		System.out.println(ev.rtoCode);
		ev.fillFuel();

		System.out.println();
		System.out.println("Tiago");
		Tiago tg = new Tiago();
		tg.fillFuel();
		tg.getWheels();

	}
}
