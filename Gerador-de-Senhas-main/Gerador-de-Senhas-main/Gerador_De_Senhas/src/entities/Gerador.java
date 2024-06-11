package entities;

import java.security.SecureRandom;

public class Gerador {
	private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL_CHARACTERS = "!@#$%&";

	private static final String ALL_CHARACTERS = UPPER_CASE + LOWER_CASE + DIGITS + SPECIAL_CHARACTERS;
	private static final SecureRandom RANDOM = new SecureRandom();

	public static String limit(int length) {
		if (length < 8 || length > 20) {
			throw new IllegalArgumentException("O comprimento da senha deve ter entre 8 e 20 caracteres");
		}

		StringBuilder password = new StringBuilder(length);

		
		password.append(UPPER_CASE.charAt(RANDOM.nextInt(UPPER_CASE.length())));
		password.append(LOWER_CASE.charAt(RANDOM.nextInt(LOWER_CASE.length())));
		password.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
		password.append(SPECIAL_CHARACTERS.charAt(RANDOM.nextInt(SPECIAL_CHARACTERS.length())));

		
		for (int i = 4; i < length; i++) {
			password.append(ALL_CHARACTERS.charAt(RANDOM.nextInt(ALL_CHARACTERS.length())));
		}

		
		return shuffleString(password.toString());
	}

	private static String shuffleString(String string) {
		char[] characters = string.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			int randomIndex = RANDOM.nextInt(characters.length);
			char temp = characters[i];
			characters[i] = characters[randomIndex];
			characters[randomIndex] = temp;
		}
		return new String(characters);
	}
}
