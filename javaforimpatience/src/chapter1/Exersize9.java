package chapter1;

/*
 *Section 1.5.3 , “ String Comparison ,” on p. 21 has an 
 * example of two strings s and t so that s.equals(t) but 
 * s != t . * 
 * Come up with a different example that doesn’t use substring ).
 */

public class Exersize9 {

	public static void main(String[] argc)
	{
		
		//Set 2 strings of equal value.
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		//s1 = "Hello"; // Should cause strings to be different
		//s2 = s1; // Should cause strings to be equal  
		
		
		//although strings are "equal" they do not occupy the same
		//object in memory, therefor do not == each other
		
		if(s1.equals(s2) && s1 != s2)
		{
			System.out.println("S1.equals(s2) && s1 !=s2");
		}
		else if (s1 == s2)
		{
			System.out.println("S1 and S2 are the same");
		}
		else
		{
			System.out.println("Strings different");
		}
	}
}
