/**
 * @author Shane Anderson
 * 
 * Looks at array nums [ ] and attempts to find 
 * a user-provided sum from adding two distinct 
 * elements in the array
 */

import java.util.*;

public class twoElementSum 
	{
	public static int[ ] twoSum(int[ ] nums, int target) 
		{
	    HashMap<Integer, Integer> map = new HashMap< >( );
	    
	    //O(n) for insert:
	    for (int i = 0; i < nums.length; i++) 
	    	{
	        map.put(nums[i], i);
	    	}
	    
	    //O(1) constant time for lookups:
	    for (int i = 0; i < nums.length; i++) 
	    	{
	        int complement = target - nums[i];
	        
	        if (map.containsKey(complement) && map.get(complement) != i) 
	        	{
	        	int resultArray [ ] = { i, map.get(complement) };
	        	printArray (resultArray);
	        	return resultArray;
	        	}
	    	}
	    throw new IllegalArgumentException("No two sum solution");
		}
	
	
	/*
	 * method that handles the printing of the array.
	 * array is printed before and after sorting. Called '
	 * from main ( ):
	 */
	public static void printArray (int myArray[ ])
		{
		int j;
		
		//print sorted array:
		for (j = 0; j < myArray.length; j++)
			{
			System.out.print(myArray[j] + " ");
			//System.out.println(" ");
			}
		}
	

	@SuppressWarnings("resource")
	public static void main (String [ ] args)
		{
		int sum;
		int myArray [ ] = {1,2,3,8,12,20};
		
		System.out.println("Enter Sum Value");
		Scanner s = new Scanner (System.in);
		sum = s.nextInt( );
		twoSum(myArray,sum);
		}
	}
