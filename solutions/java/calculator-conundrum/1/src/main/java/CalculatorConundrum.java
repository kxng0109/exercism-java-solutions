class CalculatorConundrum {
	public String calculate(int operand1, int operand2, String operation) {
		switch (operation) {
			case null -> throw new IllegalArgumentException("Operation cannot be null");
			case "" -> throw new IllegalArgumentException("Operation cannot be empty");
			case "+" -> {
				return stringLiteral(operand1, operand2, operation, operand1 + operand2);
			}
			case "*" -> {
				return stringLiteral(operand1, operand2, operation, operand1 * operand2);
			}
			case "/" -> {
				try {
					return stringLiteral(operand1, operand2, operation, operand1 / operand2);
				} catch (ArithmeticException e) {
					throw new IllegalOperationException("Division by zero is not allowed", e);
				}
			}
			default -> throw new IllegalOperationException(
					String.format(
							"Operation '%s' does not exist",
							operation
					)
			);
		}
	}

	public String stringLiteral(int o1, int o2, String op, int ans) {
		return String.format(
				"%d %s %d = %d",
				o1, op, o2, ans
		);
	}
}
