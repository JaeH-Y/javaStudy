package sec01.exam04;

public class AirPlaneExample {
	public static void main(String[] args) {
		SuperSonicAirPlane sonicAir = new SuperSonicAirPlane();

		
		sonicAir.takeOff();
		sonicAir.fly();
		sonicAir.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sonicAir.fly();
		sonicAir.flyMode = SuperSonicAirPlane.NORMAL;
		sonicAir.fly();
		sonicAir.land();
		
	}
}
