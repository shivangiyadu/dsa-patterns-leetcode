class Solution {
   public int numSubarraysWithSum(int[] nums, int goal) {
        if (goal == 0) {
            return atMost(nums, 0); // only count subarrays with sum = 0
        }
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
      
    private int atMost(int[] nums,int goal)
    {
        int left=0;
        int sum=0;
        int ans=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>goal)
            {
                sum-=nums[left];
                left++;
            }
            ans+=right-left+1;
        }
        return ans;
    }

}