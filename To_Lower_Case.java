package Strings_Program;
/*
Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
  */
public class To_Lower_Case {
    public static String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                sb.append((char)(ch+32));
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Original: " + s);
        System.out.println("Result: " + toLowerCase(s));
    }
}