// Brute Force Approach -> to find : GCD of 2 numbers.
// Time complexity : O(gcd(n,m)) ~ O(n) ---->bcoz maximun we are doing n division.
/*
import java.util.*;
class recursion6
{
     public static void gcd(int n, int m) {
                for(int i=n;i>=1;i--)
                {
                    if(n%i==0 && m%i==0)
                    {
                        System.out.println(i);
                        return;
                    }
                }
    }
         
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n and m: ");
                int n = sc.nextInt();
                int m = sc.nextInt();
                gcd(n, m);
    }
}

// Method-2 : Best Approach ->To find GCD Of 2 number.

import java.util.*;
class recursion6
{
     public static int iterativeGCD(int x, int y) {
                while(x%y != 0)
                {
                   int rem=x%y;
                    x=y;
                    y=rem;
                }
                return y;
    }
         
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n and m: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(iterativeGCD(x,y));
    }
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------------

// Lecture 31 :- Recursion Question -4

//Q.1 WAP to find GCD of 2 numbers using recursion
// 'Euclid's Algorithm' to find GCD. --> GCD(x,y)=GCD(y,x%y) and GCD(x,0)=x

import java.util.*;
class recursion6
{
    static int GCD(int x, int y) {
               if(y==0)
               {
                return x;
               }

               return GCD(y,x%y);
     }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n and m: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(GCD(x,y));
    }
}

*/

//Q.2 WAP to find LCM of 2 numbers using recursion
// -> lcm * gcd = num1 * num2
// -> lcm = num1 * num2 / gcd.

import java.util.*;
class recursion6
{
    static int GCD(int x, int y) {
               if(y==0)
               {
                return x;
               }

      return GCD(y,x%y);
               
     }

     static int LCM(int x,int y)
     {
        int gcd = GCD(x,y);
        return x*y / gcd;
     }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n and m: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(LCM(x,y));
    }
}
