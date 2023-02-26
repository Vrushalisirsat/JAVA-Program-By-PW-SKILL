// Problems based on Recursion - 3 : Assignment Questions

// Q1 - Given a number n, print the following pattern without using any loop.
/*
import java.util.*;
class recursion5
{
    static void printSeries(int n,int m,boolean flag)        
    {
        System.out.print(m + " ");
        // If we are moving back towards n and we have reached there, then we are done
        if(n==m && flag==false)
        {
            return;
        }

        if(flag)
        {
             // If m is greater, then 5, recur with true flag
            if(m - 5 > 0)
            {
                printSeries(n,m-5,true);
            }
            else{  
                // recur with false flag
                printSeries(n,m-5,false);
            }
        }
        else{
            // If flag is false.
            printSeries(n,m+5,false);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        //System.out.println(printSeries(n));
        printSeries(n,n,true);
    }
}

*/

// Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural numbers is defined as following:
//  If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//  Else :SUM(n, 1) = Sum of first n natural numbers.

import java.util.*;
class recursion5
{
     public static int rec(int n, int m) {
                if (m == 1)
                        return sumofn(n);
 
                int sum = rec(n, m - 1);
                return sumofn(sum);
        }
        public static int sumofn(int n){
                int ans = 0;
                if(n == 1){
                        ans++;
                        return ans;
                }
                ans += n + sumofn(n-1);
                return ans;
        }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number n and m: ");
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.println(rec(n, m));
    }
}