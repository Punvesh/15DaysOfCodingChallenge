import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean alive = true;
            
            // If asteroid is moving left and stack top is moving right, possible collision
            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    // Stack top explodes
                    stack.pop();
                } else if (stack.peek() == -asteroid) {
                    // Both explode
                    stack.pop();
                    alive = false;
                } else {
                    // Current asteroid explodes
                    alive = false;
                }
            }
            
            if (alive) {
                stack.push(asteroid);
            }
        }
        
        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
