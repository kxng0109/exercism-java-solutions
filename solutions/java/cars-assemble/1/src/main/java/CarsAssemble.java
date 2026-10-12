public class CarsAssemble {

	public double productionRatePerHour(int speed) {
		final int PRODUCTION_PER_HOUR = 221;
		return speed * PRODUCTION_PER_HOUR * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
		final int MINUTES_PER_HOUR = 60;
		return (int) (productionRatePerHour(speed) / MINUTES_PER_HOUR);
    }

	private double getSuccessRate(int speed){
		if(speed >= 1 && speed <= 4) return 1.00;
		else if(speed >= 5 && speed <= 8) return 0.90;
		else if(speed == 9) return 0.80;
		else return 0.77;
	}
}
