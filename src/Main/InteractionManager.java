package Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InteractionManager {
	String password;
	
	public void userInteraction() {		

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your username: ");
		String username = scanner.next();

		do {
			System.out.print("Enter your password (Password must contain one upper case letter, one number and one special character): ");
			password = scanner.next();
			if (passwordValidation(password)) {
				System.out.println("Valid password");
			} else {
				System.out.println("Invalid password");
			}
		} while (!passwordValidation(password));
		
		
		System.out.print("Enter your UID: ");
		int uid = scanner.nextInt();

		System.out.print("Enter your highscore: ");
		int highscore = scanner.nextInt();
	
	}
	
	public static boolean passwordValidation(String password) {
		if(password.length()>=8)
	    {
	        Pattern letter = Pattern.compile("[a-zA-z]");
	        Pattern digit = Pattern.compile("[0-9]");
	        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
	        //Pattern eight = Pattern.compile (".{8}");


	           Matcher hasLetter = letter.matcher(password);
	           Matcher hasDigit = digit.matcher(password);
	           Matcher hasSpecial = special.matcher(password);

	           return hasLetter.find() && hasDigit.find() && hasSpecial.find();

	    }
	    else
	        return false;
	}

}
