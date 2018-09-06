package chapter1;

import java.util.Scanner;

/*
 * Write a program that reads a line of text and prints all 
 * characters that are not ASCII, together with their Unicode 
 * values.
 */

public class Exersize11 {

	public static void main (String[] argc)
	{
		//Initialise scanner for getting string from std in.
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please write a message, only non ASCII products will be printed");
		
		//Get input from standard in.
		String text = in.nextLine();
		
		in.close();
		
		int[] codePoints = text.codePoints().toArray();
		
		for(int i = 0;  i < codePoints.length;i++)
		{
			//If character is not an ASCII character
			if(codePoints[i] > 127)
			{
				String unicode = Integer.toString(text.codePointAt(i), 16);
				
				while (unicode.length() < 4)
					unicode = "0"+unicode;
				
				System.out.println(text.charAt(i) + ": U+" + unicode + " : " + text.codePointAt(i));
			}
		}
	}
}
