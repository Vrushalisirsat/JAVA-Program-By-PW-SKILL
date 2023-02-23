// Lecture-28 :-> Problem Solving on Recursion-1 :-

// Q.1 Find the value of factorial n.
/*
import java.util.*;
class recursion2
{
    static int factorial(int n)
    {
        // base case
        if(n == 0)
        {
            return 1;
        }
           
        // smaller problem - recursive work
        int smallans = factorial(n-1);

        // big/final answer - self work
        int ans = n *smallans;         // Recurrence Relation
        return ans;

        //or
        //int ans = n * factorial(n-1);         // Recurrence Relation
        //return ans;

        //OR
        // return n * factorial(n-1);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}

*/

// Q.2 program to find nth fibonacci number.

import java.util.*;
class recursion2
{
    static int fibonacci(int n)
    {
        // base case
        if(n == 0 || n == 1)
        {
            return n;
        }

           
        int fib = fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}