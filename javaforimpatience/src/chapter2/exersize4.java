package chapter2;

import org.omg.CORBA.IntHolder;

/*
 * Why can’t you implement a Java method that swaps the contents 
 * of two int variables? Instead, write a method that swaps the 
 * contents of two IntHolder objects. 
 * (Look up this rather obscure class in the API documentation.) 
 * Can you swap the contents of two Integer objects?
 */
public class exersize4 {
	
	public static void main (String[] args)
	{
		
		/*
		 * You can't implement a swap method in java as java uses 
		 * pass by value, this means that the objects passed into 
		 * the method are copies and not the original variables.
		 * as a result, any modifications made inside the method
		 * will only effect the copies and not the originals
		 */
		int a = 1;
		int b = 2;
		
		swap(a,b);
		
		System.out.println("back in main");
		System.out.println("A = " + a + " B = " +b);
		
		
		IntHolder c = new IntHolder(3);
		IntHolder d = new IntHolder(4);
		
		swap(c,d);	
		
		System.out.println("back in main");
		System.out.println("C = " + c.value + " D = " +d.value);
		
		
		Integer e = 1;
		Integer f = 2;
		
		System.out.println("e = " + e + " f = " + f);
		Integer temp;
		
		temp = e;
		e = f;
		f = temp;
		
		System.out.println("e = " + e + " f = " + f);
		
		
	}
	
	public static void swap(int a, int b)
	{
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("inside swap method");
		System.out.println("A = " + a + " B = " +b);
	}
	
	public static void swap(IntHolder a, IntHolder b)
	{
		IntHolder temp = null;
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("inside swap method");
		System.out.println("C = " + a.value + " D = " + b.value);
	}
}
	
