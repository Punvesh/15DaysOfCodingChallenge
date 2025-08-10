class Solution {
    public int maxArea(int[] height) {
        int left = 0;                  // Start pointer
        int right = height.length - 1; // End pointer
        int maxWater = 0;              // Store max area found

        while (left < right) {
            // Calculate width and height of current container
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

            // Update max
            maxWater = Math.max(maxWater, currentArea);

            // Move the pointer pointing at the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
