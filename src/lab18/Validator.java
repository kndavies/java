package lab18;

import java.util.Scanner;

public class Validator {
	
	public static String getRequiredString(String prompt, Scanner s)
	{
			System.out.println(prompt);
			String sr = s.nextLine();
			return sr;
	}
	
	public static String getChoiceString(String prompt, Scanner s, String s1, String s2)
	{
		String input = "";
		boolean testCase = false;
		while(true)
		{
			input = getRequiredString(prompt, s);
			testCase = input.equalsIgnoreCase(s1) || input.equalsIgnoreCase(s2);
			if(testCase)
				return input;
			else
				System.out.println("Error please enter y or n");
			}
		}
}
