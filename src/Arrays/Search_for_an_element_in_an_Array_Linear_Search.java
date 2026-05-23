package Arrays;

public class Search_for_an_element_in_an_Array_Linear_Search
{

	static boolean getTarget(int[] arr,int Target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==Target)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		boolean ans=getTarget(arr, 9);
		System.out.println(ans);

	}

}
