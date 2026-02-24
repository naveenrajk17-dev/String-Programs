package Strings_Program;

public class Reverse_Degree_of_a_String {
    public static int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=(('z'- s.charAt(i) + 1) * (i+1));
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "zaza";
        System.out.println(reverseDegree(s));
    }
}
/*
Example 1:

Input: s = "abc"

Output: 148

Explanation:

Letter	Index in Reversed Alphabet	Index in String	Product
'a'	26	1	26
'b'	25	2	50
'c'	24	3	72
The reversed degree is 26 + 50 + 72 = 148.

Example 2:

Input: s = "zaza"

Output: 160

Explanation:

Letter	Index in Reversed Alphabet	Index in String	Product
'z'	1	1	1
'a'	26	2	52
'z'	1	3	3
'a'	26	4	104
The reverse degree is 1 + 52 + 3 + 104 = 160. */