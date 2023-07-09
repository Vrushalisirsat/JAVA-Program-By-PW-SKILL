// StringBuilder :- used to use string mutable(change) function use.
import java.util.*;
class stringBuilder
{
    public static void main(String args[])
    {
        /*
       StringBuilder str1 = new StringBuilder("yash");
       System.out.println(str1);
       str1.append("badmas");       //  append/concat 2 string
       System.out.println(str1);

       // setCharAt(index,ch) :- to set new char at particular index
       str1.setCharAt(0,'L');
        System.out.println(str1);
        
        // insert(index,ch) :- insert some char at particular index
        str1.insert(0,"Kai");
        System.out.println(str1);

       // delete() :- delete string from particular index
       str1.delete(3,'L');
        System.out.println(str1);

         // deleteCharAt() :- delete particular char in string
       str1.deleteCharAt(1);
        System.out.println(str1);

*/
//---------------------------------------------------------------------------------------------------------------------------

    // reverse :- to reverse a string
    StringBuilder str = new StringBuilder("Vrushali");
    System.out.println(str.reverse());  


    // delete(i,j) :- 
    str.delete(2,4);
    System.out.println(str);

//-------------------------------------------------------------------------------------------------------------------------
    


    }
}