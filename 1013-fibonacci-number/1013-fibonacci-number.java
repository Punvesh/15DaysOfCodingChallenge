class Solution {
    public int fib(int n) {
        // Handle base cases
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // Initialize first two Fibonacci numbers
        int f0 = 0, f1 = 1;
        int result = 0;
        
        // Calculate fibonacci iteratively
        for (int i = 2; i <= n; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        
        return result;
    }
}