/*
Q4 - Write a Java method to find the smallest number among three numbers.

Input1 : 25
37
29
Output1 : 25

*/

import java.util.*;
class smallNo
{
    static int printSmallEle(int a,int b,int c)
    {
        if(a < b && a < c)
        {
            return a;
        }
        else if(b < a && b < c)
        {
            return b;
        }
        else{
            return c;
        }

       
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("Smalllest Of 3 numbers : " + printSmallEle(n1,n2,n3));
    }
}