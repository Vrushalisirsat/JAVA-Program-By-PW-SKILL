// Q.1 Given a string,the task isto toggle all the chracters of the string i.e to convert Upper case to Lower case and vice versa
// Input :- PhysiCS   ,  Output :- pHYSIcs

import java.util.*;
class toggleChar
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);

/*
      //1) By using StringBuilder class   :- better perfoemance as compare to string
     
       StringBuilder str = new StringBuilder(sc.nextLine());
       //toggle
       for(int i=0;i<str.length();i++)
       {
        boolean flag = true;  // true = capital
        char ch = str.charAt(i);
        if(ch == ' ') continue;
        int asci = (int)ch;
        if(asci >= 97)
        flag = false;  // small

        if(flag == true)
        {
            asci += 32;     // add 32 if asci char is capital
            char dh = (char)asci;
            str.setCharAt(i,dh);
        }
        else
        {
            asci -= 32;     // subtract 32 if asci char is small
            char dh = (char)asci;
            str.setCharAt(i,dh);
        }
       }
       System.out.println(str);
*/
       //--------------------------------------------------------------------------------------------------------------------------------
/*
       //2) By Using String :-  poor performance bcoz of substring

       String str = "PhySicS";
       for(int i=0;i<str.length();i++)
       {
        boolean flag = true;  // true = capital
        char ch = str.charAt(i);
        if(ch == ' ') continue;
        int asci = (int)ch;
        if(asci >= 97)
        flag = false;  // small

        if(flag == true)
        {
            asci += 32;     // add 32 if asci char is capital
            char dh = (char)asci;
            str = str.substring(0,i) + dh + str.substring(i+1);
        }
        else
        {
            asci -= 32;     // subtract 32 if asci char is small
            char dh = (char)asci;
            str = str.substring(0,i) + dh + str.substring(i+1);
        }
       }
       System.out.println(str);
*/
//--------------------------------------------------------------------------------------------------------------------------------------------

       // 3) ADD STRING IN STRING BUILDER and write code as it is.
       String str1 = "PhySICs";
       StringBuilder str = new StringBuilder(str1);
         for(int i=0;i<str.length();i++)
       {
        boolean flag = true;  // true = capital
        char ch = str.charAt(i);
        if(ch == ' ') continue;
        int asci = (int)ch;
        if(asci >= 97)
        flag = false;  // small

        if(flag == true)
        {
            asci += 32;     // add 32 if asci char is capital
            char dh = (char)asci;
            str.setCharAt(i,dh);
        }
        else
        {
            asci -= 32;     // subtract 32 if asci char is small
            char dh = (char)asci;
            str.setCharAt(i,dh);
        }
       }
       System.out.println(str);
    }
}