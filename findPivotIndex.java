/**
 * @author Shane Anderson
 *
 * Leetcode #724:
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * We define the pivot index as the index where the sum of the numbers to the left of the index 
 * is equal to the sum of the numbers to the right of the index.
 * 
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should 
 * return the left-most pivot index.
 * 
 * Example 1:
 * 
 * Input: 
 * nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: 
 * nums = [1, 2, 3]
 * Output: -1
 * 
 * Note:
 * The length of nums will be in the range [0, 10000].
 * Each element nums[i] will be an integer in the range [-1000, 1000]
 */

public class findPivotIndex 
	{
	public int pivotIndex (int [ ] nums)
		{
		if (nums.length < 2)
			{
			System.out.println("Length less than 2");
			return -1;
			}
		
		int leftSum = 0; 
		int rightSum = 0;
	
		/**
		 * calculate the right and left sums of the array elements 
		 * based off of the pivot element:
		 */
		for (int i = 0; i < nums.length; i++)
			{
			if (i == 0) 
				{
				leftSum = 0;
				rightSum = calculateSum (nums, 1, nums.length - 1);
				}
			
			else 
				{
				leftSum = calculateSum (nums, 0, i - 1);
				//System.out.println("Left Sum: " + leftSum);
			
				rightSum = calculateSum (nums, i + 1, nums.length-1);
				//System.out.println("Right Sum: " + rightSum);
				}
			
			if (leftSum == rightSum)
				{
				System.out.println("Pivot Index is: " + i);
				return i;
				}
			}
		return -1;
		}
	
	/**
	 * helper function that calculates the sum of array elements 
	 * 		from startIndex to endIndex
	 * @param array - input array
	 * @param startIndex - starting index for sum calculation
	 * @param endIndex - ending index for sum calculation
	 * @return - returns the sum
	 */
	
	public int calculateSum (int array [ ], int startIndex, int endIndex)
		{
		int sum = 0;
		
		if(startIndex == endIndex)
			{
			return array[startIndex];
			}
		
		for (int i = startIndex; i <= endIndex; i++)
			{
			sum += array[i];
			}
		
		return sum;
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		findPivotIndex p = new findPivotIndex ( );
		int array [ ] = {-1,-1,-1,0,1,1};
		//p.calculateSum(array, 2, 2);
		p.pivotIndex(array);
		}
	}
