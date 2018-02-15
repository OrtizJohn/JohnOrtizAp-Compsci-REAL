//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence,lookFor);
	}

	public LetterRemover(String str, char c){
		sentence = str;
		lookFor = c;
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		while (cleaned.indexOf(lookFor) > -1){
			String before =cleaned.substring(0, cleaned.indexOf(lookFor));
			String last =  cleaned.substring(cleaned.indexOf(lookFor) + 1,cleaned.length());
			cleaned = before + last;
			
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}