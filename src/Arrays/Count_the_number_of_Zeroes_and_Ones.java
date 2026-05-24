package Arrays;

public class Count_the_number_of_Zeroes_and_Ones 
{
	static int[] CountZeroOne(int arr[])
	{
		int sumzero=0;
		int sumone=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				sumzero++;
			}
			else
			{
				sumone++;
			}
		}
		int ans[]= {sumzero,sumone};
		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr={0,1,0,1,1,0,1};
		int[] ans=CountZeroOne(arr);
		System.out.println("Sum of Zeroes:"+ans[0]);
		System.out.println("Sum of Ones:"+ans[1]);
	}

}
