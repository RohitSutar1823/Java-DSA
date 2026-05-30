package Arrays;

public class Find_the_Unique_Element_in_an_Array
{
	static int findUniqueElement(int[] arr)
	{
		int xorSum = 0;
		for(int num:arr)
		{
			xorSum = xorSum^num;
		}
		
		return xorSum;
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,1,2,3,4};
		int ans = findUniqueElement(arr);
		System.out.println(ans);

	}

}
