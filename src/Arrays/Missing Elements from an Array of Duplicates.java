class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        //marking
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            int value = Math.abs(nums[i]);
            int position = value-1;
            //mark kardo ye position
            if(nums[position]>0)
            {
                nums[position]=-nums[position];
            }
        }
        //travel array and whenever you find a positive value,print the value at the same time
        for(int i=0;i<n;i++){
            if(nums[i]>0)
            {
                ans.add(i+1);
            }
        }
        return ans;
        }
}