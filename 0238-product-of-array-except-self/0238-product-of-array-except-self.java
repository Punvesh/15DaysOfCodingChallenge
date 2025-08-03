class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        //To store the result array 
        int[] result = new int[n];
        // Initialize result[0] and suffix to 1 since there’s nothing to the left or right initially
        result[0]=1;
        int suffix=1;
       // Calculate prefix products for each index
        for(int i =1;i<n;i++){
          result[i]=result[i-1]*nums[i-1];
        }
       // Multiply with suffix products to get final result
        for(int j=nums.length-1;j>=0;j--){
          result[j] *=suffix;
          suffix *= nums[j]; 
        }
        //return final result result[0,1,2,3].
        return result;
    }
}