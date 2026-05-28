package Arrays;

public class Sort_an_Array_of_0s_and_1s 
{
	static int[] sortArray(int[] arr)
	{
		int n=arr.length;
		int i=0;
		int j=n-1;
		
		while(i<j)
		{
			if(arr[i]==1 && arr[j]==0)
			{
				arr[i]=0;
				arr[j]=1;
			}
			if(arr[i]==0)
				i++;
			if(arr[j]==1)
				j--;
		}
		return arr;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {1,0,1,0,0,1,1,0,1,0};
		sortArray(arr);
		for(int val:arr)
		{
			System.out.print(val+" ");
		}

	}

}
