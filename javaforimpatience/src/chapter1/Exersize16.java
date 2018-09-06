package chapter1;

/*
 * Improve the average method so that it is called with 
 * at least one parameter.
 */

public class Exersize16 {

	public static void main(String[] argc)
	{
		double num = average(1);
		
		System.out.print("Average = " + num);
	}
	
	public static double average(double... values)
	{
		double sum = 0;
		if (values.length < 1)
			return -1;
		for(double v : values) sum += v;
		return values.length == 0 ? 0:sum/values.length;
	}
}
