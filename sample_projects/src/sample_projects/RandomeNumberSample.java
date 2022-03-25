package sample_projects;


import java.util.Random;

public class RandomeNumberSample {

	public static void main(String[] args) {
		Random random = new Random();
		// print any random number in the range of 0 to 10
		//System.out.println(random.nextInt(10));

		// 'Password must have a minimum of 8 characters,
		// at least one digit (0-9),
		// one lowercase character (a-z)
		// one uppercase character (A-Z),
		// one special character (!@#$%^&*)
		int length = 8;

		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// 26
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";// 26
		String specialCharacters = "!@#$%^&*";// 8
		String numbers = "1234567890";// 10

		char[] password = new char[length];
		for (int i = 0; i < 2; i++) {
			System.out.print(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
			System.out.print(capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())));
			System.out.print(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
			System.out.print(numbers.charAt(random.nextInt(numbers.length())));
		}
		
		
//		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
//		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
//		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
//		password[3] = numbers.charAt(random.nextInt(numbers.length()));
//
//		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
//		for (int i = 4; i < length; i++) {
//			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
//
//		}
	}

}
