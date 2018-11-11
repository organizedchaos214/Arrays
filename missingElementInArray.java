/**
 * @author: Shane Anderson
 * Date: 1/29/2018
 * 
 * This program will look at a (sorted) array, and determine the missing element
 * in the array.
 * 
 * Assumptions:
 * 	1. The Array should be sorted prior to algorithm working. 
 * 	2. Each element is only separated by one other element (ex: 0,1,2,3..).
 * 	3. Only one of each element exists in the array. Namely (0,1,2,2,3,4..) cannot happen.
 */

import java.util.Arrays;

public class missingElementInArray 
	{
	static int [ ] myArray = {-4,-3,-2,-1,0,1,2,3,4,6,7,8,9,10};
	
	public static int missingElement (int [ ] myArray)
		{
		int prev;
		
		//sort array (if Assumption 1 is invalid):
		Arrays.sort(myArray);
		
		/*
		 * loop through the array, comparing current element to the previous one.
		 * if the element current element is not equal to the previous element + 1, 
		 * something is missing
		 */
		for (int i = 1; i < myArray.length; i++)
			{
			if (myArray[i] != myArray[i-1] + 1)
				{
				prev = myArray [i -1] + 1;
				System.out.println("Missing Array Element is: " + prev);
				return 0;
				}
			}
		return -1;
		}
	
	public static void main(String[] args) 
		{
		missingElementInArray.missingElement (myArray);
		}
	}