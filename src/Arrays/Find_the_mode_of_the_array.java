package Arrays;

import java.util.HashMap;

public class Find_the_mode_of_the_array 
{
	static int getMode(int[] arr)
	{
		HashMap<Integer, Integer> freq = new HashMap<>();
		for(int num:arr)
		{
			freq.put(num, freq.getOrDefault(num,0)+1);
		}
		
//		for(int i:freq.keySet())
//		{
//			System.out.println(i+"->"+freq.get(i));
//		}
		
		int maxFreq = -1;
		int maxFreqWaliKey = -1;
		
		for(int key:freq.keySet())
		{
			int currentKey = key;
			int currentKeyFreq = freq.get(currentKey);
			if(currentKeyFreq > maxFreq)
			{
				maxFreq=currentKeyFreq;
				maxFreqWaliKey=currentKey;
			}
		}
		return maxFreqWaliKey;
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
		int ans=getMode(arr);
		System.out.println(ans);


	}

}
