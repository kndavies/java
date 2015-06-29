package lab2;
import java.util.InputMismatchException;
import java.util.Scanner;


public class NumberGrades {

	public static void main(String[] args) {
		String answer = "y";
		int grade = 0;
		String letter = "";
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);
		while(answer.equalsIgnoreCase("y"))
		{
			System.out.printf("Enter a numerical grade: ");
			try{
			grade = sc.nextInt();
			}
			catch(InputMismatchException e){
				grade = 101;
				e.getMessage();
			}
			sc.nextLine();
			if(grade >= 99 && grade <= 100)
				letter = "A+";
			else if(grade >= 94 && grade <= 98)
				letter = "A";
			else if(grade >= 88 && grade <= 93)
				letter = "A-";
			else if(grade >= 85 && grade <= 87)
				letter = "B+";
			else if(grade >= 82 && grade <= 84)
				letter = "B";
			else if(grade >= 80 && grade <= 81)
				letter = "B-";
			else if(grade >= 75 && grade <= 79)
				letter = "C+";
			else if(grade >= 70 && grade <= 74)
				letter = "C";
			else if(grade >= 67 && grade <= 69)
				letter = "C-";
			else if(grade >= 0 && grade <= 59)
				letter = "F";
			else
			{
			System.out.println("You have entered an invalid number");
			letter = "Unable to calculate";
			}
			System.out.println("Letter Grade: " + letter);
			System.out.println("Continue?  (y/n)?");
			answer = sc.next();
			
		}
		sc.close();
	}

}
