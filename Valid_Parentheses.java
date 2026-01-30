package Strings_Program;

import java.util.Stack;
/*
Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false */
public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='['|| ch=='{')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch==')' && top!='(') return false;
                if(ch==']' && top!='[') return false;
                if(ch=='}' && top!='{') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "{[()]}";
        String s4 = "(((";

        System.out.println(isValid(s1)); // true
        System.out.println(isValid(s2)); // false
        System.out.println(isValid(s3)); // true
        System.out.println(isValid(s4)); // false
    }
}
