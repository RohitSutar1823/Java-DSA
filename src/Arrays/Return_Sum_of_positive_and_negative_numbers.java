package Arrays;

public class Return_Sum_of_positive_and_negative_numbers 
{
	static int[] getSumPosNegNumbers(int arr[])
	{
		int pos=0;
		int neg=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				pos=pos+arr[i];
			}
			else
			{
				neg=neg+arr[i];
			}
		}
		int[] ans= {pos,neg};
		return ans;
			
	}
	
	public static void main(String[] args)
	{
	
		int[] arr= {1,5,7,9,-1,-5,-7,-9};
		int[] ans= getSumPosNegNumbers(arr);
		System.out.println("Sum of positive numbers:"+ans[0]);
		System.out.println("Sum of positive numbers:"+ans[1]);
	}

}
