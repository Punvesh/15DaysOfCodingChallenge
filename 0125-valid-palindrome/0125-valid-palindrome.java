class Solution {
    public boolean isPalindrome(String s) {
    //Declear an stringBuilder object cleaned Because it will
    //modify the same object without creating an new object for every modification.
      StringBuilder cleaned = new StringBuilder();
     //convert the string into character array for an easy 
     //removal of special characters from String. 
      for(char c : s.toCharArray()){
     //from the character it will append and convert to lowerCase only if charcter is an letter  or digit.   
        if(Character.isLetterOrDigit(c)){
            //it will append to the cleaned object
            cleaned.append(Character.toLowerCase(c));
        }
      }  
      //convert the charcter array to string for the comparison 
      String forword =  cleaned.toString();
      //convert the cleaned object to reverse and  to string
      String reverse =  cleaned.reverse().toString();
      // if both forward and reverse if equal it will return "True"
      return forword.equals(reverse);
    }
}