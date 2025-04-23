import java.security.SecureRandom;

public class AccountNumberGenerator{
	private static final String NUMERICS = "1234567890";
		
	private static final String RANDOM_DIGITS = NUMERICS;
	private static final SecureRandom secureRandom = new SecureRandom();
	
	public static String generateNumber(int length) {
		StringBuilder Number = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int index = secureRandom.nextInt(RANDOM_DIGITS.length());
			Number.append(RANDOM_DIGITS.charAt(index));
		}
		return Number.toString();
	}
	public static void main(String[] args) {
	int length = 10; //Basic Amount of Digits for Account Numbers
	String Number = generateNumber(length);
	System.out.println("Generated Account Number: " + Number);
	}
}