// Q.2 Given a string s,return thepallindromic string 
// aba == aba ---> palindrome substring
/*
import java.util.*;
class pallindromic
{
    public static void main(String args[])
    {

        //method-1 :- better sol
        String str = "abcdcba";
        int i=0;
        int j = str.length()-1;
        boolean flag = true;    // true-->pallindrome
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag == true)
        System.out.println("Pallindromic substring.");
        else
        System.out.println("not a Pallindromic substring.");


       /*
        //method-2:-  not better
       String str1 = "abcdcba";
       StringBuilder s = new StringBuilder(str1);
       s.reverse();
       String s2 = s + "";
       if(str1.equals(s2))
       {
        System.out.println("Pallindromic substring.");
       }
       else{
         System.out.println("Not a Pallindromic substring.");
       }
    
    }
}
*/

//--------------------------------------------------------------------------------------------------------------------------------------

// Q.2 Given a string s,return the number of pallindromic substring in it. 
// aba == aba ---> palindrome substring

import java.util.*;
class pallindromic
{
    static boolean isPallindrome(String str)
    {
        int i=0;
        int j = str.length()-1;
       
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
              return false;
          i++;
          j--;
        }
        return true;
    }

    public static void main(String args[])
    {

        //method-1 :- better sol
        String str = "abcba";
        int count=0;
        for(int i=0;i<str.length();i++)
       {
        for(int j=i+1;j<=str.length();j++)
        {
          if(isPallindrome(str.substring(i,j)) == true)  
          { 
          System.out.println(str.substring(i,j) + " ");
          count++; 
          }
        }
       }

        System.out.println("The number of Pallindromic substring is " + count);
    }
}