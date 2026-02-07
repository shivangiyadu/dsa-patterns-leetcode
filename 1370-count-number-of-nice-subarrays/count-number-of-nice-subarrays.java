class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if(k==0) return atMost(nums,0);
        return atMost(nums,k)-atMost(nums,k-1);
    }

    private int atMost(int[] nums,int k)
    {
        
        int left=0;
        int ans=0;
        int sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right]%2;
            while(sum>k)
            {
                sum-=nums[left]%2;
                left++;
            }
            ans+=(right-left+1);
        }
       return ans;
    }
}