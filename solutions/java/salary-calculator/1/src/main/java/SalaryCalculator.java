public class SalaryCalculator {
	public double salaryMultiplier(int daysSkipped) {
		return daysSkipped >= 5 ? 0.85 : 1.00;
	}

	public int bonusMultiplier(int productsSold) {
		return productsSold >= 20 ? 13 : 10;
	}

	public double bonusForProductsSold(int productsSold) {
		return bonusMultiplier(productsSold) * productsSold;
	}

	public double finalSalary(int daysSkipped, int productsSold) {
		final double BASE_SALARY = 1000.00;
		final double MAX_SALARY = 2000.00;
		double calculatedSalary = (BASE_SALARY * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
		return Math.min(calculatedSalary, MAX_SALARY);
	}
}
