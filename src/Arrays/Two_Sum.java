package Arrays;

public class Two_Sum 
{
	static public int[] twoSum(int[] arr,int target)
	{
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					int[] ans = {i,j};
					return ans;
				}
			}
		}
		int[] ans= {};
		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] ans=twoSum(arr, 5);
		for(int val:ans)
		{
			System.out.println(val);
		}
	}

}
