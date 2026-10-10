public class JedliksToyCar {
    private int metersDriven = 0;
	private int batteryLeft = 100;

	public static JedliksToyCar buy() {
		return new JedliksToyCar();
    }

    public String distanceDisplay() {
		return String.format("Driven %d meters", metersDriven);
    }

    public String batteryDisplay() {
		return batteryLeft > 0 ? "Battery at " + batteryLeft + "%"
		    : "Battery empty";
    }

    public void drive() {
		if(batteryLeft > 0){
			metersDriven += 20;
			batteryLeft -= 1;
		}
    }
}
