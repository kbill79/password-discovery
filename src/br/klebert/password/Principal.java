package br.klebert.password;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static final String PASSWORD = "Senha123*";
	public static final String UPPER_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
	public static final String SMALL_LETTERS = "abcdefghijklmnopqrstuvxywz";
	public static final String NUMBERS = "1234567890";
	public static final String CHARACTERS = "!@#$%&*()_+-=?<>";
	public static final Integer MAX_SIZE = 10;
	public static final Integer MIN_SIZE = 6;

	public static Boolean IsEqual(String result) {

		Boolean isEqual = false;

		if (result == PASSWORD) {
			isEqual = true;
		}

		return isEqual;
	}

	public static void main(String[] args) {

		String all = UPPER_LETTERS + SMALL_LETTERS + NUMBERS + CHARACTERS;
		List<String> usedPasswords = new ArrayList<String>();
		String concat = "";
		
		for (int i = 0; i <= MAX_SIZE; i++) {
			concat = concat + all.charAt(i);
			if(concat.length() >= MIN_SIZE && concat.length() <= MAX_SIZE) {
				usedPasswords.add(concat);
			}
		}
		
		System.out.println(usedPasswords);
	}

}
