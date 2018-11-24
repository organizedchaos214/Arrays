/**
 * @author Shane Anderson
 *
 *	Leetcode #462: Minimum Moves to Equal Array Elements II
 *	
 *	Given a non-empty integer array, find the minimum number of moves 
 *	required to make all array elements equal, where a move is incrementing 
 *	a selected element by 1 or decrementing a selected element by 1. You may 
 *	assume the array's length is at most 10,000.
 *
 *	Example:
 *	Input: [1,2,3]
 *	Output: 2
 *	
 *	Explanation: Only two moves are needed (remember each move increments 
 *	or decrements one element): [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
 */

import java.util.Arrays;

public class minimumMovesToEqualElements 
	{
	public int minMoves2(int[] nums)
		{
		int numOfMoves = 0;
		
		/*
		 * single element or empty arrays should only require 0 moves
		 * for all elements to be the same:
		 */
		
		if (nums.length < 2)
			{
			System.out.println("Number of Moves: " + numOfMoves);
			return numOfMoves;
			}
		
		/*
		 * arrays with 2 elements will take the 'absolute value of the
		 * difference between the elements' number of moves, assuming 
		 * only +1 or -1 in/decrements per move:
		 */
		if (nums.length == 2)
			{
			numOfMoves = Math.abs(nums[1]-nums[0]);
			System.out.println("Number of Moves: " + numOfMoves);
			return numOfMoves;
			}
		
		/*
		 * arrays with more than 2 elements are interesting cases:
		 */
		//sort the array:
		Arrays.sort(nums);
		
		//find the median/middle element:
		int median;
		
		int len = nums.length;
		
		//even number of elements: take average of the middle two elements:
		if (len%2 == 0)
			{
			//left middle element + right middle element; sum divided by 2
			median = (nums[(len/2) -1] + nums[(len)/2]) / 2;
			//System.out.println("Even Median: " + median);
			}
		
		//odd number of elements:
		else
			{
			median = nums[(len-1)/2];
			//System.out.println("Odd Median: " + median);
			}
		
		/*
		 * count how many (1-in/decrement moves) it takes for
		 * each non-median element to become the median element:
		 */
		for(int i = 0; i < nums.length; i++)
			{
			if (nums[i] != median)
				{
				numOfMoves += Math.abs(nums[i] - median);
				//System.out.println("Number of Moves: " + numOfMoves);
				}
			}	
		System.out.println("Number of Moves: " + numOfMoves);
		return numOfMoves;
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		int nums [ ] = {1,2,3,4,5};			// <---- change input array here
		minimumMovesToEqualElements m = new minimumMovesToEqualElements ( );
		m.minMoves2(nums);
		}
	}
