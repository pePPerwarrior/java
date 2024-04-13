package tw.org.iii.apis;

public class Bike {
	public double speed ;
	
	public double upSpeed() {
		speed = speed + 2;
		return speed;

	}
	
	public void downSpeed() {
		speed = speed - 1;
	}
	
}
