package lab8;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		long factorial = 1;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("Y"))
		{
		factorial = 1;
		number = Validator.getInt(sc, "Enter an integer between 1 and highest integer that returns correct factorial calculation");
		for(int i = 1; i <= number; i++)
		{
			factorial *= i;
		}
		System.out.println("The factorial of " + number + " is " + factorial);
		choice = Validator.getString(sc, "Would you like to continue? (y/n)?");
		}
	}

}
