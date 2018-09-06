package chapter1;

import java.util.Scanner;
/* 
 * Write a program that reads a string and prints 
 * all of its nonempty substrings.
 */
 

public class Exersize8 {

	public static void main(String[] argc)
	{
		//Set scanner for user input
		Scanner in = new Scanner(System.in);
		
		//Initialise a string with an inputed string
		String message = in.nextLine();
		
		in.close();
		
		String[] substrings = message.split("\\s+");
		
		for (int i = 0; i < substrings.length; i++)
		{
			System.out.println(substrings[i]);
		}
	}
}
