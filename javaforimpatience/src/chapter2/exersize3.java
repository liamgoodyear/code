package chapter2;

import java.util.ArrayList;

/*
 * 3. Can you ever have a mutator method return something other 
 * than void ? 
 * 
 * Can you ever have an accessor method return void ? 
 * 
 * Give examples when possible.
 */
public class exersize3 {
	public static void main (String[] args){
		//Mutator Example
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		if(nums.add(3))
		{
			System.out.println("Mutator returned true");
		}
		/*
		 * many methods that mutate an object or value often return 
		 * a boolean value that represents if the operation was 
		 * successful or not.
		 */
		
		
		
		//Accessor Example
		/*
		 * Accessors are meant to return a value
		 * Therefore the answer is 'NO' an accessor cannot return 
		 * void
		 */
		
	}
}
