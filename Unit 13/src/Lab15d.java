//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\ortizj4473\\Desktop\\JohnOrtizAp-Compsci-REAL\\Unit 13\\src\\lab15d.dat"));
		int size = file.nextInt();
		FancyWords[] test = new FancyWords[size];
		file.nextLine();
		for(int i = 0; i < size; i++) {
			test[i] = new FancyWords(file.nextLine());
		}
		file.close();
		for(FancyWords f : test) out.println(f);
		
		
		






	}
}