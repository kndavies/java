package lab7;
import java.util.Scanner;

public class Validator {
	public static int getInt(Scanner sc, String prompt)
	{
		System.out.println(prompt);
		boolean valid = false;
		int i = 9;
		while(valid == false)
		{
			valid = sc.hasNextInt();
			if(!valid)
			{
				System.out.println("Error, please enter a nonzero whole number");
				sc.nextLine();
			}
			else
				i = Math.abs(sc.nextInt());
			
			if(i == 0)
			{
				valid = false;
				System.out.println("Error, please enter a nonzero whole number");
			}
		}
		sc.nextLine();
		return i;
	}

	public static String getString(Scanner sc, String prompt) {
		System.out.println(prompt);
		boolean valid = false;
		String s = "";
		while (valid == false) {
			s = sc.next();
			if (s.equalsIgnoreCase("n") || s.equalsIgnoreCase("y"))
				valid = true;
			else {
				System.out.println("Error, please enter Y or N");
				sc.nextLine();
			}
		}
		return s;
	}
}