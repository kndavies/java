package lab18;


public class PigLatin {
	private String text;
	private String translatedText;
	private String[] words;
	
	
	public PigLatin()
	{
		//default constructor
	}
	
	public PigLatin(String t)
	{
		text = t;
	}
	
	public void setString(String t)
	{
		text = t;
	}
	
	private void translateText()
	{
		words = text.split(" ");
		String placeholder = "";
		String newString = "";
		int length = 0;
		for(int j = 0; j < words.length; j++)
		{
			words[j] = words[j].toLowerCase();
			loop: for(int i = 0; i < words[j].length(); i++)
			{
			switch(words[j].charAt(i))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
				if(i == 0)
				{
					words[j] += "way";
					break loop;
				}
				else
				{
					length = words[j].length();
					placeholder = words[j].substring(0, i);
					newString = words[j].substring(i, length);
					words[j] = newString + placeholder;
					words[j] += "ay";
					break loop;
				}
			default:
				//loop until you find a vowel
			}
			}
			
			
		}
	}
	
	private void storeFormatText()
	{
		translateText();
		translatedText = "";
		for(int i = 0; i < words.length; i++)
		{
			translatedText += words[i];
			
			if(i != (words.length - 1) || i != 0)
				translatedText += " ";
			else
				translatedText += ".";
			
		}
	
		
	}
	
	
	public String returnTranslatedText()
	{
		storeFormatText();
		return translatedText;
	}
}
