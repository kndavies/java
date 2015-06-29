package lab16;

public class Sheep implements Countable, Cloneable {
	int count;
	String name;

	@Override
	public Sheep clone() throws CloneNotSupportedException {
		return (Sheep)super.clone();
	}

	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return Integer.toString(count) + " " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
