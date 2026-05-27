package Arrays;

import java.util.HashMap;

public class Identify_elements_with_Highest_and_Lowest_Frequency 
{
	static int[] getHighestLowestFreq(int[] arr)
	{
		HashMap<Integer, Integer> freq= new HashMap<>();
		for(int num:arr)
		{
			freq.put(num, freq.getOrDefault(num,0)+1);
		}
		
		int highestFreq = Integer.MIN_VALUE;
		int highestFreqNumber = -1;
		for(int key : freq.keySet())
		{
			int currentKey = key;
			int currentKeyFreq = freq.get(key);
			if(currentKeyFreq > highestFreq)
			{
				highestFreq = currentKeyFreq;
				highestFreqNumber = currentKey;
				
			}
		}
		
		int LowestFreq = Integer.MAX_VALUE;
		int LowestFreqNumber = -1;
		for(int key : freq.keySet())
		{
			int currentKey = key;
			int currentKeyFreq = freq.get(key);
			if(currentKeyFreq < LowestFreq)
			{
				LowestFreq = currentKeyFreq;
				LowestFreqNumber = currentKey;
				
			}
		}
		
		int[] ans = {highestFreqNumber,LowestFreqNumber};
		return ans;
		
		}
	

	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
		int[] ans= getHighestLowestFreq(arr);
		System.out.println("Highest Frequency Number:"+ans[0]);
		System.out.println("Lowest Frequency Number:"+ans[1]);

	}

}
