/**
 * @author Shane Anderson
 * Date: 2/4/2018
 * 
 * This program will attempt to find the first duplicate element
 * an array. There are two methods: one that sorts the array before
 * searching for duplicate entries, and another that searches for
 * duplicates without sorting.
 */

import java.util.*;

public class firstDuplicate 
	{
	static int myArray [ ] = {1,2,3,4,5,3,8,10,30};
	
	/*
	 * This method sorts the array before attempting to find
	 * the duplicate entry. If none exists, returns -1:
	 */
	public static int findDuplicate (int myArray [])
		{
		int i;
		int prev;
		
		//sort the array:
		Arrays.sort(myArray);
		
		//go through array and compare the current element to the previous element:
		for (i = 1; i < myArray.length; i++)
			{
			//previous element = current element - 1:
			prev = myArray[i-1];
			
			//if current matches previous, match found:
			if (myArray[i] == prev)
				{
				System.out.println("[SORTED] Success, Duplicate Entry Found. Element is: " + prev);
				
				return prev;
				}
			}
		System.out.println ("No Matches/Duplicates Found");
		return -1;
		}
	
	/*
	 * This method leaves the array unsorted and tries to find 
	 * a duplicate. 
	 */
	public static int findDuplicateUnsorted (int myArray [])
		{
		int current;
		
		for (int i = 0; i < myArray.length; i++)
			{
			current = myArray [i];
			
			for (int j = i + 1; j < myArray.length; j++)
				{
				if (myArray[j] == current)
					{
					System.out.println("[UNSORTED] Success, Duplicate Entry Found. Element is: " + myArray[j]);
					
					return current;	
					}
				}
			}
		
		System.out.println("No Matches/Duplicates Found");
		return -1;
		}
	
	/*
	 * Main method:
	 */
	public static void main(String[] args) 
		{
		firstDuplicate.findDuplicate(myArray);				//sorted case
		firstDuplicate.findDuplicateUnsorted(myArray);		//unsorted case	
		}
	}
