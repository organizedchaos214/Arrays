/**
 * 	@author Shane Anderson
 *	
 *	Leetcode 238: Given an array nums of n integers where n > 1,  
 *	return an array output such that output[i] is equal to the 
 *	product of all the elements of nums except nums[i].
 */

public class productOfArrayExceptSelf 
	{
	public int[] productExceptSelf(int[] nums) 
		{
		if (nums.length <= 1)
        	{
			System.out.println("Error: Array length is too short");
			return nums;
        	}
		
        int forwardPass [ ] = new int [nums.length];
        int backwardPass [ ] = new int [nums.length];
        int result [ ] = new int [nums.length];
        
        //first element of LtoR array = 1:
        forwardPass[0] = 1;		
        
        //last element of RtoL array = 1:
        backwardPass[nums.length - 1] = 1;
        
        //populate LtoR array:
        for (int i = 0; i < nums.length - 1; i++)
        	{
        	forwardPass [i+1] = nums[i] * forwardPass[i];
        	}
        
        //populate RtoL array:
        for (int i = nums.length -1 ; i > 0; i--)
        	{
        	backwardPass [i-1] = backwardPass [i] * nums[i];
        	}
        
        //populate the resultant array:
        for (int i = 0; i < nums.length; i++)
        	{
        	result[i] = forwardPass[i] * backwardPass [i];
        	}
       
        //Debugging Only: Print Array
    	//printArray (result);
        
        return result; 
		}
	
	/*
	 * method that handles the printing of the array.
	 * array is printed before and after sorting. Called '
	 * from main ( ):
	 */
	public void printArray (int myArray[ ])
		{
		//print sorted array:
		for (int j = 0; j < myArray.length; j++)
			{
			System.out.print(myArray[j] + " ");
			
			//System.out.println(" ");
			}
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		int nums [ ] = {1,0,2};
		
		productOfArrayExceptSelf p = new productOfArrayExceptSelf ( );	
		System.out.println("Original Array: ");
		p.printArray(nums);
		System.out.println("\nProductExceptSelf Array: ");
		p.productExceptSelf (nums);
		}
	}
