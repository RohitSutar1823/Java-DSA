package Arrays;

public class Find_the_maximum_element_in_an_array 
{
	static int getMaximum(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,4,5,7,9,10};
		System.out.println(getMaximum(arr));

	}

}
