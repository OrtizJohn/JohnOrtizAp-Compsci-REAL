//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{


	}

	public Name(String s)
	{
		name = s;


	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		int indexnum = name.indexOf(' ');
		String sfirst= name.substring(0,indexnum);
		return "";
	}

	public String getLast()
	{
		return "";
	}

 	public String toString()
 	{
 		return "";
	}
}