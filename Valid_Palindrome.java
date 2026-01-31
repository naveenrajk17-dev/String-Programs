package Strings_Program;
/*
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome. */
public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            //removing non-alphanumeric characters
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != 
            Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";

        System.out.println("Input: " + s1);
        System.out.println("Palindrome : " + isPalindrome(s1));
        
    }
}
