package lab21;

import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		CountriesTextFile t = new CountriesTextFile();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while(true)
		{
		choice = Validator.getIntWithinRange("Enter a num", sc, 1, 3);
		switch(choice)
		{
		case 1:
			t.makeFileReader();
			t.readCountries();
			t.closeRead();
			break;
		case 2:
			t.makeFileWriter();
			t.writeCountries("Enter a country");
			t.closeWrite();
			break;
		case 3:
			System.exit(0);;
		default:
			//
		}
		}
		
	}

}
