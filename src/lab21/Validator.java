package lab21;

import java.util.Scanner;

public class Validator {
	public static int getInt(String prompt, Scanner s)
	{
		int q = 0;
		while(true)
		{
			System.out.println(prompt);
		if(s.hasNextInt())
		{
			q = s.nextInt();
			s.nextLine();
			return q;
		}
			s.nextLine();
			System.out.println("Error: please enter an integer");
		}
		
	}

	public static int getIntWithinRange(String prompt, Scanner s, int min, int max) {
		int input = 0;
		while(true)
		{
		input = getInt(prompt, s);
		if(input < min)
			System.out.println("Error: number must be greater than " + input + " try again.");
		else if (input > max)
			System.out.println("Error: number must be less than " + input + " try again.");
		else
			return input;
		}
	}
}
