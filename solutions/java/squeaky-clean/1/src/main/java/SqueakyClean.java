class SqueakyClean {
	static String clean(String identifier) {
		StringBuilder builder = new StringBuilder();
		boolean capitalizeNextChar = false;

		for (char c : identifier.toCharArray()){
			// Next word is a letter and should be capitalized
			if(capitalizeNextChar && Character.isLetter(c)){
				builder.append(Character.toUpperCase(c));
				capitalizeNextChar = false;
				continue;
			}

			// if -, skip and capitalize the next word
			if(c == '-'){
				capitalizeNextChar = true;
				continue;
			}

			// Is just a letter, capitalization not needed
			if(Character.isLetter(c)){
				builder.append(c);
				continue;
			}

			// space -> _
			if(c == ' '){
				builder.append("_");
				continue;
			}

			// Character is specified number -> character
			switch (c){
				case '4' -> builder.append("a");
				case '3' -> builder.append("e");
				case '0' -> builder.append("o");
				case '1' -> builder.append("l");
				case '7' -> builder.append("t");
			}
		}

		return builder.toString();
	}
}
