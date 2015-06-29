package lab18;

import java.util.Scanner;

public class PigLatinApp {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String text = "";
		PigLatin p = new PigLatin();
		do
		{
		System.out.println("Welcome to the Pig Latin Translator");
		text = Validator.getRequiredString("Enter a line to be translated", sc);
		p.setString(text);
		text = p.returnTranslatedText();
		System.out.println(text);
		text = Validator.getChoiceString("Would you like to translate another line? (y/n)", sc, "y", "n");
		}
		while(text.equalsIgnoreCase("y"));
	}
}
