package Arrays;

public class Average {

static double getAverage(int [] arr)
	{
		double sum=0;
		int size=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		double avg =sum/size;
		return avg;
	}
public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		System.out.println("Average:"+getAverage(arr));

	}

}
