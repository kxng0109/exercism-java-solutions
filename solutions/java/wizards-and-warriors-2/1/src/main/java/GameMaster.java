public class GameMaster {

	public String describe(Character character) {
		return String.format(
				"You're a level %d %s with %d hit points.",
				character.getLevel(), character.getCharacterClass(), character.getHitPoints()
		);
	}

	public String describe(Destination destination) {
		return String.format(
				"You've arrived at %s, which has %d inhabitants.",
				destination.getName(), destination.getInhabitants()
		);
	}

	public String describe(TravelMethod travelMethod) {
		String s = travelMethod == TravelMethod.HORSEBACK ? "on " + travelMethod : "by " + travelMethod;
		return String.format(
				"You're traveling to your destination %s.",
				s.toLowerCase()
		);
	}

	public String describe(Character c, Destination d, TravelMethod tM) {
		return String.format("%s %s %s", describe(c), describe(tM), describe(d));
	}

	public String describe(Character c, Destination d) {
		return String.format("%s %s %s", describe(c), describe(TravelMethod.WALKING), describe(d));
	}
}
