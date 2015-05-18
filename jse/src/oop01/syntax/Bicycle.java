package oop01.syntax;

public class Bicycle {
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	private static int numberOfBicycle = 0;
	
	public Bicycle(int cadence, int gear, int speed, int id) {
		super();
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
		this.id = id;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
