// substring(i,j) :- it is a continuous part of a string
// str = "abc"  --> substring => a,ab,abc,b,bc,c

/*
import java.util.*;
class substring
{
    public static void main(String args[])
    {
       String str = "vrushali";
       System.out.println(str.substring(1,4));         //substring(i,j)
       System.out.println(str.substring(3));         //substring(i)

    }
}

*/

// Q.1 Print all substring of a given string
import java.util.*;
class substring
{
    public static void main(String args[])
    {
       String str = "abc";
       for(int i=0;i<=str.length()-1;i++)
       {
        for(int j=i+1;j<=str.length();j++)
        {
          System.out.println(str.substring(i,j));     
        }
       }
          
      

    }
}