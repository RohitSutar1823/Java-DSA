package Arrays;

public class Find_first_Unsorted_Element_in_Array 
{
	static int getUnsortedElement(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=arr[i+1])
			{
				return arr[i+1];
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,4,5,6,7,5,9};
		System.out.println(getUnsortedElement(arr));

	}

}
