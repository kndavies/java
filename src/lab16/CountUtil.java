package lab16;

public class CountUtil {
	public static void count(Countable c, int maxCount)
	{
		c.resetCount();
		for(int i = 1; i <= maxCount; i++)
		{
		c.incrementCount();
		System.out.println(c.getCountString());
		}
	}
}
