package lab21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountriesTextFile {
	BufferedWriter bw;
	Scanner sc;
	FileReader fr;
	BufferedReader b;
	FileWriter w;
	PrintWriter p;
	
	
	public CountriesTextFile()
	{
		sc = new Scanner(System.in);		
	}
	
	public void readCountries() throws IOException
	{
		String line = "";
		try{
		while ((line = b.readLine()) != null)
		{
			System.out.println(line);
		}
		}
		catch(NullPointerException e){
			System.out.println("no output found");
		}
		//b.close();
	}
	
	public void makeFileReader() throws IOException
	{
		while(true)
		try {
			fr = new FileReader("countries.txt");
			b = new BufferedReader(fr);
			break;
		} catch (FileNotFoundException e) {
			makeFileWriter();
			closeWrite();
			//File file = new File("countries.txt");
			//fr = new FileReader(file);
			//b = new BufferedReader(fr);
		}
	}
	
	public void makeFileWriter() throws IOException
	{
		while(true)
		try {
			w = new FileWriter("countries.txt", true);
			bw = new BufferedWriter(w);	
			p = new PrintWriter(bw);
			break;
		} catch (IOException e) {
			System.out.println("bacon");
			File file = new File("countries.txt");
			w = new FileWriter(file, true);
			bw = new BufferedWriter(w);	
			p = new PrintWriter(bw);
		}
	}
	
	public void writeCountries(String prompt) throws IOException
	{
		System.out.println(prompt);
		p.println(sc.nextLine());
		
	}
	
	public void closeWrite() throws IOException
	{
		p.close();
	}
	
	public void closeRead() throws IOException 
	{
		b.close();
	}
	
	
}

