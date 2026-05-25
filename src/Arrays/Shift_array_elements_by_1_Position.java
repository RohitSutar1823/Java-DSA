package Arrays;

public class Shift_array_elements_by_1_Position 
{
	static void ShiftBy1(int[] arr)
	{
		//Step 1:Store last wale ki value
		int n=arr.length;
		int temp=arr[n-1];
		
		//Step 2:Shift all values of array
		for(int i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		
		//Step 3:temp ki value ko 0 index pr copy
		arr[0]=temp;		
	}
	

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		ShiftBy1(arr);
		for(int val:arr)
		{
			System.out.print(val+" ");
		}

	}

}
