package chapter1;

import java.util.Scanner;

/*
 * Write a program that reads in two numbers between 0 and 65535, 
 * stores them in short variables, and computes their unsigned 
 * sum, difference, product, quotient, and remainder, 
 * without converting them to int
 */
public class Exersize7 {

	public static void main (String[] argc)
	{
		final short makeUnsigned = Short.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A = ");
		short num1 = setUnsignedShort(sc);

		System.out.print("B = ");
		short num2 = setUnsignedShort(sc);
		
		sc.close();
		
		System.out.println("A+B = " + ((num1+makeUnsigned) + (num2 + makeUnsigned)));
		System.out.println("A-B = " + ((num1+makeUnsigned) - (num2 + makeUnsigned)));
		System.out.println("A*B = " + ((num1+makeUnsigned) * (num2 + makeUnsigned)));
		System.out.println("A/B = " + ((num1+makeUnsigned) / (num2 + makeUnsigned)));
		System.out.println("A%B = " + ((num1+makeUnsigned) % (num2 + makeUnsigned)));
		
	}
	
	
	//Method stores unsigned short value into a signed short 
	//User must add Short.MAX_VALUE to return full unsigned value
	public static short setUnsignedShort(Scanner sc)
	{
		short temp;
		temp = (short) (sc.nextInt() - Short.MAX_VALUE);
		return temp;
	}
	
}

