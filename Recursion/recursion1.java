// Recursion : A function calling itself with different parameter  & a base case to terminate the infinite loop called as Recursion / Recursive function.
// In Recursion, we solve a bigger problem by solving smaller subproblems.
// Function :- problems-PI(n);
//             subproblem-PI(n-1);
// A function calls itself to solve its subproblem.

/*
// Q.1 WAP to print all natural numbers from 1 to n using recursion.

import java.util.*;
class recursion1
{
    static void printIncreasing(int n)
    {
        if(n == 1)                  // base condition or halting condition
        {
            System.out.println(n);
            return;
        }
       
        printIncreasing(n-1);               // function call itself / smaller subproblem
        System.out.println(n);              // selfwork
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of n : ");
       int n = sc.nextInt();

       printIncreasing(n);
    }
}
*/

// Q.1 WAP to print all natural numbers from n to 1 using recursion.

import java.util.*;
class recursion1
{
    static void printDecreasing(int n)
    {
        if(n == 1)                  // base condition or halting condition
        {
            System.out.println(1);
            return;
        }
       
        System.out.println(n);              // selfwork
        printDecreasing(n-1);               // function call itself / smaller subproblem
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of n : ");
       int n = sc.nextInt();

       printDecreasing(n);
    }
}