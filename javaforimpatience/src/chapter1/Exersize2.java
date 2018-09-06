package chapter1;
import java.util.Scanner;

public class Exersize2 {

	public static int readInt()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an angle: ");
		int num = sc.nextInt();
		sc.close();
		return num;
	}
	public static void normalizeInt(int num, int min, int max)
	{

		//Normalize an value to range 0 - 359
		int normalized = (360 + num ) % 360;
		int floorNorm = Math.floorMod((360 + num), 360);
		System.out.println(normalized + " " + floorNorm);
	}
	
	public static void main (String[] argc)
	{
		normalizeInt(readInt(), 0, 259);
	}
}
