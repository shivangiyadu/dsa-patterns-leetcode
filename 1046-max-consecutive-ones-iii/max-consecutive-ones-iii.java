class Solution {
    public int longestOnes(int[] nums, int k) {

     int left=0;
     int maxLen=0;
     int zc=0;
    for(int right=0;right<nums.length;right++)
    {
        if(nums[right]==0)
        {
            zc++;
        }
        while(zc>k)
        {
            if(nums[left]==0)
            {
                zc--;
            }
            left++;
        }
        maxLen=Math.max(maxLen,right-left+1);
    }
     return maxLen;   
    }
}