package chapter1;

/* 
 * 5. What happens when you cast a double to an int that 
 * is larger than the largest possible int value? 
 * Try it out.
 */
public class Exersize5 {

	public static void main (String[] argc)
	{
		//Double of value higher than the max value in an integer
		double largeDoub = 30000000000d;
		
		System.out.println("Largest double = " + largeDoub);
		
		int largeInt = Integer.MAX_VALUE;
		
		System.out.println("Largest Integer = " + largeInt);
		
		int doubleInt = (int)largeDoub;
		
		System.out.println("Largest Double, casted to an integer = " + doubleInt);
		
		
	}
}

