/**
 * @author Shane Anderson
 *
 * rotateArrayByK will rotate an array by K positions:
 */

import java.util.*;

public class rotateArrayByK 
	{
	/*
	 * Handle the rotation of the array:
	 */
	public void rotate(int[] nums, int k) 
		 {
		 int temp;
		 
	     for (int i = 0; i < k; i++) 
	         {
	    	 for (int j = nums.length - 1; j > 0; j--) 
	    		 {
	    		 temp = nums[j];
	    		 nums[j] = nums[j - 1];
				 nums[j - 1] = temp;
				 }
	    	 }
	     }
	 
	
	/*
	 * helper function to print the array:
	 */
	public static void printArray (int myArray[ ])
		{
		//print sorted array:
		for (int j = 0; j < myArray.length; j++)
			{
			System.out.print(myArray[j] + " ");
			//System.out.println(" ");
			}
		}
	
	 /*
	  * Begin Execution:
	  */
	 @SuppressWarnings({ "unused", "resource" })
	 public static void main (String [ ] args)
	 	{
		int k;
		int nums [ ] = {1,2,3,4,5,6,7,8};		//change array here
			
		rotateArrayByK rotate = new rotateArrayByK ( );
		System.out.println("Enter Value of K");
		Scanner s = new Scanner (System.in);
		k = s.nextInt( ); 
		
		printArray (nums);
		rotate.rotate(nums, k);
		System.out.println(" ");
		printArray (nums);
	 	}
	}
