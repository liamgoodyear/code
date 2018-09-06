package chapter1;

import java.util.ArrayList;

/*
 * Write a program that stores Pascal’s triangle up to a given n in an 
 * ArrayList<ArrayList<Integer>> .
 */

public class Exersize15 {

	public static void main(String[] argc)
	{
		printPTriangle(genPascalsTriangle(82));
	}
	
	//Method that generates up to the nth element in Pascals Triangle
	public static ArrayList<ArrayList<Integer>> genPascalsTriangle(int n)
	{
		//Create a list of lists
		ArrayList<ArrayList<Integer>> pTriangle = new ArrayList<ArrayList<Integer>> ();
		
		/*for (int i = 0; i < n; i++) {
			triangle[i] = new int[i + 1]; 
			triangle[i][0] = 1; 
			triangle[i][i] = 1; 
			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; 
				} 
			}
		}
		*/
			
		for(int i = 0; i < n; i++)
		{						
			//create a new list object and add it to list of lists
			pTriangle.add(new ArrayList<Integer>(i+1));
			
			//Initialize elements in list to 0
			for(int k = 0 ; k < i+1; k++)
			{
				pTriangle.get(i).add(0);
			}
	
			if(i != 0)
			{
				pTriangle.get(i).set(0, 1);
				pTriangle.get(i).set(i, 1);
			
				for(int j = 1; j < i; j++)
				{
					pTriangle.get(i).set(j, (pTriangle.get(i-1).get(j-1) + pTriangle.get(i-1).get(j)));
				}	
			}
			else
			{
				pTriangle.get(0).set(0, 1);
			}
			
		}
		
		return pTriangle;
	}
	
	public static void printPTriangle(ArrayList<ArrayList<Integer>> triangle)
	{
		for (int r = 0; r < triangle.size(); r++)
		{
			for (int c = 0; c < triangle.get(r).size(); c++)
			{
				System.out.printf("%4d", triangle.get(r).get(c));
			}
			System.out.println("\n");
		}
	}
}
