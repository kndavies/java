package lab19;

public class Movie {
	String title;
	String category;
	
	public Movie(String t, String c)
	{
		title = t;
		category = c;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
