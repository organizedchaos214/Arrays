/**
 * @author Shane Anderson
 *
 *	This program will take in an array, and 
 *	return the first non-duplicate element
 *	in the array.
 */
public class firstNonDuplicate 
	{
	public int oneElement (int arr [ ])
		{
		if (arr.length == 0)
			{
			return 0;
			}
		
		int i;
		int prev;
		int next;
		
		for (i = 0; i < arr.length; i++)
			{
			//for beginning of the array:
			if (i == 0)
				{
				prev = arr[0];
				}
			else
				{
				prev = arr [i-1];
				}
			
			//for end of the array:
			if(i == arr.length - 1)
				{
				next = 9999;
				}
			else
				{
				next = arr[i+1];
				}
			
			//if previous and next element are both different than current:
			if (arr[i] != prev && arr[i] != next)
				{
				System.out.println(arr[i]);
				return arr[i];
				}
			}
		return 0;
		}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		firstNonDuplicate f = new firstNonDuplicate ( );
		int arr [ ] = {0,0,1,1,2,2,3,3,4,4,5,5,6,6,8};	
		f.oneElement (arr);
		}
	}
