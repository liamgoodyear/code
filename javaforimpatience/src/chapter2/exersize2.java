package chapter2;

import java.util.Random;
import java.util.Scanner;

/*
 * Consider the nextInt method of the Scanner class. 
 * Is it an accessor or mutator? Why? 
 * What about the nextInt method of the Random class?
 */
public class exersize2 {
	public static void main(String[] args)
	{
		//Accessor methods leave the original object unchanged
		
		//Mutator changes the object on which it was invoked.
		
	
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		//The Scanner nextInt() method is both an accessor and mutator
		/*
		 * It is an accessor as it is used to access data stored 
		 * nextInt() acts as a 'getter method'.
		 * all getter methods are accessors. 
		 * 
		 * It is also a mutator as when we successfully read in data
		 * the scanner advances past the input mached, therefor changing 
		 * the original objects current state to a state without the 
		 * input that has just been read.
		 * 
		 */
		
		
		Random rnd = new Random(1000);
		rnd.nextInt();
		
		//The Random nextInt() method is a accessor
		/*
		 * This is because the method only returns an integer 
		 * and doesn't change the original object in any way as 
		 * nothing is ever stored inside the invoking object.
		 */
		
	}
}
