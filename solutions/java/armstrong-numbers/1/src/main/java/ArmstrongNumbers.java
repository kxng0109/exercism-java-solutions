class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		if (numberToCheck < 0) {
			return false;
		}

		String numStr = Integer.toString(numberToCheck);
		int power = numStr.length();
		int sum = 0;

		for (int i = 0; i < power; i++) {
			int digit = numStr.charAt(i) - '0';
			sum += (int) Math.pow(digit, power);
		}

		return sum == numberToCheck;
	}

}
