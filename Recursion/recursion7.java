// Q1 - Given a number n. Print if it is an armstrong number or not.
// An armstrong number is a number if the sum of every digit in that number raised to the power of total digits in that number is equal to the number.
// Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number.
/*
import java.util.*;
class recursion7
{
    static int power(int a,int b)
    {
        if(b==0)
        return 1;

        if(b%2==0)
        return power(a,b/2)*power(a,b/2);

        return a*power(a,b/2)*power(a,b/2);
    }

    static int isArmstrong(int n,int digit)
    {
        if(n==0)
        {
            return 0;
        }

        return power(n%10,digit) + isArmstrong(n/10,digit);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();

        int digit=0;
        int temp=n;
        while(temp > 0)
        {
            digit++;
            temp/=10;
        }

        if(n == isArmstrong(n,digit))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}


// Q.2 - Given two number x and y find product using recursion.
// Input1 : x = 5, y = 2
// Output1 : 10

import java.util.*;
class recursion7
{
    static int product(int x,int y)
    {
         // if x is less than y swap the numbers
        if(x < y)
        {
            return product(y,x);
        } 
         // iteratively calculate y times sum of x
        else if(y != 0){
            return x + product(x,y-1);
        }
         // if any of the two numbers is zero return zero
        else{
            return 0;
        }
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x & y : ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(product(x,y));
    }
}



// Q3 - Given a number n, check whether it's a prime number or not using recursion. (Easy)
// Input: n = 11
// Output: Yes

import java.util.*;
class recursion7
{
    static boolean isPrime(int n,int i)
    {
         if(n <= 2)
         return (n == 2)?true:false;

         if(n%2 == 0)
         return false;

         if(i*i > n)
         return true;

         return isPrime(n,i+1);
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x=sc.nextInt();
        
    
    if(isPrime(x,2))
    {
      System.out.println(true);
    }
    else{
        System.out.println(false);
    }
        
    }
}


// Q4 - Given a decimal number as input, we need to write a program to convert the given decimal number into its equivalent binary number.
// Input1 : 7
// Output1 : 111



//Method-1:

import java.util.*;
class recursion7
{
    static int convertBin(int n)
    {
         if(n == 0)
         {
            return 0;
         }
         else{
        return (n%2 + 10 * convertBin(n/2));
         }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal Number : ");
        int dNum=sc.nextInt();
        
       System.out.println(convertBin(dNum));
        
    }
}



//Method-2 :

import java.util.*;
class recursion7
{
    static void convertBin(int n)
    {
         if(n == 1)
         {
            System.out.print(1);
         }
        else{
        convertBin(n/2);
        System.out.print(n%2);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal Number : ");
        int dNum=sc.nextInt();
        
       convertBin(dNum);
        
    }
}

*/

// Q.5 - Given the Binary code of a number as a decimal number, we need to convert this into its equivalent Gray Code. In gray code, only one bit is changed in 2 consecutive numbers.
// Input: 1001
// Expected Output: 1101

import java.util.*;
class recursion7
{
    public static int binary_to_gray(int n, int i) {
                int a, b;
                int result = 0;
                if (n != 0) {
                        // Taking last digit
                        a = n % 10;
                        n = n / 10;
                        // Taking second last digit
                        b = n % 10;
                        if ((a & ~b) == 1 || (~a & b) == 1) {
                                result = (int)(result + Math.pow(10, i));
                        }
                        return binary_to_gray(n, ++i) + result;
                }
                return 0;
        }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number n: ");
        int n = sc.nextInt();
        System.out.println(binary_to_gray(n, 0));
        
    }
}