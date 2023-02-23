//Lecture-29 :-> Problem Solving on Recursion-2 :-

// Q.1 Given an integer,find out the sum of its digits using recursion.
//Time complexity : O(d)  , Space complexity : O(d)---d is no of digit for callstack of space complexity
/*
import java.util.*;
class recursion3
{
    static int sumOfDigits(int n)
    {
      //base case
      if(n >=0 && n <=9)
      {
        return n;
      }
      // recursive work
      return sumOfDigits(n/10) + (n%10);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(sumOfDigits(n));
    }
}

//Q.2 Return the count of digits in a given number n.
//Time complexity : O(d)  , Space complexity : O(d)   -----> 'd' is number of digit

import java.util.*;
class recursion3
{
    static int countOfDigits(int n)
    {
      //base case
      if(n >=0 && n <=9)
      {
        return 1;
      }
      // recursive work
      return countOfDigits(n/10) + 1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(countOfDigits(n));
    }
}


// Q.3 Given two numbers p & q,find the value p^q using a recursive function.
//Time complexity : O(q)  , Space complexity : O(q)  
// Method-1 : O(q) time complexity
import java.util.*;
class recursion3
{
    static int power(int p,int q)
    {
      //base case
      if(q==0)
      {
        return 1;
      }
      
      // recursive work : power(p,q-1) & self work : recursive work * p
      return power(p,q-1) * p;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p & q : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println(power(p,q));
    }
}

*/

// Method-2 : O(log(q)) time complexity
//better time complexity than above code

import java.util.*;
class recursion3
{
    static int power(int p,int q)
    {
      //base case
      if(q==0)
      {
        return 1;
      }
      
      int smallPow = power(p,q/2);
      if(q%2 == 0)    // q is even
      {
        return smallPow * smallPow;
      }
      else    // q is odd
      {
        return smallPow * smallPow * p;
      }
    }
     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p & q : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println(power(p,q));
    }
}