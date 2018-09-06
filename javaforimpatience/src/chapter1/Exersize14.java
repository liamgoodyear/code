package chapter1;
/*
 * Write a program that reads a two-dimensional array of integers 
 * and determines whether it is a magic square 
 * (that is, whether the sum of all rows, all columns, 
 * and the diagonals is the same). 
 * Accept lines of input that you break up into individual 
 * integers, and stop when the user enters a blank line. 
 * For example, 
 * with the input 
 * 16 3 2 13 
 * 3 10 11 8 
 * 9  6 7 12 
 * 4 15 14 1 (Blank line)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exersize14 {

	public static void main(String[] argc)
	{
		int[][] twoDArray = {
				{ 16, 3, 2, 13},
				{ 3, 10, 11, 8},
				{ 9, 6, 7, 12},
				{4, 15, 14, 1}
		};
		
		isMagicSquare(twoDArray);
		
		isMagicSquare(setInputSquare());
		
		
	}
	
	//Method processes data from input to determine if input array is a magic square
	public static boolean isMagicSquare (int[][] array)
	{
		printSquare(array);
		
		//Set variables to true if all values within array are equal in their given category
		boolean rows = checkRow(array);
		boolean cols = checkCol(array);
		boolean diag = checkDiag(array);
		
		//If all values == true then magic square is true
		if (diag == true && cols == true && rows == true ) 
		{
			System.out.println("We have a magic Square\n");
			return true;
		}
		else
		{
			System.out.println("Input is not a magic square\n");
			return false;
		}
		
	}
	
	//Iterate through rows in array and return boolean based on if the sum of all rows are equal
	public static boolean checkRow (int[][] array)
	{
		int sum = 0;
		Integer rowTotal = null;
		
		//Iterate through rows of array
		for(int row = 0; row <array.length; row++)
		{
			//Reset sum for each row
			sum = 0;
			//Iterate through columns of array and sum each row
			for(int col = 0; col < array.length; col++)
			{
				sum = sum + array[row][col];
			}
				
			System.out.println("sum of Row: " + row + " = " + sum);
			
			//first iteration intializes rowTotal for comparison
			if(rowTotal == null)
				rowTotal = sum;
			//else compare row value to previous row
			else
				if (rowTotal != sum)
					return false;
		}
		//If rows are equal, return value of those rows
		return rowTotal == sum? true : false;
		
	}
	
	//Iterate through columns in array and return boolean based on if the sum of all columns are equal
	public static boolean checkCol (int[][] array)
	{
		int sum = 0;
		Integer colTotal = null;
		
		//Iterate through rows of array
		for(int row = 0; row <array.length; row++)
		{
			sum = 0;
			//Iterate through columns of array and sum each row
			for(int col = 0; col < array.length; col++)
			{
				sum = sum + array[col][row];
			}
				
			System.out.println("sum of Col: " + row + " = " + sum);
			
			//first iteration intializes rowTotal for comparison
			if(colTotal == null)
				colTotal = sum;
			//else compare row value to previous row
			else
				if(colTotal != sum)
					return false;
		}
		//If rows are equal, return value of those rows
		return colTotal == sum? true : false;
	}
	
	//Iterate through diagonals in array and return boolean based on if the sum of all diagonals are equal
	public static boolean checkDiag(int[][]array)
	{
		int sum = 0;
		int diagTotal = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i][i];
		}
		
		System.out.print("sum of diag 1 = " + sum + "\n");
		
		
		diagTotal = sum;
		
		int offset = 0;
		sum = 0;
		
		for(int row = array.length - 1; row >= 0; row --)
		{
			sum = sum + array[offset][row];
			offset++;
		}
		
		System.out.print("sum of diag 2 = " + sum + "\n\n");
		
		return sum == diagTotal? true : false;
	}
	
	//create a 2d array via user input and return that 2d array
	public static int[][] setInputSquare()
	{
		System.out.print("Please type a series of numbers that make up a equal table e.g 2x2, 3x3 etc... \nInclude a space between each new number and press enter to create a new row. \nWhen done press enter twice.");
		int size = 0;
		ArrayList<String> stringLine; 
		ArrayList<ArrayList<String>> stringSquare = new ArrayList<ArrayList<String>>();
		Scanner in = new Scanner(System.in);
		
		String nextLine = null;
		
		System.out.println("\nEnter Table: ");
		//While the next line is not an empty string
		//Also stores contents of new line in nextLine variable
		while(!(nextLine = in.nextLine()).isEmpty())
		{
			//Create new array list (dynamic memory allocation)
			stringLine = new ArrayList<String>();
			
			//Split String into individual elements (separated by a space)
			String[] integerS = nextLine.split("\\s+");
			
			//Get Size of square, if any lines are larger or smaller than
			//this value, then input is invalid
			if (size == 0)
				size = integerS.length;
		
			//Input Validation
			//If size is different from the size of new line exit program
			if(size != integerS.length)
			{
				System.out.println("Input invalid, Number of integers entered do not create a square of numbers");
				System.exit(-1);
			}
			
			//Store string elements in Array List
			for(String element : integerS)
			{
				stringLine.add(element);
			}
			
			//Store Array List in a list of Array Lists 
			stringSquare.add(stringLine);
		}
		
		in.close();
		
		if(stringSquare.size() != size)
		{
			System.out.println("Input Invalid, not enough rows");
			System.exit(-1);
		}
		
		int[][] square = new int[size][size];
		int colIndex = 0;
		int rowIndex = 0;
		
		for(ArrayList<String> row : stringSquare)
		{
			for (String element : row)
			{
				//Convert string to int and populate 2d array 
				square[colIndex][rowIndex] = Integer.parseInt(element);
				colIndex++;
			}
			rowIndex++;
			colIndex = 0;
		}
		return square;
	}
	
	public static void printSquare(int[][] square)
	{
		System.out.println("Input Square To Test:" );
		for(int[] row : square)
		{
			for(int element:row)
			{
				System.out.print(element + " ");
			}
			System.out.print("\n");
		}
		System.out.println("\n");
	}
}
