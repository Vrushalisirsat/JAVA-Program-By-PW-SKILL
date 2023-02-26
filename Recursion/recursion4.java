// Q.1 Given a number num and a value k.Print k multiples of num.
//Time complexity : O(k)  , Space complexity : O(k)  
/*
import java.util.*;
class recursion4
{
    static void printMultiple(int num,int k)        // 5,4
    {
        // base case
        if(k == 0)
        {
            return;
        }
        //recursive work
        printMultiple(num,k-1);   //5,10,15
        //self work
        System.out.print(num*k + " ");     //20
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num and k : ");
        int num = sc.nextInt();
        int k = sc.nextInt();
        printMultiple(num,k);
    }
}


// Q.2 Given a number n.find the sum of natural numbers till n.
//Time complexity : O(n)  , Space complexity : O(n)  

import java.util.*;
class recursion4
{
    static int seriesSum(int n)        
    {
        // base case
        if(n == 0)
        {
            return 0;
        }
        //recursive work
        return seriesSum(n-1) + n;   
  
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
*/

// Q.3 Given a number n.find the sum of natural numbers till n but with alternate sign.
//Time complexity : O(n)  , Space complexity : O(n)  

import java.util.*;
class recursion4
{
    static int seriesSum(int n)        
    {
        // base case
        if(n == 0)
        {
            return 0;
        }

        if(n%2 == 0)         //if n is even
        { 
             return seriesSum(n-1) - n;    
        }
        else                // if n is odd
        {
        return seriesSum(n-1) + n;      
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }
}