class NeedForSpeed {

	private final int speed;
	private final int batteryDrain;
	private int batteryLevel;
	private int distanceCovered;

	NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
		this.batteryLevel = 100;
		this.distanceCovered = 0;
	}

	public boolean batteryDrained() {
		return batteryLevel < batteryDrain;
	}

	public int distanceDriven() {
		return distanceCovered;
	}

	public void drive() {
		if (batteryDrained()) return;

		batteryLevel -= batteryDrain;
		distanceCovered += speed;
	}

	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public int getSpeed() {
		return speed;
	}

	public int getBatteryDrain() {
		return batteryDrain;
	}
}

class RaceTrack {

	private final int distance;

	RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean canFinishRace(NeedForSpeed car) {
		double drivesNeeded = (double) distance / car.getSpeed();

		return car.getBatteryDrain() * drivesNeeded <= car.getBatteryLevel();
	}
}
