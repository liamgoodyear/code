package chapter1;

import java.util.Scanner;
import java.math.BigInteger;

/*
 * Write a program that computes 
 * the factorial n ! = 1 × 2 × . . . × n , 
 * using BigInteger . 
 * 
 * Compute the factorial of 1000.
 */

public class Exersize6 {

	public static void main (String argc[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program calculates the factoral of a number.\n\n");
		System.out.print("Please enter a number to calculate: ");
		
		//Read input 
		String n = sc.nextLine();
		//Validate input
		
		boolean valid = false;
		
		//Input validation - Check if string will parse to integer
		//else user must re enter value
		while(valid != true)
		{		
			try
			{
				Integer.parseInt(n);
				valid = true;
			}
			catch(NumberFormatException e)
			{
				System.out.println(e + "Is not a valid number, please try again.");
				n = sc.nextLine();
			}
		}
		
		//Set integer as BigInteger 
		BigInteger bigN = BigInteger.valueOf(Long.parseLong(n));
		sc.close();
		
		
		System.out.println("Factorial Rec of " + n +  " = " + factorialRec(bigN));
		System.out.println("Factorial Loop of " + n +  " = " + factorial(bigN));
		System.out.println("Factorial Rec of 1000 = " + factorialRec(BigInteger.valueOf(1000)));
	}
	
	
	//Recursion method to calculate factorial of a big integer
	public static BigInteger factorialRec (BigInteger num)
	{
		if(num.intValue() == 1)
		{
			return BigInteger.valueOf(1);
		}
		else
		{
			//Recursion
			return (num.multiply(factorialRec(num.subtract(BigInteger.valueOf(1)))));	
		}
	}
	
	public static BigInteger factorial (BigInteger num)
	{
		 BigInteger fact = BigInteger.valueOf(1);
		 
		 for(int i = 1;  i <= num.intValue() ; i++)
		 {
			 //System.out.println(i);
			 fact = fact.multiply(BigInteger.valueOf(i));
		 }	
		 
		 return fact;
	}
}
