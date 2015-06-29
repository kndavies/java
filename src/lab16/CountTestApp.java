package lab16;

public class CountTestApp {
	public static void main(String args[])
	{
		Alligator a = new Alligator();
		System.out.println("Counting Alligators...");
		System.out.println();
		CountUtil.count(a, 3);
		System.out.println();
		Sheep blackie = new Sheep();
		Sheep dolly = new Sheep();
		blackie.setName("Blackie");
		System.out.println("Counting Sheep...");
		System.out.println();
		CountUtil.count(blackie, 2);
		System.out.println();
		try {
			dolly = blackie.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		dolly.setName("Dolly");
		CountUtil.count(dolly, 3);
		System.out.println();
		CountUtil.count(blackie, 1);
	}
	
}
