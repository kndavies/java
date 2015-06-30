package lab19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> a = new ArrayList<Movie>();
		for(int i = 1; i <= 100; i++)
			a.add(MovieIO.getMovie(i));
		Collections.sort(a);
		do
		{
		input = Validator.getChoiceString("What categories are you interested in?", sc, "animated", "drama", "horror", "scifi");
		for(Movie m : a)
		{
			if(m.getCategory().equalsIgnoreCase(input))
				System.out.println(m.getTitle());
		}
		input = Validator.getChoiceString("Would you like to continue?  Enter (y/n)", sc, "y", "n");
		}
		while(input.equalsIgnoreCase("y"));
	}
}
