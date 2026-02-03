class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left=0;
        int sum=0;

        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int maxSum=sum;

        for(int right=k;right<nums.length;right++)
        {
            sum-=nums[left];
            sum+=nums[right];
            left++;
            maxSum=Math.max(sum,maxSum);
        }
        
        return (double) maxSum/k;
        
    }
}