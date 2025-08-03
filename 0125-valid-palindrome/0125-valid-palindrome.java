class Solution {
    public boolean isPalindrome(String s) {
        // Use two pointer left -> start  and right -> end 
        int left = 0, right = s.length() - 1;
       // Continue until pointers meet in the middle
        while (left < right) {
           // Move left pointer forward if current character isn’t a letter or digit.
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            // Move right pointer backward if current character isn’t a letter or digit.
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            //check the both character of left and right if it is not equal it will return false.
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            //if condition is true it increment the left and right pointer.    
            left++;
            right--;
        }
        //return true if all the character are same.
        return true;
    }
}