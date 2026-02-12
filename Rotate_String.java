package Strings_Program;
/*
Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false */
public class Rotate_String {
    public boolean rotateString(String s, String goal) {
        if(s.length() !=goal.length())
        {
           return false;
        }
        /*for(int i=0;i<s.length();i++)
        {
            if(s.equals(goal))
            {
                return true;
            }
            char first=s.charAt(0);
            String remaining=s.substring(1);
            s=remaining+first;
        }
        return false;*/
        String new_str=s+s;
        return new_str.contains(goal);
    }
    public static void main(String[] args) {
        Rotate_String rs=new Rotate_String();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rs.rotateString(s,goal));
    }
}
