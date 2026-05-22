package Arrays;

public class Multiply_each_element_of_array_by_10 
{
	static int[] Multiplyby10(int[] arr)
	{
		int[] newArray=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int element=arr[i];
			int newelement=element*10;
			newArray[i]=newelement;
					
		}
		return newArray;
	}

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		int[] ans=Multiplyby10(arr);
		for(int val:ans)
		{
			System.out.println(val);
		}
	

	}

}
