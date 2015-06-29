package lab13;

import java.util.Scanner;

public class Validator {

	public static String getAnswer(Scanner sc, String prompt) {
		String answer = "";
		System.out.println(prompt);
		while (true) {
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))
				return answer;
			else
				System.out.println("Error:  Please enter y or n");
		}

	}
	
	public static String getTeam(Scanner sc, String prompt) {
		String answer = "";
		System.out.println(prompt);
		while (true) {
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("r") || answer.equalsIgnoreCase("b"))
				return answer;
			else
				System.out.println("Error:  Please enter r or b");
		}

	}
	
	public static String getString(Scanner sc, String prompt) {
		System.out.println(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
	public static String getSelection(Scanner sc, String prompt) {
		String answer = "";
		System.out.println(prompt);
		while (true) {
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("r") || answer.equalsIgnoreCase("p") || answer.equalsIgnoreCase("s"))
				return answer;
			else
				System.out.println("Error:  Please enter r, p, or s");
		}

	}
	
	
	
	
	
	
}
