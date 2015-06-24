package lab7;
import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		String param[] = { "Number", "Squared", "Cubed" };

		String choice = "y";
		while (choice.equalsIgnoreCase("Y")) {
			number = Validator.getInt(sc, "Enter an integer");
			for (String s : param) {
				System.out.print(s + "\t");
			}

			System.out.println();
			for (int i = 1; i <= number; i++) {
				System.out.print(i + "\t");
				System.out.print((int) Math.pow(i, 2) + "\t");
				System.out.print((int) Math.pow(i, 3) + "\t");
				System.out.println();
			}
			choice = Validator.getString(sc,
					"Would you like to continue? (y/n)?");
		}
	}

}
