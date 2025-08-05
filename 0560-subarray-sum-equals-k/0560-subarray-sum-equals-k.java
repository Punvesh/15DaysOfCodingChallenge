class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store prefix sums and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Adding base case for sum = k at the start
        
        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num; // Update cumulative sum

            // Check if (sum - k) exists in the map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Update the frequency of the current sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}