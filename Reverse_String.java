package Strings_Program;

import java.util.Arrays;

public class Reverse_String {
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before reverse: " + Arrays.toString(s));

        reverseString(s);

        System.out.println("After reverse:  " + Arrays.toString(s));
    }
}
