class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            //step1: sum create krte h
            sum = sum + nums[i];
            //step2: maxSum update krte h
            maxSum = Math.max(maxSum,sum);
            //step3: sum check krte h for negative value
            if(sum<0)
            {
                sum = 0;
            }
        } 
        return maxSum;
    }
}