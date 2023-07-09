// Interning and new :- 

// Interning in string :- s1 = "hello" & s2 = "hello" --> both string are same in heap and memory stack  --->bcoz of same string with differnt name.
// use to save space in memory

import java.util.*;
class stringcharint
{
    public static void main(String args[])
    {
       // Interning in string :- s1 = "hello" & s2 = "hello" --> both string are same in heap and memory stack  --->bcoz of same string with differnt name.
       // use to save space in memory
       String str1 = "yash";
       String str2 ="nandi";

       // new :- create new space in memory the we can use "new" keyword
       // here both are different string
       String str = new String("Hello");
        String str1 = new String("Hello");
      

       String s1 = "yash";
       String s2 =s1 + " " + 89;
       System.out.println(s2);
    }
}