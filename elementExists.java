/**
 * @author Shane Anderson
 * 
 * This program will attempt to find the user-specified element
 * in the array. It returns failure if element doesn't exist, 
 * and success if it does.
 */
import java.util.Scanner;

public class elementExists 
	{
	static int myArray [ ] = {1,2,4,8,16,25,36,49,64,81,100,121};	//change array here
	static int element;
	
	//Checks to see if the element is in the array: 
	public static int elemExists(int element)
		{
		for (int i = 0; i < myArray.length; i++)
			{
			if (myArray[i] == element)
				{
				System.out.println ("Success: Element: " + element + " found in array");
				return element;
				}
			}
		
		System.out.println("Failure: The element: " + element + " does not exist in array ");
		return -1;
		}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
		{
		System.out.println("Enter a Value to Check for in the Array: ");
				
		Scanner s = new Scanner (System.in);
		element = s.nextInt ( );
		elementExists.elemExists(element);
		}
	}
