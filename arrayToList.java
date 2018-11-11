/**
 * 	@author Shane Anderson
 *	
 *	Takes in an array and copies the contents into a 
 *	list, and then prints the list
 */
import java.util.*;

public class arrayToList 
	{
	/*
	 * Copies array items into a List:
	 */
	public List<Integer> arrayItemsToList (int myArray[])
		{
		List <Integer> list = new ArrayList <Integer>( );
		
		for (int i = 0; i < myArray.length; i++)
			{
			list.add(myArray[i]);
			}
		
		System.out.println("List: " + list);
		
		return list;
		}
	
	/*
	 * Creates two lists, and returns a list of lists:
	 */
	public ArrayList<ArrayList<Integer>> listOfLists ( )
		{
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>( );
		
		//create list 1:
		ArrayList<Integer> original = new ArrayList<Integer>();
		
		//add 0 to 4 to original list:
		for (int i = 0; i < 5; i++)
			{
			original.add(i);
			}
		
		System.out.print("\nOriginal List: " + original);
		
		//create list 2:
		ArrayList<Integer> copy = new ArrayList<Integer>();
		
		//add 5 to 9 to second list:
		for (int j = 5; j < 10; j++)
			{
			copy.add(j);
			}
		
		System.out.print("\nSecond/Copy List: " + copy);
		
		//add lists to list of lists:
		listOfLists.add(original);
		listOfLists.add(copy);
		
		System.out.println("\nList of Lists: " + listOfLists);
		
		return listOfLists;
		}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		int myArray [ ] = {1,2,3,4,5};
		
		arrayToList a = new arrayToList ( );
		a.arrayItemsToList(myArray);
		
		a.listOfLists( );
		}
	}
