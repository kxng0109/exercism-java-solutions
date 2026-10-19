class ReverseString {

    String reverse(String inputString) {
		return inputString.isEmpty() ? "" : new StringBuilder(inputString).reverse().toString();
    }
}
