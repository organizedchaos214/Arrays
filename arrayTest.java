/**
 * @author Shane Anderson
 * 
 * arrayTest.java - Practice on working with array data structures
 * This class has functions to print the contents of the array, 
 * calculate the sum of the elements, finding the maximum value
 * in the array, and return the size of the array.
 * 
 */

public class arrayTest 
	{
	static int [ ] numbers = {0,1,2,3,4,5,6,7,8,19};
	
	/*
	 * Inserts the values into the array:
	 */
	public static void arrayFill() 
		{
		System.out.println("The array contents are as follows: ");
		
		for (int i = 0; i < numbers.length; i++)
			{
			System.out.println(numbers[i]);
			}
		}

	/*
	 * Performs the sum on the values in the array:
	 */
	public static void arraySum ( )
		{
		int j = 0;
		
		for (int i = 0; i < numbers.length; i++)
			{
			j += numbers [i];
			}
		
		System.out.println("The sum (total) of the values in the array is: " + j);
		
		}
	
	/*
	 * Finds the largest value in the array:
	 */
	public static void arrayMax ( )
		{
		int max = 0;
		
		for (int i = 0; i < numbers.length; i++)
			{
			if (max < numbers [i])
				{
				max = numbers[i];
				}
			}
		
		System.out.println("The largest value in the array is: " + max);
		}
	
	
	/*
	 * Finds the size of the array:
	 */
	public static void sizeOfArray ( )
		{
		int size;
		size = numbers.length;
		System.out.println ("The array is of size: " + size);
		}
	
	/**
	 * @param args: NULL
	 */
	public static void main(String[] args) 
		{
		arrayTest.arrayFill ( );
		arrayTest.arraySum ( );
		arrayTest.arrayMax ( );
		arrayTest.sizeOfArray( );
		}

}