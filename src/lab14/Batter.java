package lab14;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Batter {
	ArrayList<Integer> a;
	int atBats;
	double battingAverage;
	double sluggingPercent;
	
	public Batter()
	{
		
	}
	
	public Batter(int atBats)
	{
		this.atBats = atBats;
		a = new ArrayList<Integer>();
	}
	
	public void addBats(int k)
	{
		a.add(k);
	}
	
	public double calcBattingAverage()
	{
		int scoreCount = 0;
		for(Integer in : a)
		{
			if(in > 0)
			{
				scoreCount++;
			}
		}
		return (double)scoreCount / atBats;
	}
	
	public double calcSluggingPercent()
	{
		int basesEarned = 0;
		for(Integer in : a)
		{
			basesEarned += in;
		}
		return (double)basesEarned / atBats;	
	}
	
	public String formatNumber(double d)
	{
		NumberFormat percent = NumberFormat.getNumberInstance();
		percent.setMaximumFractionDigits(3);
		percent.setMinimumFractionDigits(3);
		return percent.format(d);
	}
	
	

	
	
}
