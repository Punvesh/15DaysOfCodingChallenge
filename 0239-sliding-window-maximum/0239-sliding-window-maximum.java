class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k == 0)
            return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of the current window
            if (!deque.isEmpty() && deque.peekFirst() == i - k)
                deque.pollFirst();

            // Remove elements smaller than the current from the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();

            deque.offerLast(i);

            // Add to result once window is filled
            if (i >= k - 1)
                result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }
}