package Arrays;

public class Reverse_an_Array 
{
	static void reverseArray(int[] arr)
	{
		int n=arr.length;
		int i=0;
		int j=n-1;
		while(i<=j)
		{
			//swap
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			//i ko aage badhao
			i++;
			//j ko piche lao	
			j--;	
		}
		//Now you array has been reversed
		//print
		for(int val:arr)
		{
			System.out.println(val);
		}
	}

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		reverseArray(arr);

	}

}
