package Strings_Program;
/*
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A" */
public class Zigzag_Conversion {
    public static String convert(String s, int numRows) {

        if(numRows==1 || s.length()<=numRows)
        {
            return s;
        }

        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int index=0;
        int direction_step=1;

        for(char str:s.toCharArray())
        {
            rows[index].append(str);
            if(index==0)
            {
                direction_step=1;
            }
            else if(index==numRows-1)
            {
                direction_step=-1;
            }
            index+= direction_step;
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder sb:rows)
        {
            result.append(sb);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(convert(s, numRows));
    }
}
