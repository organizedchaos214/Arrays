/**
 * @author Shane Anderson
 * 
 * This program will fill in an Array based off of user input:
 */
import java.util.*;


public class fillArrayFromUserInput 
	{
	static int numOfValues;
		
	/*
	 * This method handles the filling of the array:
	 */
	public static void fillArray (int numOfValues)
		{		
		int myArray [ ] = new int [numOfValues];

		System.out.println ("Enter " + numOfValues + " Integer Values For Array");
	
		@SuppressWarnings("resource")
		Scanner st = new Scanner (System.in);
		
		for (int i = 0; i < numOfValues; i++)
			{
			System.out.println("Enter a Value: ");
			myArray[i] = st.nextInt( );
			System.out.println("Added: " + myArray[i] + " to Array");
			}
		
		//call print:
		fillArrayFromUserInput.printArray(myArray);
		}
	
	/*
	 * Prints the array out:
	 */
	public static void printArray (int [ ] myArray)
		{
		System.out.print ("Array contents are as follows: " + Arrays.toString(myArray));
		}
	
	
	@SuppressWarnings("resource")
	public static void main (String [ ] args)
		{
		System.out.println ("Enter Total Number of Values");
		
		Scanner s = new Scanner (System.in);
		numOfValues = s.nextInt ( );
		
		//call fill:
		fillArrayFromUserInput.fillArray (numOfValues);
		}
	}
