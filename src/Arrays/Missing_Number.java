package Arrays;

public class Missing_Number 
{
	static int missingNumber(int[] arr)
	{
		int xorSum = 0;
		for(int n:arr)
		{
			xorSum = xorSum^n;
		}
		
		for(int i=0;i<=arr.length;i++) {
			xorSum = xorSum^i;
		}
		
		return xorSum;
	}

	public static void main(String[] args) 
	{
		int[] arr= {0,1,2,5,3};
		int ans = missingNumber(arr);
		System.out.println(ans);

	}

}
