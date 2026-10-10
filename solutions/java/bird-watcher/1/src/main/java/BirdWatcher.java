
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
		return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
		return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
		birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
		for (int birds : birdsPerDay){
			if(birds == 0){
				return true;
			}
		}
		return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
		int sumOfVisitingBirds = 0;
		for(int i = 0; i < numberOfDays; i++){
			if(i >= birdsPerDay.length) return sumOfVisitingBirds;

			sumOfVisitingBirds += birdsPerDay[i];
		}
		return sumOfVisitingBirds;
    }

    public int getBusyDays() {
		int numOfBusyDays = 0;
		for(int birds : birdsPerDay){
			if(birds >= 5){
				numOfBusyDays++;
			}
		}
		return numOfBusyDays;
    }
}
