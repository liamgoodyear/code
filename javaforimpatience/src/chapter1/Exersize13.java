package chapter1;
/*
 * Write a program that prints a lottery combination, 
 * picking six distinct numbers between 1 and 49. 
 * To pick six distinct numbers, start with an array list filled 
 * with 1 . . . 49. Pick a random index and remove the element.
 * Repeat six times. Print the result in sorted order.
 * 
 */

import java.util.*;

public class Exersize13 {
	
	public static void main(String[] argc)
	{
		final int RANGE = 49;
		ArrayList<Integer> numRange = new ArrayList<>();
		int[] numberDraw = new int[6];
		
		for(int i = 0; i <= RANGE; i++ )
		{
			numRange.add(i);
		}
		
		for(int j = 0; j < numberDraw.length; j ++)
		{
			Random index = new Random();
			int draw = index.nextInt(numRange.size());
			numberDraw[j] = numRange.get(draw);
			numRange.remove(draw);
		}
		
		Arrays.sort(numberDraw);
		
		for(int k =0; k < numberDraw.length; k++)
		{
			System.out.print(numberDraw[k] + " ");
		}
	}
}