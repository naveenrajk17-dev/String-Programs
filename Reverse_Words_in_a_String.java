package Strings_Program;
/*
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string. */
public class Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        int n=s.length();
        int j=n-1;
        StringBuilder result = new StringBuilder();
        while(j>=0)
        {
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }

            // If we reached the beginning, stop
            if (j < 0) 
            {
                break;
            }
            int r_word=j;
            while(j>=0 && s.charAt(j) !=' '){
                j--;
            }
            //we need word of before space 
            int l_word = j + 1;

            //it will add space before word
            if(result.length()>0){
                result.append(" ");
            }

            result.append(s.substring(l_word,r_word+1));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s1 = "  the   sky  is blue  ";
        String s2 = "hello world";
        String s3 = "a good   example";

        System.out.println(reverseWords(s1)); 
        System.out.println(reverseWords(s2)); 
        System.out.println(reverseWords(s3)); 
    }
}
