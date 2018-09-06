package chapter1;

public class Exersize4 {

	public static void printDoubleLimitations()
	{
		System.out.println("Double Min Value = " + Double.MIN_VALUE);
		System.out.println("Double Max Value = " + Double.MAX_VALUE);
		
		System.out.println("Min value + Nextdown = " + Math.nextDown(Double.MIN_VALUE));
		System.out.println("Max value + Nextup = " + Math.nextUp(Double.MAX_VALUE));
	
		System.out.println("Min value + Nextdown = " + Math.nextDown(Double.MAX_VALUE));
		System.out.println("Max value + Nextup = " + Math.nextUp(Double.MIN_VALUE));
	
	}
	public static void main (String[] argc)
	{
		printDoubleLimitations();
	}
}
