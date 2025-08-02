class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum= Integer.MIN_VALUE;
        int CurrentSum=0 ;

        for(int num : nums){
            CurrentSum = Math.max(num,CurrentSum+num);
            maxSum = Math.max(maxSum,CurrentSum);
        }

        return maxSum;
    }
}