package lab14;

import java.util.Scanner;

public class BattingApp {
	public static void main(String[] args) {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		String answer = "";
		do
		{
		int atBats = Validator.getInt(sc, "Enter the number of times at bat");
		Batter b = new Batter(atBats);
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
		for (int i = 0; i < atBats; i++) {
			k = Validator.getIntWithinRange(sc, "Result for at bat " + (i + 1),
					0, 4);
			b.addBats(k);
		}
		System.out.println("Batting Average " + b.formatNumber(b.calcBattingAverage()));
		System.out.println("Slugging Percentage " + b.formatNumber(b.calcSluggingPercent()));
		answer = Validator.getAnswer(sc, "Another Batter? (y/n)");
		}
		while(answer.equalsIgnoreCase("y"));
	}
}
