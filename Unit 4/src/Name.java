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
		return sfirst;
	}

	public String getLast()
	{
		int indexnum =name.indexOf(' ');
		String sLast = name.substring(indexnum + 1, name.length());
		return sLast;
	}

 	public String toString()
 	{
 		int indexnum = name.indexOf(' ');
		String sfirst= name.substring(0,indexnum);
		String sLast = name.substring(indexnum, name.length());
 		return sfirst + sLast;
	}
}