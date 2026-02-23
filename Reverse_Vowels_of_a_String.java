package Strings_Program;
/*
Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"
 */
public class Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) 
    {
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            while(left<right && !isVowel(arr[left])){
                left++;
            }
            while(left<right && !isVowel(arr[right])){
                right--;
            }

            char c=arr[left];
            arr[left]=arr[right];
            arr[right]=c;
            left++;
            right--;
        }
        return new String(arr);
    }
    private static boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        return c =='a'||c =='e'||c =='i'||c =='o'||c =='u';
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
