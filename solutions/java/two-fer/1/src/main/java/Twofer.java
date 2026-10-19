public class Twofer {
	public String twofer(String name) {
		name = name == null || name.isEmpty() ? "you" : name;
		return "One for " + name + ", one for me.";
	}
}
