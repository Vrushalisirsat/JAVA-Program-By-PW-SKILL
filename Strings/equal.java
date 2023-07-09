import java.util.*;
class equal
{
    public static void main(String args[])
    {
       String str1 = "yash";
       String str2 ="yash";
       String str3 = new String("yash");
       System.out.println(str1 == str2);   //true
       System.out.println(str1 == str3);    //false ---->bcoz of new keyword
        System.out.println(str1.equals(str2));   //true
       System.out.println(str1.equals(str3));    //true 
       //System.out.println(str1 == str2);

      
    }
}