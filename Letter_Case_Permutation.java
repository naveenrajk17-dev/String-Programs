package Strings_Program;

import java.util.ArrayList;
import java.util.List;

/*
Example 1:

Input: s = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]
Example 2:

Input: s = "3z4"
Output: ["3z4","3Z4"] */
public class Letter_Case_Permutation {
    public static List<String> letterCasePermutation(String s) {
        List<String> result= new ArrayList<>();
        backtrack(s,0,new StringBuilder(),result);
        return result;
    }
    private static void backtrack(String s,int index ,StringBuilder current,List<String> result)
    {
        if(index==s.length())
        {
            result.add(current.toString());
            return;
        }
        char ch=s.charAt(index);
        if(Character.isLetter(ch))
        {
            //for lowercase
            current.append(Character.toLowerCase(ch));
            backtrack(s,index+1,current,result);
            current.deleteCharAt(current.length()-1);

            //for uppercase
            current.append(Character.toUpperCase(ch));
            backtrack(s,index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }
        else
        {
            //for lowercase
            current.append(ch);
            backtrack(s,index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }
    }
    public static void main(String[] args) {
        String s1 = "a1b2";
        System.out.println(letterCasePermutation(s1));
    }    
}
