class Darts {
    int score(double xOfDart, double yOfDart) {
		double radius = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

		if(radius <= 1.00) return 10;
		else if (radius <= 5.00) return 5;
		else if (radius <= 10.00) return 1;
		return 0;
    }
}
