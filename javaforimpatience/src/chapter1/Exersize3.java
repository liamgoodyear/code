package chapter1;
import java.util.Scanner;

public class Exersize3 {

	public static int largest(int x, int y, int z)
	{
		int largest = x > y ? (x > z ? x : y) : (y > z ? y : z);
		
		return largest;
		
	}
	
	public static int getNumber(Scanner sc)
	{		
		int number = sc.nextInt();
		System.out.println("You Entered: " + number);
		return number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int COUNT = 3;
		int[] numbers = new int[COUNT];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length ; i++)
		{
			System.out.print( i + ": Enter a number: "); numbers[i] = getNumber(sc);
		}
		sc.close();
		
		System.out.println("Largest Number = " + largest(numbers[0],numbers[1],numbers[2]));
		System.exit(0);
	}

}
