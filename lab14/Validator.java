package lab14;

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
	
	
	public static String getString(Scanner sc, String prompt) {
		System.out.println(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
	public static int getInt(Scanner s, String prompt)
	{
		int input = 0;
		while(true)
		{
			System.out.println(prompt);
		if(s.hasNextInt())
		{
			input = s.nextInt();
			s.nextLine();
			return input;
		}
		else
		{
			s.nextLine();
			System.out.println("Error: please enter an integer");
		}
		}
		
	}

	public static int getIntWithinRange(Scanner s, String prompt, int min, int max) {
		int input = 0;
		while(true)
		{
		input = getInt(s, prompt);
		if(input < min)
			System.out.println("Error: number must be greater than " + input + " try again.");
		else if (input > max)
			System.out.println("Error: number must be less than " + input + " try again.");
		else
			return input;
		}
	}
}
