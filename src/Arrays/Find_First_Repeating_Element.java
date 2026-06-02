package Arrays;

import java.util.HashMap;

public class Find_First_Repeating_Element
{
	static public int FirstRepeatingElemnt(int[] arr)
	{
		HashMap<Integer,Integer> freq = new HashMap<>();
		for(int val:arr)
		{
			freq.put(val, freq.getOrDefault(val, 0)+1);
		}
		
		for(int val:arr)
		{
			if(freq.get(val) > 1)
			{
				return val;
			}
		}
		
		return -1;
	}

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,5,6,7,8,9,0};
		System.out.println(FirstRepeatingElemnt(arr));

	}

}
