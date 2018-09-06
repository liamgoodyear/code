package chapter1;

import java.util.Random;

/*
 * Write a program that produces a random string of letters and 
 * digits by generating a random long value and printing 
 * it in base 36.
 */
public class Exersize10 {
	
	public static void main (String[] argc)
	{
		Random rand = new Random();
		
		long randomNum = rand.nextLong();
		
		String convert = Long.toString(randomNum, 36);
		
		System.out.println(randomNum + "\n" + convert);
	}

}
