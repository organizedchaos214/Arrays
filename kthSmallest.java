/**
 * @author Shane Anderson
 * Date: 1/29/2018
 * 
 * This program will look at an array and return the Kth smallest
 * element in the array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest 
	{
	static int k;
	static int [ ] myArray = {0,1,2,3,5,8,13,21,34,55,89};
	
	
	public static int kSmallest (int [ ] myArray, int k)
		{
		if (k <= 0)
			{
			System.out.println("Error: K must be greater than 0!");
			return -1;
			}
		
		if (k > myArray.length)
			{
			System.out.println("Error: K-value: " + k + " is larger than the array size of: " + myArray.length);
			return -1;
			}
		
		//sort array into ascending order:
		Arrays.sort(myArray);
		System.out.println("The " + k + "th smallest value in array is: " + myArray [k-1]);
		return 0;
		}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
		{
		System.out.println("Enter a value of K");
		
		Scanner scanner = new Scanner (System.in);
		k = scanner.nextInt ( );
		kthSmallest.kSmallest (myArray, k);
		}

}
